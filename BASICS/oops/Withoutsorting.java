package BASICS.oops;

public class Withoutsorting {
    // print 2nd highest without sorting
    public static void main(String[] args) {
        int arr [] = { 33,57,23,41,13,65,9,22 };



        int max = Integer.MIN_VALUE;

        int Smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                
                Smax = max;
                max = arr[i];
            } 
            else if (arr[i] > Smax && arr[i] != max) {
                Smax = arr[i];
            }
        }
        System.out.println("the second highest elements is :::  " + Smax);
    }
    
}
