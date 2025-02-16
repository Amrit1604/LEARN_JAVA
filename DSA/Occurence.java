package DSA;
import java.util.Scanner;


public class Occurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the digit to find occurrence: ");
        int digit = sc.nextInt();
        
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == digit){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Occurrence of " + digit + " is: " + count);
        
        sc.close();
    }
}



