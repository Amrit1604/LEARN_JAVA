// public class strlen {
//     public static String encoding(String str) {
//         nString result = new nString();
//         int count = 1;
        
//         for (int i = 1; i <= str.length(); i++) {
//             if (i == str.length() || str.charAt(i) != str.charAt(i-1)) {
//                 result.append(str.charAt(i-1));
//                 result.append(count);
//                 count = 1;
//             } else {
//                 count++;
//             }
//         }
        
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String input = "aaaaabbbbccdeeeee";
//         String encoded = encoding(input);
//         System.out.println("Input: " + input);
//         System.out.println("Output: " + encoded);
//     }
// }

import java.util.Scanner;

public class strlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


            z

        boolean tri = false;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                System.out.println("Triplet found: " + arr[i]);
                tri = true;
            }
        }

        if (!tri) {
            System.out.println("No triplets found in the array.");
        }
    }
}
