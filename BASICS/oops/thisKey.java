package BASICS.oops;

public class thisKey {

    // int a;
    // int b;

    // thisKey(int a, int b){
    //     this.a = a;
    //     this.b = b;
    // }

    // void display(){
    //     System.out.println("a = " + a + " b = " + b);
    // }

    // public static void main(String[] args) {
    
    //     thisKey obj = new thisKey(10, 20);
    //     obj.display();
    // }


        int a = 30;
        int b = 40;
        void display(){
            System.out.println("a = " + a + " b = " + b);
            System.out.println("a = " + this.a + " b = " + this.b);
        }
        public static void main(String[] args) {
            thisKey obj = new thisKey();
            obj.display();
        }
    }

// this keyword is a reference variable that refers to the current object. It is used to refer to the current class instance variable.
// It is used to call the current class method.
// It is used to invoke the current class constructor.
// It is used to pass an argument in the method.
// It is used to return the current class instance.
// It is used to return the current class method.
// It is used to return the current class constructor.

