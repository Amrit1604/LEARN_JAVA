package oops;

public class constructor{


    constructor(){
        System.out.println("Non parametirized const");
    }
    constructor(String name){
        System.out.println("Parametirized const");
    }
}

class subclass extends constructor{
    subclass(){
        System.out.println(" NO args subclass");
    }
    subclass(String name){
        System.out.println("args subclass");
    }

}

class main{
    public static void main(String[] args) {
        subclass obj = new subclass();
        subclass obj1 = new subclass("name");
    }
}


// Can we inherit block into a subclass?