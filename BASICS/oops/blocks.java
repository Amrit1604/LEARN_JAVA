package oops;

public class blocks {
    blocks(){
        System.out.println("Non parametirized const");
    }
    blocks(String name){
        System.out.println("Parametirized const");
    }
    {
        System.out.println("Instance block");
    }




    static{
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        blocks obj = new blocks();
    }





    }

// order of execution of blocks:? and why ?
// can we inherit block into a subclass?
// this keyword? valid questions to ask from professor?
// types of variables?