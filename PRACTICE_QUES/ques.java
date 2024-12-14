package PRACTICE_QUES;
import java.util.Scanner;

// 1. Student Grades: In a classroom, you can use an array to store the grades of each student in a particular subject. Each element of the array would represent the grade of a specific student.

public class ques {
    
    static void ques1() {
        int[] grades = {99, 89, 77, 92, 84};
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + " Grade: " + grades[i]);
        }
    }






    // 2. List of Phone Contacts: Your smartphone's contact list is essentially an array.
    // Each entry in the list represents a contact, and you can easily search, add, or delete contacts using array-like data structures.

    static void ques2() {

        String[] contacts = {
            "Amrit - 950-1580-144", 
            "Pranjal - 778-6971-868",
            "Drake - 324-9857-448",
            "Tyson - 245-7393-294"
        };

        System.out.println("\nPhone Contacts List:");
        for (int i = 0; i < contacts.length; i++) {
            System.out.println((i + 1) + ". " + contacts[i] + "\n");
        }

        System.out.println("Enter the name to search");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine().toLowerCase();

        boolean found = false;
        for(int i=0;i<contacts.length; i++){
            if(contacts[i].toLowerCase().contains(searchName)){
                System.out.println("Found " + searchName + "'s contact " + "\n" + contacts[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(searchName + " Not found in the contact list ");
        }
        sc.close();
    }



// 3. High Scores in a Game: Video games often use arrays to store and
// display high scores achieved by players. Each element of the array represents a player's score.







    public static void main(String[] args) {
        // ques1();
        ques2();
    }
}









