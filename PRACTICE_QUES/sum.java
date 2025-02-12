package PRACTICE_QUES;
import java.util.*;


// Write a method maxSum to find the maximum sum of a contigueous subsequence in an array of integers.
// 1. Easy for all positive : includes the whole array
// 2. What if they are negatives

// c = current sum
// m = max sum

public class sum {
    static int maxSum(int[] arr) {
        int m = arr[0];
        int c = arr[0];
        for (int i = 1; i < arr.length; i++) {
            c = Math.max(arr[i] , c + arr[i]); 
            m = Math.max(m, c);
        }


        return m;
    }

    
    public static void main(String[] args) {
        int[] arr = { 2,1,-4,10,15,-2,22,-8,5};
        System.out.println("Maximum sum of a contigueous subsequence in an array of integers is: " + maxSum(arr));
    }
}




