package BASICS;
// HOW TO PRINT A STRING IN JAVA LANG

class print {
    public static void main(String a[] )
    {
        System.out.println("Hello World");

        int num1 = 3;
        int num2= 5;
        byte by = 127;
        short sh = 588;
        long l = 1234567890L; // to declare it as long value 'L' should be added afte the value
        int sum = num1 + num2;
        
        System.out.println("Sum of two numbers is: "+sum);
        System.out.println(num1+num2);

        System.out.println("Byte value is: "+by);
        System.out.println("Short value is: "+sh);
        System.out.println("Long value is: "+l);




        double marks = 6.5;
        float marks2= 7.5f;  // to declare it as float we have to add 'f' after the value otherwise it is considered as double
        System.out.println("My marks are: "+marks);
        System.out.println("My marks are: "+marks2);

        char initial = 'A'; // Value can only be inside single quotes not double
        System.out.println("My initial is: "+initial);

        boolean b = true;
        System.out.println("Boolean value is: "+b);



    }
    
}


