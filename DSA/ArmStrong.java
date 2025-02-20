package DSA;

public class ArmStrong {

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n/10;
        }
        return original == sum;
    }

    public static void main(){
        System.out.println("These are the ArmStrong Nums: " );

        for(int i = 100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }
}
