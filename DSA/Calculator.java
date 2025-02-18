package DSA;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().trim().charAt(0);

            // Exit condition check
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting Calculator...");
                break;
            }

            // Check for valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter 1st number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter 2nd number: ");
                int num2 = sc.nextInt();
                
                int ans = 0; // Initialize answer variable
                
                if (op == '+') {
                    ans = num1 + num2;
                } 
                else if (op == '-') {
                    ans = num1 - num2;
                } 
                else if (op == '*') {
                    ans = num1 * num2;
                } 
                else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip printing result
                    }
                } 
                else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        continue; // Skip printing result
                    }
                }

                System.out.println("Result: " + ans);
            } 
            else {
                System.out.println("Invalid Operation! Please enter a valid operator.");
            }
        }

        sc.close();
    }
}
