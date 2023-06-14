/*
 A program that will help kids learn divisibly test of numbers of integers. 
 The program should check whether the given integer
is divisible by integers in the range of 0-9. 
For example, if a number (955) is divisible by five, 
the program should print, the number is divisible by 5 because it ends with a 5,
and 900 is divisible by 5 because it ends with a 0(zero).
 */

 import java.util.Scanner;

 public class Question4 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Prompt for the number
         System.out.print("Enter an integer: ");
         int number = scanner.nextInt();
 
         // Check divisibility by integers in the range of 0-9
         for (int i = 0; i <= 9; i++) {
             if (i == 0) {
                 if (number == 0) {
                     System.out.println("The number is divisible by 0 because it is 0.");
                 } else if (number % 10 == 0) {
                     System.out.println("The number is divisible by 10 because it ends with a 0 (zero).");
                 }
             } else {
                 if (number % i == 0) {
                     System.out.println("The number is divisible by " + i + ".");
                 }
             }
         }
 
         // Close the scanner
         scanner.close();
     }
 }
 