package assignment5.Time;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1=new MyTime(23, 59, 59);
        System.out.println(t1);

        System.out.println("next second:"+t1.nextSecond());
        System.out.println("next minute:"+t1.nextMinute());
        System.out.println("next hour:"+t1.nextHour());
    }
}
