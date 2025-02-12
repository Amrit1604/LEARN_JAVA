package PRACTICE_QUES;

import java.util.Scanner;

public class String1 {


    // STRING BUIDER AND BUFFER

    // First builder method ==  It is not thread safe and also less time consuming
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        nString reversed = new StringBuilder(input);
        System.out.println("Reversed string using StringBuilder: " + reversed.reverse());
        sc.close();
    }

    // Second Buffer Method == It is multithread and thread safe more time consuming
    public static class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter another string:");
            String input = sc.nextLine();
            StringBuffer reversed = new StringBuffer(input);
            System.out.println("Reversed string using StringBuffer: " + reversed.reverse());
            sc.close();
        }
    }
}
