## Instances

A **Class** can be refer as a template or blue-print of **Objects ** that developer will create for their need. A Class can have members such as variables, functions. Those are **instance members**. Their values will not be shared between different objects of the same class.

```java
public class Car {
    private String brand; //instance members

    public void setBrand(String brand){
        this.brand = brand;
    }
}
class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setBrand("Toyota");
    }
}
```



## what is static?

**Static** keyword can be apply to

*   Variables
*   Method/Function
*   Classes (nested class)

when a **static** is declare, the variable or method belong to the class itself instead of an instance of the class.  Thus, we can call static members directly without needing to create an object. And static members are shared between objects of the same Class.

```java
public class Car {
    public static int wheel=4; //static member
    
    public static void setWheel(int wheel){
        Car.wheel = wheel;
    }
}
class Main {
    public static void main(String[] args) {
        Car.setWheel(3);
        System.out.println(Car.wheel);
    }
}
```

> [!WARNING]
>
> Since static variables are shared between different objects. you can still access them from object. But it is still recommended to access via Class.
>
> ```java
> Car car1= new Car();
> System.out.println(car1.wheel);//warning in IDE
> System.out.println(Car.wheel);//okay
> ```

> [!CAUTION]
>
> Static methods can’t access instance variables and instance methods. 
>
> ```java
> public static void setWheel(int wheel){
>         Car.wheel = wheel;//okay
>         this.wheel=wheel; //error
> }
> ```



## Static versus instance methods

| **Static**                                                   | Instance                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Static methods can access the static variables and static methods directly. | Instance methods on the other hand can access instance variables and instance methods directly. |
| Static methods can’t access instance variables and instance methods. | Instance methods can access static variables and static methods directly. |
| “this” operator cannot be used by static methods             | Instance methods can use “this” operator.                    |





