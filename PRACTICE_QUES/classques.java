package PRACTICE_QUES;

import java.util.Scanner;

public class classques {

    // Write a java program which generates the number of days in a given month of a given year in a tabular format. The program should take 
    // 1. Take year and month as input from the user
    // 2. Use switch case to determine the number of days in the month
    // 3. Include a check for leap years (for February)
    // 4. Display the number of days in the month
    // 5. Display Sun, mon , tues etc etc
    // 6. Display in a calender format


     static void ques1(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month!");
                return;
        }

        System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if (i % 7 == 0) { 
                System.out.println();
            }
        }
        sc.close();
        }



        // Write a java program to print all permutation of a string 
        //input abc 
        //output abc, acb, bac, bca, cab, cba
        
        static void ques2(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.next();
            sc.close();
            permute(str, 0, str.length() - 1);
        }
        

        // without using permute

        static void permute(String str, int l, int r) {
            if (l == r) {
                System.out.println(str);
            } else {
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    permute(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }




    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ques1(args);
        sc.close();

    }
}
