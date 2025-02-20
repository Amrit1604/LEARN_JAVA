package BASICS.oops;

public class FinalKeyword {
    public static void main(String[] args) {
            // 1. Final variable

        final int x = 10;
        // x = 20; // Error: cannot assign a value to final variable x
        System.out.println(x);

        // 2. Final method
        class Animal {
            final void eat() {
                System.out.println("eating...");

                
            }
        }

        class Dog extends Animal {
            // void eat() { // Error: eat() in Dog cannot override eat() in Animal
            // System.out.println("eating bread...");
            // }
        }

        
        // inherite the final method to make it work 
        
        

        // 3. Final class
        final class Bike {
            void run() {
                System.out.println("running...");
            }
        }
        // class Car extends Bike { // Error: Bike is final; cannot be extended

    }






}
