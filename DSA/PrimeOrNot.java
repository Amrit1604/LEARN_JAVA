package DSA;
import java.util.Scanner;

public class PrimeOrNot {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean  ans = isPrime(n);
        // System.out.println(ans);

        for(int i = 100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ") ;
            }
        }
        sc.close();
    }
    

    // print all 3 digit armsstrong numbers

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        return original == sum;
    }



     static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int a = 2;
        while (a*a <=n){
            if(n%a ==0){
                return false;
            }
            a++;
        }
        return a*a > n;

    }
    


}
