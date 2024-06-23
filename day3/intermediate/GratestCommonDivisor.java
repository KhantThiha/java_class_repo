package day3.intermediate;

import java.util.Scanner;

public class GratestCommonDivisor {
    static int divisor=2;
    public static void main(String[] args) {
        int first,second;
        try (
        Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Please enter First Number: ");
                if (scanner.hasNextInt()) {
                    first = scanner.nextInt();
                    break;
                } else {
                    System.out.println("That's not a valid number. Try again.");
                    scanner.next();
                }
            }
            while (true) {    
                System.out.print("Please enter Second Number: ");
                if (scanner.hasNextInt()) {
                    second = scanner.nextInt();
                    break;
                } else {
                    System.out.println("That's not a valid integer. Try again.");
                    scanner.next();
                }
            }
        }
        System.out.println("GCD is :"+gcd(first,second));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>=b){
            return gcd(b,a%b);
        }
        if(a<=b){
            return gcd(a,b%a);
        }
        return 1;
    }
}
