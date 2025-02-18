package PRACTICE_QUES;

public class Pattern3 {
    // 0
    // 0 1
    // 0 1 1
    // 0 1 1 2

     static void ques1(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j - 1 + " ");
                }
            }
            System.out.println();
        }
    }

    // q2


    // A
    // b c
    // d E f 
    // G h I j

    static void ques2(String[] args) {
        char ch = 'A';
        int n = 4;

    }
 
    // q3

    // Hello World
    // replace with "-" whereever you are getting vowels in the add positions bases on the 1st index;
    // Output = H-llo W-rld

    static void ques3() {
        String str = "Hello World";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {


            if (i % 2 == 0) { 
                newStr += str.charAt(i);
            } else {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u')
                        
                        {
                    newStr += "-";
                }

                 else {
                    newStr += str.charAt(i);
                }
            }
        }
        System.out.println(newStr);
    }


    //  ques4

    // Sorting the string 
    // Input = "Apple"
    // Output == "Aelpp"

    static void ques4() {
        String str = "Apple";
        char[] ch = str.toCharArray();


        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        ques1(args);
        // ques2();
        ques3();
        ques4();


    }
}
