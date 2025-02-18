package BASICS.oops;

public class NestedClass {
    private String bankName; 

    NestedClass(String bankName) {
        this.bankName = bankName;  
    }

        class Atm { 
            private String location;
            private int num;

            Atm(String location) {
                this.location = location;
                this.num = 4;
            }



            

            void NumOfAtm(int num) {
                this.num = num;
            }

                    void display() {
                        System.out.println("Bankname: " + bankName);
                        System.out.println("Location: " + location);
                        System.out.println("Number of ATM: " + num);
                    }
    }
    public static void main(String[] args) {
        NestedClass bank = new NestedClass("Punjab national Bank"); 


        NestedClass.Atm atm1 = bank.new Atm("Punjab"); 

        atm1.display();
    }
}
