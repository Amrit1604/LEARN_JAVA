package PRACTICE_QUES;

public class ElementSearching {
    public static void main(String[] args) {
        int[] array = {23,34,554,4342,343,345,24,43,45,56889,689,35,357,2332,225,66};
        int n = array.length;
        int key = 45;
        int pos = findEle(array, n, key); // Pass the correct variable 'array'
        if (pos == -1) { // Check for -1, indicating the element was not found
            System.out.println("Element not found");
        } else {
            System.out.println(+key +" Element found at position " + pos);
        }
    }

    // Define the method outside the main method
    static int findEle(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i + 1; // Return position (1-based index)
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
