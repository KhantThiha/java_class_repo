package day2_assignment.ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number:");
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
        System.out.println("Sum using for loop:"+ SumOfNaturalNumbers.sumUsingForLoop(num));
        System.out.println("Sum using whilee loop:"+ SumOfNaturalNumbers.sumUsingForLoop(num));
    }
}
