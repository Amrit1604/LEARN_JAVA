package PRACTICE_QUES;

import java.util.Scanner;

public class switchCase {

    public static void ques1() {
        System.out.println("Enter month number (1-12): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Monsoon");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }

    public static void ques2() {
        
        System.out.println("Enter day number (1-7): ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
        }

    

    // write a program which converts a given amount to INR to another currency based on user choice
    // 1. USD
    // 2. EUR

    // 1 USD = 86.55 INR
    // 1 EUR = 89.18 INR


    public static void ques3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in INR: ");

        double am = sc.nextDouble();

        System.out.println("Enter currency to convert to: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");

        int choice = sc.nextInt();
        double convert = 0;

        switch (choice) {
            case 1:
                convert = am / 86.55;
                break;
            case 2:
                convert = am / 89.18;
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.printf("Converted amount: %.2f%n", convert);
        sc.close();
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ques1(); 
        ques2(); 
        ques3();
        ques4();

        sc.close();
        
    }
}
