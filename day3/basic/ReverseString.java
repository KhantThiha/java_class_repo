package day3.basic;

import java.util.Scanner;

public class ReverseString {
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
        }
        String output=reverseString(input);
        System.out.println("Reverse Output : "+output);
    }
    
    public static String reverseString(String str){
        if(str.isEmpty() || str.length()==1){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
  
}
