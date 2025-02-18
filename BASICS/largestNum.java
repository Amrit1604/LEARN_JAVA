package BASICS;
import java.util.Scanner;
public class largestNum {
    public static void main(String[] args) {
        // int a = 10, b = 20, c = 30;
        // if (a > b && a > c) {
        //     System.out.println("a is the largest number");
        // } else if (b > a && b > c) {
        //     System.out.println("b is the largest number");
        // } else {
        //     System.out.println("c is the largest number");
        // }

        // ........... ORRR ...............
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest number is: "+max);


    }
}
