package BASICS.oops;

import java.util.Scanner;

public class Employee {
   private int empId;
   private String empName;
   private int empEx;

   // Getters and setters for each property
   public int getEmpId() {
       return empId;
   }

   public void setEmpId(int empId) {
       this.empId = empId;
   }

   public String getEmpName() {
       return empName;
   }

   public void setEmpName(String empName) {
       this.empName = empName;
   }

   public int getEmpEx() {
       return empEx;
   }

   public void setEmpEx(int empEx) {
       this.empEx = empEx;
   }

   // Constructor
   public Employee(int empId, String empName, int empEx) {
       this.empId = empId;
       this.empName = empName;
       this.empEx = empEx;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter number of employees: ");
       int numEmployees = scanner.nextInt();
       scanner.nextLine();  

       Employee[] employees = new Employee[numEmployees];

       for (int i = 0; i < numEmployees; i++) {
           System.out.println("Enter details for employee " + (i + 1) + ":");
           System.out.print("Employee Id: ");
           int empId = scanner.nextInt();
           scanner.nextLine();  

        
           System.out.print("Employee Name: ");
           String empName = scanner.nextLine();
           System.out.print("Employee Experience: ");
           int empEx = scanner.nextInt();

           scanner.nextLine();  


           employees[i] = new Employee(empId, empName, empEx);
       }

       System.out.println(" \n Employee Details:");
       System.out.println("------------------------------");
       for (Employee emp : employees) {
           System.out.println("Employee Id: " + emp.getEmpId());
           System.out.println("Employee Name: " + emp.getEmpName());
           System.out.println("Employee Experience: " + emp.getEmpEx());
           System.out.println("------------------------------");
        }

       scanner.close();
   }
}
