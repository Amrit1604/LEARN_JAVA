package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment and test sections as needed

        // Single-dimensional array example
        // stringArrayExample(sc);

        // Passing an array to a function
        // intArrayModificationExample();

        // 2D Array Example
        input(sc);
        
        sc.close(); // Close scanner to avoid memory leak
    }

    // Function for modifying an array
    static void change(int[] arr2) {
        arr2[0] = 9;
    }

    // 2D array input
    static void input(Scanner sc) {
        int[][] arr = new int[3][2];

        System.out.println("Enter " + (arr.length * arr[0].length) + " elements:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("The array is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");  
            }
            System.out.println();  // Newline after each row
        }
    }
}
