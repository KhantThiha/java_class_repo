package day3.intermediate;

import java.util.Scanner;

public class Palindrome {
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
        System.out.println(isPalindrome(input));
    }
    
    public static boolean isPalindrome(String str){
        if(str.isEmpty() || str.length()==1){
            return true;
        }
        if(!str.endsWith(""+str.charAt(0))){
            return false;
        }
        
        return isPalindrome(str.substring(1,str.length()-1));
    }
}
