package DSA;
import java.util.Arrays;

public class FnOverloading {
    // Function Overloading
    // 1. Function Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
    // 2. It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.
    // 3. Function Overloading is not possible by changing the return type of the function only because the compiler does not consider the return type when differentiating methods.
    // 4. In Function Overloading, the function is redefined by using either different types of arguments or a different number of arguments.

    static void fun(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    static void fun(String a, String b) {
        System.out.println("Concatenation is: " + a + b);
    }

    static void Demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void Demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // static int fun(int a, int b) { // Error: method fun(int, int) is already defined in class FnOverloading


    public static void main(String[] args) {

        fun(10, 20); // Sum is: 30

        fun("Hello", "World"); // Concatenation is: HelloWorld

        // Demo();         // error -- Ambiguity , becoz both methods are applicable
    }
}
