package assignment5.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second){
        if ((hour <= 23 && hour >=0) && (minute <= 59 && minute >=0) && (second <= 59 &&second >=0)) {
        	this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }
    public void setHour(int hour) {
        if (hour <= 23 && hour >=0) {
            this.hour = hour;
        }else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }
    public void setMinute(int minute) {   
        if (minute <= 59 && minute >=0) {
            this.minute = minute;
        }else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }
    public void setSecond(int second) {
        if (second <= 59 &&second >=0) {
            this.second = second;
        }else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
        
    }
    public String toString(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String nextSecond(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusSeconds(1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String nextMinute(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusMinutes(1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String nextHour(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusHours(1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String previousSecond(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusSeconds(-1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String previousMinute(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusMinutes(-1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
    public String previousHour(){
        LocalTime myTime = LocalTime.of(hour, minute, second);
        myTime = myTime.plusHours(-1); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myTime.format(formatter);
    }
}
