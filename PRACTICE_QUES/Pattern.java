package PRACTICE_QUES;
import java.util.*;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the matrix (n): ");
//         int n = sc.nextInt();
        
//         int mat[][] = new int[n][n];
        
//         System.out.println("Enter the elements of the matrix:");
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 mat[i][j] = sc.nextInt();
//             }
//         }

//         int primarySum = 0, secondarySum = 0;

//         System.out.println("Primary Diagonal:");
//         for(int i = 0; i < n; i++) {
//             System.out.print(mat[i][i] + " ");
//             primarySum += mat[i][i];
//         }
//         System.out.println();
//         System.out.println("Sum of Primary Diagonal: " + primarySum);

//         System.out.println("Secondary Diagonal:");
//         for(int i = 0; i < n; i++) {
//             System.out.print(mat[i][n - 1 - i] + " ");
//             secondarySum += mat[i][n - 1 - i];
//         }
//         System.out.println();
//         System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        
//         sc.close();
//     }
// }




// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the matrix (n): ");
//         int n = sc.nextInt();
//         int[][] m = new int[n][n];

//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 m[i][j] = sc.nextInt();
                
//             }
//         }

//         int pSum = 0; 
//         int sSum = 0; 

//         for (int i = 0; i < n; i++) {
//             pSum += m[i][i]; 
//             sSum += m[i][n - 1 - i]; 
//         }

//         System.out.println("Sum of primary diagonal: " + pSum);
//         System.out.println("Sum of secondary diagonal: " + sSum);
//     }
// }





public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();
        int m [][] = new int[n][n];

        int pSum = 0; 
        int sSum = 0; 

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m [i][j] = sc.nextInt();
                if (i == j) {
                    pSum += m[i][i]; 
                }
                if (i + j == n - 1) {
                    sSum += m[i][j]; 
                }
            }
        }

        System.out.println("Sum of primary diagonal: " + pSum);
        System.out.println("Sum of secondary diagonal: " + sSum);

        sc.close();
    }
}


