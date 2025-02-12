package BASICS.oops;

import java.util.Scanner;

public class highestAscii {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String[] words = str.split(" ");
        

        int maxA = 0;
        String maxW = "";

        for (String word : words) {
            int asciiSum = 0;

            for (char ch : word.toCharArray()) {
                asciiSum += ch;
            }

            System.out.println(word + " : " + asciiSum);

            if (asciiSum > maxA) {
                maxA = asciiSum;
                maxW = word;
            }
        }

        

        System.out.println("Word with highest ASCII value: " + maxW);
    }
}
