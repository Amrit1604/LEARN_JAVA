package BASICS.oops;

public class nonRepeat {

    // Find the non-repeating character and special character in a string  (Arijith:)

    public static void main(String[] args) {
        String str = "Arijith:)";
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character is: " + str.charAt(i));
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 0) {
                System.out.println("First special character is: " + str.charAt(i));
                break;
            }
        }
    }
}
