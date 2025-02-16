<<<<<<< HEAD


=======
>>>>>>> eecca12 (First one)
package PROJECT;

import java.util.Scanner;

public class grades {
    public static void displayGrades(int[] grades) {
        System.out.println("Grades:");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static boolean searchGrade(int[] grades, int target) {
        for (int grade : grades) {
            if (grade == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of grades:");
        int n = scanner.nextInt();
        int[] grades = new int[n];
        System.out.println("Enter the grades:");
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }
        displayGrades(grades);

        double average = calculateAverage(grades);
        System.out.println("Average Grade: " + average);

        System.out.println("Enter a grade to search:");
        int target = scanner.nextInt();
        if (searchGrade(grades, target)) {
            System.out.println("Grade found.");
        } else {
            System.out.println("Grade not found.");
        }
        scanner.close();
    }
}
