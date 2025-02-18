package PRACTICE_QUES;

public class Replace {

// a
// b c
// d e f
// g h i j

    public static void main(String[] args) {
        int n = 7;
        char ch = 'a';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            }
        }
    }
        
