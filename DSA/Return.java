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



    static int sum2(int a , int b){  // function with given parameters and return type
        int sum = a + b;
        return sum;  // return the sum of a and b to the main function
    }




    static String Greet(){   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        String name =  sc.nextLine().trim(); // take the name as input

        String message = "Hello " + name + " Welcome to the world of programming"; // create a message

        return message; // return the message to the main function
    }



    static void swap(int a  , int b){   // function to swap the values of a and b
        int temp = a ;
        a = b;
        b = temp ;
        System.out.println("The value of a is " + a + " and the value of b is " + b);  // print the swapped values

    }




    
    public static void main(String[] args){

        String personalized =  Greet();     // store the message in personalized
        System.out.println(personalized);

        int result = sum();         // store the sum in result
        int result2 = sum2(30,30);
        System.out.println("The sum is: " + result);  // print the sum
        System.out.println("This is sum 2 = " + result2);

        swap(20,30);  // call the swap function


    }
}
