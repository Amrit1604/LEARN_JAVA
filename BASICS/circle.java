package BASICS;

import java.util.Scanner;

public class circle {

    static float area(float r) {
        return (float) Math.PI * r * r;
    }

    static float circumference(float r) {
        return (float) (2 * Math.PI * r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        if (radius <= 0) {
            System.out.println("Radius must be a positive value.");
        } else {
            float area = area(radius);
            float circumference = circumference(radius);

            System.out.printf("Area of the circle is: %.2f%n", area);
            System.out.printf("Circumference of the circle is: %.2f%n", circumference);
        }

       
    }
}
