package PRACTICE_QUES;

import java.util.*;


// happy num or not


public class happyNum {
    static void ques1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = num;
        
        while (sum != 1 && sum != 4) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem;
                temp /= 10;
            }
        }
        
        if (sum == 1) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
        sc.close();
    }

    public static void main(String[] args) {
        ques1();
    }
}
