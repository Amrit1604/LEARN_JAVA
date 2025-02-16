package PRACTICE_QUES;
import java.util.Scanner;

public class electricityBill {
    // Electricity bill by units consumed
    
    public void electricityBill() {
        Scanner sc = new Scanner(System.in);
        char choice;
        
        while(true) {
            System.out.println("Enter the number of units consumed: ");
            int units = sc.nextInt();
            double bill = 0;
            
            if(units <= 100) {
                bill = units * 1.20; 
            } else if(units <= 300) {
                bill = 100 * 1.20 + (units - 100) * 2;
            } else if(units <= 500) {
                bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
            } else {
                bill = 100 * 1.20 + 200 * 2 + 200 * 3 + (units - 500) * 4;
            }
            
            System.out.println("Electricity bill is: " + bill);
            
            System.out.println("\nDo you want to calculate another bill? (y/n): ");
            choice = sc.next().charAt(0);
            
            if(choice == 'n' || choice == 'N') {
                System.out.println("Thank you for using our service!");
                break;
            }
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        electricityBill eb = new electricityBill();
        eb.electricityBill();
    }
}
