//High scores in a game - Video games often use array to store and display high scores achieved  by players. Each element of the array represent a player’s score.

package PROJECT;



<<<<<<< HEAD
import java.util.*;
=======
<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
=======
import java.util.*;
>>>>>>> eecca12 (First one)
>>>>>>> recovered-branch

public class scores {

    public static void displayHighScores(Integer[] scores) {
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println("High Scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }

    public static boolean searchScore(Integer[] scores, int target) {
        for (int score : scores) {
            if (score == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of scores:");
        int n = scanner.nextInt();
        Integer[] scores = new Integer[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        displayHighScores(scores);

        System.out.println("Enter a score to search:");
        int target = scanner.nextInt();
        if (searchScore(scores, target)) {
            System.out.println("Score found.");
        } else {
            System.out.println("Score not found.");
        }
        scanner.close();
    }
}