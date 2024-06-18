package day3.intermediate;

import java.util.Scanner;

public class PowerOfNumber {
    public static double current=1;
    public static void main(String[] args) {
        double base;int exponent;
        try (
        Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Please enter a base: ");
                if (scanner.hasNextDouble()) {
                    base = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("That's not a valid number. Try again.");
                    scanner.next();
                }
            }
            while (true) {    
                System.out.print("Please enter a exponent: ");
                if (scanner.hasNextInt()) {
                    exponent = scanner.nextInt();
                    break;
                } else {
                    System.out.println("That's not a valid integer. Try again.");
                    scanner.next();
                }
            }
        }
        System.out.println(power(base, exponent));
    }
    public static double power(double base,int exponent){
        
        if(exponent<1){
            return current;
        }
        current*=base;
        return power(base,exponent-1);
    }
}
