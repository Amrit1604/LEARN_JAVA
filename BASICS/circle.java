package BASICS;

// Create a class circle java having a local variable float radius calculate the area and circumference as given below syntax 
// Take radius from user 


public class circle {

    static float area(float r) {
        return (float) Math.PI * r * r; 
    }

    static float circumference(float r) {
        return (float) (2 * Math.PI * r); 
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        float area = area(radius);
        float circumference = circumference(radius);

        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumference);

    }
}





