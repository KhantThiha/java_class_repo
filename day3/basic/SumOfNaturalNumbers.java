package day3.basic;

import java.util.Scanner;

public class SumOfNaturalNumbers {
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
        ;
        System.out.println("Sum is : "+recursion(num));
    }
    public static int recursion(int num){
        if(num>1){
            return num+recursion(num-1);
        }
        return 1;
    }
}
