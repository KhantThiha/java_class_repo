package day3.basic;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num;
        
        try (
        Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Please enter an integer: ");
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    break;
                } else {
                    System.out.println("That's not a valid integer. Try again.");
                    scanner.next();
                }
            }
        }
        System.out.println("Answer : "+Fibonacci(num));
    }
    public static int Fibonacci(int n){
        if(n==2){
            return 1;
        }
        return Fibonacci(n-1)+ Fibonacci(n-2);
    }
}
