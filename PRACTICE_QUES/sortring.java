// SORTING QUESTIONS
// 1. Write a function that takes a list of integers as input and returns a new list
//    containing the same integers sorted in non-decreasing order.


public class sortring {
    
    static void ques1(){

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        


    }




    public static void mian(String[] args) {
        ques1();
    }



}
