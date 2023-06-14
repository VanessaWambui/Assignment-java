/*
A Java program that asks the user 
to enter their cuurent age and surname
then print the number of characters of their surname
and even or odd depending on their age number. 
 */

 import java.util.Scanner;

 public class Question1 {
     
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Prompt for surname
         System.out.print("Enter your surname: ");
         String surname = scanner.nextLine();
 
         // Prompt for age
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
 
         // Calculate the number of characters in the surname
         int surnameLength = surname.length();
 
         // Determine if the age is even or odd
         String ageType = (age % 2 == 0) ? "even" : "odd";
 
         // Print the results
         System.out.println("The number of characters in your surname is " + surnameLength + ".");
         System.out.println("Your current age is an " + ageType + " number.");
 
         // Close the scanner
         scanner.close();
         
     }
 }
 