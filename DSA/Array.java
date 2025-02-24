package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class Array{

    
    public static void main(String[]  args){
        Scanner sc = new Scanner (System.in);
        // String[] arr = new String[5];       // Array of 5 strings

        // for(int i = 0; i < arr.length ; i++){   // Taking input from user
        //     arr[i] = sc.nextLine();
        // }
        // System.out.println("The array is: " + Arrays.toString(arr));    // Printing the array original array




        //         // MODIFYING OF AN ARRAY

        // arr[2] = "YOman";  // Changing the value of 3rd element

        // System.out.println("The array is: " + Arrays.toString(arr));    // Printing the array new array



        // System.out.println("-------------------------------------------");




        // int[] arr2 = {1,2,3,4};
        // System.out.println("The array is: " + Arrays.toString(arr2));    // Printing the  original array

        // change(arr2);  // Passing the array to the function

        // System.out.println("The array is: " + Arrays.toString(arr2));    // Printing the  new  array


        // System.out.println("-------------------------------------------");


        // 2D ARRAYS

            int [][] arr3 = new int[3][3];   // 3x3 2D array
            for(int i = 0; i<3; i++){

                for(int j = 0; j<3; j++){
                    arr3[i][j] = sc.nextInt();
                }
            }
            System.out.println("The array is: " + Arrays.deepToString(arr3) );    // Printing the  original array

        
 
    }


    // Functions for passing an array

    static void change(int[] arr2){
        arr2[0] = 9;

    }

}