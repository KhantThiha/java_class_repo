[TOC]
[toc]
# Code Reusability

**Inheritance** offer an ability to inherit parts of the members and method from **super class** to **sub class**. And thus, developers can access its members, including variables, methods, and constructors, without having to rewrite them. This make efficient, reduces redundancy in coding process.

```java
public class Animal {
    public void makesound(){
        System.out.println("make sound");
    }
}
public class Dog extends Animal{
    
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog,makesound();
    }
}
```

 When using inheritance, it is note worthy to consider relation of super class and sub class to avoid the pitfall of high coupling of classes. Thus it's necessary to follow the **“is-a” Relationship** rule. For example, a `Dog` is a type of `Animal`, making it an appropriate use case for inheritance.

## Favor Composition over Inheritance

**Composition** is implemented when objects have **“has-a” Relationship**. Both **composition** and **inheritance** promote code reuse through different approaches. But why composition should be choose over inheritance in most cases. Here are the reasons

1. Inheritance is tightly coupled whereas composition is loosely coupled.

   ```java
   public class Library {
       public void borrow(){
           
       }
   }
   public class Book extends Library{
       public String name;
       public String borrow(){
           return this.name;
       }
   }
   ```

   Here, while using inheritance, The return type is incompatible issue happen. We are borrowing book from `Library`. But what we borrow is a `Book` nonetheless. Name is needed to store in a borrow-list of some kind. We can avoid those issue by using **Composition**.

   ```java
   public class Library {
       public void borrow(){
           
       }
   }
   public class Book{
       public String name;
       private Library library;
   
       public Book(String name, Library library) {
           this.name = name;
           this.library = library;
       }
       public String borrow(){
           library.borrow();
           return this.name;
       }
   }
   public class Main {
       public static void main(String[] args) {
           private List<String> borrowedBooks = new ArrayList<>();
           Library library = new Library();
           Book book = new Book("The Great River", library);
           borrowedBooks.add(book.borrow())
       }
   }
   ```

2. There is no access control in inheritance whereas access can be restricted in composition.

   ```java
   public class Library {
       public void returnBook(){
           
       }
   }
   public class Book{
       public String name;
       private Library library;
   
       public void returnBook(){
           library.returnBook();
       }
   }
   ```

   By doing this, `Book` cannot access to other `Library` functions unrelated to it.



------

# Polymorphism

The word **Polymorphism** mean many forms. It allow the objects to take many form. Polymorphism allows coders to write code that can work with objects of multiple classes in a generic way without interfering each other.

```java
public class Animal {
    public void makesound(){
        System.out.println("make sound");
    }
}
public class Dog extends Animal{
    public void makesound(){
        System.out.println("woof woof");
    }
}
public class Cat extends Animal{
    public void makesound(){
        System.out.println("meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound();
        Animal animal2 = new Cat();
        animal2.makeSound();
    }
}
```



------

## Types of Polymorphism

Java have two types of polymorphism, compile-time and runtime.

#### Compile-Time Polymorphism

It allow defining **multiple methods** with the **same name** but **different parameters**.

##### Method Overloading

In method **overloading**, the methods with the same name can have **different numbers** of parameters, **different types** of parameters, or **different order** of parameters in methods. 

```java
public class Math {
    public int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public int multiply(int a, int b,int c){
        return a*b*c;
    }
}
```

#### Run-Time Polymorphism

This process handles the call to an overridden method dynamically during runtime.

##### Method Overriding

In method **Overriding**, the method in the **subclass overrides** the method in the **superclass**, which has the **same** name, parameters, and return type.

```java
public class Animal {
    public void makesound(){
        System.out.println("make sound");
    }
}
public class Dog extends Animal{
	@Override
    public void makesound(){
        System.out.println("woof woof");
    }
}
```



## Difference Between Compile-time and Run-time Polymorphism

| **Compile-time Polymorphism**                                | **Run time Polymorphism**                                    |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Method overloading                                           | Method overriding                                            |
| Must differ in number or types of parameters                 | Must have the same name, number, and types of parameters as the method it overrides |
| Multiple methods with the same name but different parameters | A subclass providing its own implementation of a method that is already defined in its superclass |

