package BASICS;

public class swapNums {

    // Method to perform simple swapping
    public static void swap1() {
        String x = "Water";
        String y = "ENO";
        String temp;

        // Swapping the values of x and y
        temp = x;
        x = y;
        y = temp;

        // Printing the swapped values
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println(x + " " + y);
    }

    // Method to perform string swapping without a temp variable
    public static void swap2Strings() {
        String x = "Amrit";
        String y = "Joshi";

        // Swapping using concatenation and substring
        x = x + y;               // x becomes "AmritJoshi"
        y = x.substring(0, x.length() - y.length()); // y becomes "Amrit"
        x = x.substring(y.length()); // x becomes "Joshi"

        // Printing the swapped values
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    // Method to perform integer swapping without a temp variable
    public static void swap2Integers() {
        int a = 15;
        int b = 7;

        // Swapping the values of a and b
        a = a + b;
        b = a - b;
        a = a - b;

        // Printing the swapped values
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }


    

    public static void main(String[] args) {
        // Calling the swap1 method
        swap1();

        // Calling the string swap2 method
        swap2Strings();

        // Calling the integer swap2 method
        swap2Integers();
    }
}
