package day3.basic;

import java.util.Scanner;

public class SumOfDigits {
    public static int answer=0;
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
        recursive(num);
        System.out.println("Sum of Digits : "+answer);
    }
    public static int recursive(int num){
        if(num<10){
            answer+=num;
            return num;
        }
        answer+=num%10;
        return recursive(num/10);
    }
}
