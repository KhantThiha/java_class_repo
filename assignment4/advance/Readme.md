## Encapsulation

Imagine you had a class with some pretty important variables and they were set (by other programmers from their code) to unacceptable values. Their code brought errors in your code. As a solution, you allow the variables to be modified only through methods. Hiding the variables of an object and providing all interaction through an objects methods is known as Data Encapsulation. 

### Encapsulation to maintain invariants

**Invariants** is a property of the program state that is always true. A function or method that ensures that the invariant holds is said to maintain the invariant. Encapsulation helps maintain these invariants by filtering with conditional statement to the instance variables through **getter** and **setter** methods.

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
        	this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
```

##  Encapsulation to reduce coupling

**Coupling** can be understood as how one class is **connect** to another and **changes** in one class can **affect** to another. Highly coupled classes will result in changes in one class bring necessities to change in another. **Minimizing coupling** means ensuring **isolation** of one component from another and managing impact of changes to an acceptable level in order to prevent it from propagating uncontrollably.

```java
public class Person {
    private String FirstName;
    private String LastName;

    public String getName() {
        return firstName + " " + lastName;
    }
    public void setFirstName(String FirstName) {
        this.Firstname = Firstname;
    }
    public void setLastName(String LastName) {
        this.name = Lastname;
    }
}
```

In this example , we decide to change the internal representation of the `Person` class by splitting the `name` field into `FirstName` and `LastName`.  Due to Encapsulation, it allows you to make internal changes to a class without affecting any code that calls the `getName`method.

