package BASICS.oops;

import java.util.Scanner;
public class WildcardMatch {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();


        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) != Y.charAt(i) && X.charAt(i) != '?') {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}

