package PRACTICE_QUES;

public class SelectionSort {
    // seleciton sort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 1, 90};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            }
            }
}
