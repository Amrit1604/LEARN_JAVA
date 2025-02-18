package DSA;
import java.util.Scanner;

public class Return{

    static int sum(){  // function to take input and return the sum of two numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = a+b;
        return sum1;   // return the sum of a and b to the main function . 
    }

    
    public static void main(String[] args){
        int result = sum();         // store the sum in result
        System.out.println("The sum is: " + result);  // print the sum
    }
}
