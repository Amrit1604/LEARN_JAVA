package BASICS;

public class ex2 {

    public static void main(String a[]){
        int[] arr = {1, 2, 3, 4, 5,
            6, 7, 8, 9, 10};
            int n = arr.length;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
                }
                System.out.println("Sum of array elements: " + sum);

    }
    
}
