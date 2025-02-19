package BASICS;


 
    import java.util.Arrays;

    public class Student {
        String name;
        int regno;
        String course;
        int value;
    
        // Default constructor
        public Student() {
            name = "unknown";
            regno = 0;
            course = "nil";
        }
    
        // Constructor for checking a Neon number
        public Student(int a) {
            int square = a * a;
            int sum = 0;
    
            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }
    
            if (sum == a) {
                System.out.println(a + " is a neon number");
            } else {
                System.out.println(a + " is not a neon number");
            }
        }
    
        // Constructor to sort the strings alphabetically
        public Student(String a, String b, String c) {
            String[] arr = {a, b, c};
            Arrays.sort(arr); // Sorting in alphabetical order
            System.out.println("Sorted strings: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        }
    
        // Constructor to convert float to integer
        public Student(float a) {
            this.value = (int) a;
            System.out.println("Converted Integer: " + this.value);
        }
    
        // Constructor to initialize student details
        public Student(String name, int regno, String course) {
            this.name = name;
            this.regno = regno;
            this.course = course;
        }
    
        // Method to display student details
        public void display() {
            System.out.println(name + " " + regno + " " + course);
        }
    
        public static void main(String[] args) {
            Student obj = new Student("abc", 100, "java"); // Valid object with details
            obj.display(); // Expected Output: abc 100 java
    
            Student obj1 = new Student(0.5f); // Float conversion (Outputs: Converted Integer: 0)
            Student obj2 = new Student(9); // Neon number check
    
            // Sorting three strings alphabetically
            Student obj3 = new Student("apple", "banana", "cherry");
            
        }
    }
