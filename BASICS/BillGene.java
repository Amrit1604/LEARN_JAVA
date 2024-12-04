package BASICS;

// Tom went to a movie with his friends in a multiplex theater and during break time he bought pizzas, puffs, and cold drinks. 
// COnsider the following prices
// Rs100/pizzes, Rs20/puffs , Rs10/cold drinks . Generate a bill for what tom has bought


public class BillGene {

    public static void main(String[] args) {
        final int PIZZA_PRICE = 100;
        final int PUFF_PRICE = 20;
        final int COLD_DRINK_PRICE = 10;
        

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the number of pizzas Tom bought: ");
        int pizzas = sc.nextInt();

        System.out.print("Enter the number of puffs Tom bought: ");
        int puffs = sc.nextInt();

        System.out.print("Enter the number of cold drinks Tom bought: ");
        int coldDrinks = sc.nextInt();

        int total = (pizzas * PIZZA_PRICE) + (puffs * PUFF_PRICE) + (coldDrinks * COLD_DRINK_PRICE);


        System.out.println("Number of pizzas: " + pizzas + " x " + PIZZA_PRICE + " = " + (pizzas * PIZZA_PRICE));
        System.out.println("Number of puffs: " + puffs + " x " + PUFF_PRICE + " = " + (puffs * PUFF_PRICE));
        System.out.println("Number of cold drinks: " + coldDrinks + " x " + COLD_DRINK_PRICE + " = " + (coldDrinks * COLD_DRINK_PRICE));
        System.out.println("Total Bill: Rs " + total);
        sc.close();
        }
}

