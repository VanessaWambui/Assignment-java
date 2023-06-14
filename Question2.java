/*
 Java program to ask student to enter the marks
of the five units they did last semester, 
compute the average and display it on the screen.
 */

 import java.util.Scanner;

 public class Question2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Prompt for marks
         System.out.println("Enter the marks for five units:");
 
         // Read marks for each unit
         double totalMarks = 0;
         for (int i = 1; i <= 5; i++) {
             System.out.print("Unit " + i + ": ");
             double marks = scanner.nextDouble();
             totalMarks += marks;
         }
 
         // Calculate average
         double average = totalMarks / 5;
 
         // Display the average with two decimal places
         System.out.printf("Average marks: %.2f%n", average);
 
         // Close the scanner
         scanner.close();
     }
 }
 