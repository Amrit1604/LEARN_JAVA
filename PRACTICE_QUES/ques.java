package PRACTICE_QUES;
import java.util.Scanner;

public class ques {
    
    // 1. Student Grades
    static void ques1() {
        int[] grades = {99, 89, 77, 92, 84};
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + " Grade: " + grades[i]);
        }
    }






    // 2. List of Phone Contacts with search
    static void ques2() {
        String[] contacts = {
            "Amrit - 950-1580-144", 
            "Pranjal - 778-6971-868",
            "Drake - 324-9857-448",
            "Tyson - 245-7393-294"
        };

        System.out.println("\nPhone Contacts List:");
        for (int i = 0; i < contacts.length; i++) {
            System.out.println((i + 1) + ". " + contacts[i]);
        }

        System.out.println("Enter the name to search:");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].toLowerCase().contains(searchName)) {
                System.out.println("Found " + searchName + "'s contact:\n" + contacts[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchName + " not found in the contact list.");
        }
        sc.close();
    }






// 3. HighScore in a game

static void ques3(){
    int[] highScores = { 100, 200, 300, 400, 500};
    
    System.out.println("Current High Score List");
    for(int i = 0 ; i<highScores.length; i++){
        System.out.println((i+1) + ". " + highScores[i]);
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your new score:");
    int newScore = sc.nextInt();
    sc.close();

    boolean scoreAdded = false;
    for(int i = 0 ; i<highScores.length; i++){
        if(newScore>highScores[i]){
            for(int j = highScores.length-1; j>i; j--){
                highScores[j] = highScores[j-1];
            }
            highScores[i] = newScore;
            scoreAdded = true;
            break;
        }
    }

    if(scoreAdded){
        System.out.println("New Score added");
        for(int i =0 ; i< highScores.length;i++){
            System.out.println((i+1) + ". " + highScores[i]);

        }

    }
    else{
        System.out.println("Score is too low to be added");
    }

}

    public static void main(String[] args) {
        // ques1();  // Student Grades
        // ques2();  // Phone Contacts Search
        ques3();    // High Scores in a Game
    }
}
