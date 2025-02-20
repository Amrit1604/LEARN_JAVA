package DSA;
import java.util.Arrays;

public class ShadowVarArgs {
    // Shadowing is a concept in which a variable is declared in a block and then a variable with the same name is declared in the outer block.

    int x = 10; // instance variable

    // varribale agrs 

    static void fun(int ...v){   // it is a varargs parameter , it is used to pass variable number of arguments to a method , it can store zero to n values
        System.out.println(Arrays.toString(v)); // [2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    static void fun2(int a , int b , String ...v){
        System.out.println(a); // 10
        System.out.println(b); // 20
        System.out.println(Arrays.toString(v)); // [hello, world]
    }

    public static void main(String[] args) {
        int x = 20; // local variable
        System.out.println(x); // 20


        fun(2,3,4,5,6,7,8,9,10);

        fun2(10,20,"hello","world" , "java" , "python");
    }
    }
