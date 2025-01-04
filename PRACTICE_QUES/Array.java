// Here is a set of array-related questions ranging from beginner to intermediate levels in Java:

// Beginner Level

// Write a program to declare an integer array and initialize it with values. Print all the elements using a loop.
// Create an array of 5 floating-point numbers and calculate their sum.
// Write a program to find the largest and smallest elements in an array.
// Reverse an array and print the result.
// Check if a given element exists in an array also give its position.
// Copy elements from one array to another.
// Create a program to find the average of numbers in an array (in float).
// Sort an array in ascending order using a built-in method.


// Intermediate Level

// 9 Write a program to find the second largest and second smallest elements in an array.
//  10 Rotate an array by a given number of positions to the left or right.
// 11 Merge two sorted arrays into a single sorted array also eleminate same elements.
// Find all pairs of elements in an array whose sum is equal to a given number.
// Write a program to remove duplicate elements from an array.
// Find the frequency of each element in an array.
// Implement binary search on a sorted array.
// Write a program to check if two arrays are equal (contain the same elements in any order).
// Create a program to find the subarray with the maximum sum (Kadane’s algorithm).
// Check if an array is a palindrome.
// Shift all zeroes in an array to the end while maintaining the order of other elements.
// Count the number of elements greater than a given number in an array.



package PRACTICE_QUES;

import java.util.*;


public class Array {

// 1
     static void ques1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Using Arrays.toString() to print the array
        System.out.println("Original array " + Arrays.toString(arr));


        System.out.print("Original array: ");
        for(int i = 0 ; i < arr.length ; i++){
            if( i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", " );
                
            }
        }
        System.out.println();

    }

// 2
    static void ques2() {
        float[] arr = {1.3f , 2.2f , 3.5f, 4.0f, 5.4f, 7.7f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

        System.out.println();

        }


// 3
        static void ques3(){
            int[] arr = {1,2,3,4,5,6};
            int max = arr[0];
            int min = arr[0];
            for(int i =0 ; i < arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    max = arr[i];
                }
            }
            System.out.println("Max element is : " + max);
            System.out.println("Min element is : " + min);

            System.out.println();
        }


// 4

        static void ques4(){
            int[] arr = {1,2,3,4,5,6};
            int[] rev =  new int[arr.length];

            int j = 0 ;
            for(int i = arr.length-1 ; i>=0 ; i--){
                rev[j] = arr[i];
                j++;
            }
            System.out.println("Original Array" + Arrays.toString(arr));
            System.out.println("Reversed array " + Arrays.toString(rev));

            System.out.println();
        }



// 5

        static void ques5() {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int element = 3; 
            int position = 0;
            boolean found = false;
            for(int i = 0; i < arr.length ; i++ ){
                if(arr[i] == element){
                    found = true;
                    position = i;
                    break;
                }

            }
            if(found){
                System.out.println( element + " found at position " + position);
            }
            else{
                System.out.println( element + " not found in the array");
            }

            System.out.println();

        }


// 6
        static void ques6(){
            int[] arr = {9,8,7,6,5};
            int[] copy = new int[arr.length];
            for(int i = 0; i< arr.length ; i++){
                copy[i] = arr[i];
            }
            System.out.println("Original array " + Arrays.toString(arr));
            System.out.println("Copied array " + Arrays.toString(copy));
            System.out.println();

        }

// 7

        static void ques7(){
            float[] arr = {1.3f , 2.2f , 3.5f, 4.0f, 5.4f, 7.7f};
            float sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            float avg = sum / arr.length;
            System.out.printf("Average of array elements:  %.2f%n" ,avg);

            System.out.println();

        }

// 8
        static void ques8(){
            int[] arr = {9,8,7,6,5};
            Arrays.sort(arr);
            System.out.println("Sorted array " + Arrays.toString(arr));

            System.out.println();


            System.out.println("********************************");
            System.out.println("Intermediate Level");
            System.out.println("********************************");

            System.out.println();
        }


// 9

        static void ques9(){
            int[] arr = {1,2,3,4,5,6};
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            int firstSmallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for(int i = 0; i<arr.length;i++){
                if(arr[i] > firstLargest){
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                }
                else if(arr[i] > secondLargest && arr[i] != firstLargest){
                    secondLargest = arr[i];
                }

                if(arr[i] < firstSmallest){
                    secondSmallest = firstSmallest;
                    firstSmallest  = arr[i];
                }
                else if(arr[i] < secondSmallest && arr[i] != firstSmallest){
                    secondSmallest = arr[i];
                }
            }
            System.out.println("The Secomd largest number is  : " + secondLargest);
            System.out.println("The secoond smallest number is  : " + secondSmallest) ;

            System.out.println();

        } 
        // or we can sort the array into 1st ascending order the take out the 2nd element and the n-1 element

        static void usinsorting(){
            int[] arr = {new Random().nextInt(10000), new Random().nextInt(10000), new Random().nextInt(10000), new Random().nextInt(10000), new Random().nextInt(10000)};
            Arrays.sort(arr);
            int a  = arr[1];
            int b  = arr[arr.length-2];
            System.out.println("The second largest number is  : " + a);
            System.out.println("The second smallest number is : " + b);

            System.out.println();

        }


// 10
        static void ques10(){
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            int n = 3;
            int[] left = new int[n];
            int[] right = new int[arr.length - n];
            for(int i = 0 ; i < n ; i++){
                left[i] = arr[i];
            }
            for(int i = n ; i < arr.length ; i++){
                right[i-n] = arr[i];
            }
            System.out.println("Original array " + Arrays.toString(arr));
            System.out.println("Left array " + Arrays.toString(left));
            System.out.println("Right array " + Arrays.toString(right));


            System.out.println();
        }

// 11 merge and sort


        static void ques11(){
            int[] arr = {44,33,51,12,5,8};
            int[] arr2 = {1,2,3,7,9,8,54,5,4};
            int[] arr3 = new int[arr.length + arr2.length];

            int  i = 0;
            for(int j =0; j< arr.length; j++){
                arr3[i] = arr[j];
                i++;
            }
            for(int j = 0; j<arr2.length ; j++){
                arr3[i] = arr2[j];
                i++;
            }
            Arrays.sort(arr3);
            System.out.println("Merged and sort array is : " + Arrays.toString(arr3));

            System.out.println();
        }


// 12  Find all pairs of elements in an array whose sum is equal to a given number.
            // static void ques12(){
            //     int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            //     int sum = 1;
            //     for(int i = 0 ; i < arr.length ; i++){
            //         for(int j = i+1 ; j < arr.length ; j++){
            //             if(arr[i] + arr[j] == sum){
            //                 System.out.println("Pair found at index " + i + " and " + j);
            //             }
            //             else{
            //                 System.out.println("Pair not found");
            //             }
            //         }
            //         System.out.println();
            //         }
                
            // }

            static void ques12() {
                int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
                int sum = 37;
                boolean pairFound = false;
            
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == sum) {
                            System.out.println("Pair found at index " + i + " and " + j);
                            pairFound = true;
                        }
                    }
                }
            
                if (!pairFound) {
                    System.out.println("No pairs found with the given sum.");
                }
            }

    






    public static void main(String[] args) {
        ques1(args);
        ques2();
        ques3();
        ques4();
        ques5();
        ques6();
        ques7();
        ques8();
        ques9();
        usinsorting();
        ques10();
        ques11();
        ques12();
    }
}