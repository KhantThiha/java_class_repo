package assignment4.advance;


public class Main {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.setName("Gi Gi");
        person1.setAge(18);

        Animal animal=new Dog();
        animal.makesound();

        Shape circle1= new Circle();
        circle1.draw();
        Shape square= new Square();
        square.draw();
    }
    
}
