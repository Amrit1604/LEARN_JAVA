package PRACTICE_QUES;

public class bubble {
    static int swapCount = 0; // Add a variable to count swaps
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swapCount++; // Increment swap counter
    }
    
    public static void main(String[] args) {
        int arr[] = {1,46,34,1208,9723,984,46,407,32,22,348};
        // int arr[] = {1,2,3,4,5};
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Print total number of swaps
        System.out.println("\nTotal number of swaps: " + swapCount);
    }
}
