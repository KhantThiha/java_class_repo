package day3.intermediate;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        String input;
        try (
        Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Please enter a string: ");
                if (scanner.hasNext()) {
                    input = scanner.next();
                    break;
                } else {
                    System.out.println("Please Enter valid string.");
                    scanner.next();
                }
            }
            
            System.out.println(ToInt(input));
        }
        
    }
    public static int ToInt(String str){
        if (str.length() == 1){
            return (str.charAt(0) - '0');
        }
        double y = ToInt(str.substring(1));
        double x = str.charAt(0) - '0';
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int) x;
    }
}
