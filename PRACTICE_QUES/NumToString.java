package PRACTICE_QUES;

import java.util.Scanner;

public class NumToString {

    public static void ques4(Scanner sc) {
        System.out.print("Enter a number (0-9999): ");
        if (sc.hasNextInt()) { 
            int number = sc.nextInt();
            if (number < 0 || number > 9999) {
                System.out.println("Number out of range. Please enter a number between 0 and 9999.");
            } else {
                System.out.println("In words: " + convertToWords(number));
                
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.println("Or enter the num between");
        }
        sc.nextLine(); // Consume leftover newline




    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }


        nString words = new StringBuilder();

        
        int thousand = number / 1000;
        number %= 1000;


        switch (thousand) {
            case 1 -> words.append("One Thousand ");
            case 2 -> words.append("Two Thousand ");
            case 3 -> words.append("Three Thousand ");
            case 4 -> words.append("Four Thousand ");
            case 5 -> words.append("Five Thousand ");
            case 6 -> words.append("Six Thousand ");
            case 7 -> words.append("Seven Thousand ");
            case 8 -> words.append("Eight Thousand ");
            case 9 -> words.append("Nine Thousand ");
        }

        

        // Extract hundreds
        int hundred = number / 100;
        number %= 100;

        switch (hundred) {
            case 1 -> words.append("One Hundred ");
            case 2 -> words.append("Two Hundred ");
            case 3 -> words.append("Three Hundred ");
            case 4 -> words.append("Four Hundred ");
            case 5 -> words.append("Five Hundred ");
            case 6 -> words.append("Six Hundred ");
            case 7 -> words.append("Seven Hundred ");
            case 8 -> words.append("Eight Hundred ");
            case 9 -> words.append("Nine Hundred ");
        }

        // Handle tens and teens
        if (number >= 10 && number < 20) {
            switch (number) {
                case 10 -> words.append("Ten ");
                case 11 -> words.append("Eleven ");
                case 12 -> words.append("Twelve ");
                case 13 -> words.append("Thirteen ");
                case 14 -> words.append("Fourteen ");
                case 15 -> words.append("Fifteen ");
                case 16 -> words.append("Sixteen ");
                case 17 -> words.append("Seventeen ");
                case 18 -> words.append("Eighteen ");
                case 19 -> words.append("Nineteen ");
            }
        } else {
            int tens = number / 10;
            number %= 10;

            switch (tens) {
                case 2 -> words.append("Twenty ");
                case 3 -> words.append("Thirty ");
                case 4 -> words.append("Forty ");
                case 5 -> words.append("Fifty ");
                case 6 -> words.append("Sixty ");
                case 7 -> words.append("Seventy ");
                case 8 -> words.append("Eighty ");
                case 9 -> words.append("Ninety ");
            }

            // Handle units
            switch (number) {
                case 1 -> words.append("One ");
                case 2 -> words.append("Two ");
                case 3 -> words.append("Three ");
                case 4 -> words.append("Four ");
                case 5 -> words.append("Five ");
                case 6 -> words.append("Six ");
                case 7 -> words.append("Seven ");
                case 8 -> words.append("Eight ");
                case 9 -> words.append("Nine ");
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ques4(sc);
        sc.close();
    }
}
