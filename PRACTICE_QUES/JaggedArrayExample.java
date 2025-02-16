package PRACTICE_QUES;

// Jagged Array Example
public class JaggedArrayExample {

    // Method to demonstrate a jagged array
    static void Jagged() {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1};
        arr[1] = new int[]{1, 2};
        arr[2] = new int[]{1, 2, 3};

        // Iterate through the jagged array
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum element in each row
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } 
            }

            // Calculate the sum of elements in the row
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            // Print details for the current row
            System.out.println(" | Sum: " + sum + ", Max: " + max + ", Length: " + arr[i].length);
        }
    }





    static void searchJagged() {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1};
        arr[1] = new int[]{1, 2};
        arr[2] = new int[]{1, 2, 3};
    
        int s = 2;
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == s) {
                    found = true;
                    break; 
                }
            }
        }
z
        
        if (found) {
            System.out.println(s + " found in the jagged array.");
        } else {
            System.out.println(s + " not found in the jagged array.");
        }

                // transpose of the jagged array
                int[][] t = new int[arr[0].length][arr.length];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        t[j][i] = arr[i][j];
                    }
                    System.out.println("Transpose of the jagged array:" + t);
        
                }
    }
    

    public static void main(String[] args) {
        Jagged();
        searchJagged();
    }
}
