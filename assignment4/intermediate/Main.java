package assignment4.intermediate;

public class Main {

    public static void main(String[] args) {
        Counter c1=new Counter();
        c1.incrementCount();
        c1.incrementCount();
        System.out.println(Counter.count);
        Counter c2=new Counter();
        c2.incrementCount();
        Counter c3=new Counter();
        c3.incrementCount();
        System.out.println(Counter.count);
    }
}
