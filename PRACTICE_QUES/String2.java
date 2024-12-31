package PRACTICE_QUES;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String z = sc.nextLine(); // Read user input

        // Split the input string into words
        String[] z1 = z.split(" ");
        int start = 0;
        int end = z1.length - 1;

        // Reverse the words in the array
        while (start < end) {
            String temp = z1[end];
            z1[end] = z1[start];
            z1[start] = temp;
            start++;
            end--;
        }

        // Join the reversed words into a single string
        String res = String.join(" ", z1);
        System.out.println("Reversed sentence: " + res);

        sc.close(); // Close the Scanner
    }
}
