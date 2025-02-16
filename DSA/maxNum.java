package DSA;
import java.util.*;

public class maxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(a > b){
            if(a > c){
                max = a;
            }
            else{
                max = c;
            }
        }
        else{
            if(b > c){
                max = b;
            }
            else{
                max = c;
            }
        }
        System.out.println("Max number is: " + max);
        sc.close();
    
    }
}
