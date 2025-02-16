package BASICS.oops;

public class compare {
    public static void main(String args[]) {
        String str1 = "apple";
        String str2 = "zebra";
        String str3 = "banana";

        if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) { // Corrected: str1 instead of str
            System.out.println(str1 + " is less than " + str2); // This will never print with these strings.
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else if (str1.compareTo(str2) < 0) { // Added else if for less than.
            System.out.println(str1 + " is less than " + str2);
        }
        else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}