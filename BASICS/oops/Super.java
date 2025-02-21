package BASICS.oops;

class Person {
    String name = "abc";

    public void display() {
        System.out.println("display in super");
    }
}

class Inter extends Person {  // Class names should follow PascalCase convention
    String name = "def";

    public void display() {
        System.out.println("display in inter");
    }
}

class Subclass extends Inter {
    String name = "xyz";

    public void display() {
        System.out.println("display in sub");
        System.out.println(super.name); // Accesses Inter's name variable (def)
        super.display(); // Calls Inter's display() method
    }
}

public class Super {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}