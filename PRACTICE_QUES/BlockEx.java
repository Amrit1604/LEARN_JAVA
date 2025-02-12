public class BlockEx {
    int a;
    String b;
    static int c;

    // Constructor
    BlockEx(int a) {
        this.a = a;
        this.b = "Default"; // Assigning a default value to avoid null
        System.out.println("Constructor is executed");
    }

    // Static block
    static {
        c = 100;
        System.out.println("I am from static block");
    }

    // Non-static block
    {
        a = 10;
        b = "hi";
        System.out.println("I am from non-static block");
    }
}

class Main {
    public static void main(String[] args) {
        new BlockEx(5); // Creating object without storing reference
    }
}
