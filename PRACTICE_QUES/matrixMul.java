import java.util.Scanner;

public class matrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix (2x2)
        int[][] A = new int[2][2];
        System.out.println("Enter elements of 2x2 matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix (2x3)
        int[][] B = new int[2][3];
        System.out.println("Enter elements of 2x3 matrix B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Resultant matrix (2x3)
        int[][] C = new int[2][3];

        // Matrix multiplication: C = A x B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0; // Initialize the element
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];

                }
                
            }
        }

        // Display the Resultant Matrix
        System.out.println("Resultant Matrix (2x3) after multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
