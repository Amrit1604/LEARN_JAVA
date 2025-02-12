package BASICS;

public class spiralMat {
    public static void main(String[] args) {
        // int[][] m = {
        //         {1, 2, 3, 4},
        //         {5, 6, 7, 8},
        //         {9, 10, 11, 12},
        //         {13, 14, 15, 16}
        // };

        int [][] m = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
 
        int startRow = 0;
        int endRow = m.length - 1;
        int startCol = 0;
        int endCol = m[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse right
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(m[startRow][i] + " ");
            }
            startRow++;

            // Traverse down
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(m[i][endCol] + " ");
            }
            endCol--;

            // Traverse left (check for rows below) 
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(m[endRow][i] + " ");
                }
                endRow--;
            }

            // Traverse up (check for columns to the left)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(m[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
}