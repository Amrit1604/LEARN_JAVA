package BASICS.oops;

public class matrix {

    // Finds the largest prime number on the main and secondary diagonals of a matrix

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int matrixSize = 3; // More descriptive name
        int[][] arr = {
                {12, 4, 97},
                {3, 13, 5},
                {79, 8, 15}
        };
        int max = 0;
        boolean primeFound = false;

        for (int i = 0; i < matrixSize; i++) {
            if (isPrime(arr[i][i])) {
                max = Math.max(max, arr[i][i]);
                primeFound = true;
            }
            if (isPrime(arr[i][matrixSize - i - 1])) {
                max = Math.max(max, arr[i][matrixSize - i - 1]);
                primeFound = true;
            }
        }

        if (primeFound) {
            System.out.println(max);
        } else {
            System.out.println("No prime numbers found on diagonals.");
        }
    }
}