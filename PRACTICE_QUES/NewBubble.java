package PRACTICE_QUES;

public class NewBubble {
    static int countingSort(int[] arr) {
        // Find the range of input array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        // Create count array
        int range = max - min + 1;
        int[] count = new int[range];
        
        // Store count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        
        // Modify array with sorted elements
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index] = i + min;
                index++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,46,34,1208,9723,984,46,407,32,22,348};
        
        // Sort array
        countingSort(arr);
        
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
