/*
 A Java program to display all the multiples of 2, 3 and 7 within the range 71 to 150
 */

 public class Question3 {
    public static void main(String[] args) {
        int start = 71;
        int end = 150;

        System.out.println("Multiples of 2, 3, and 7 within the range of " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}