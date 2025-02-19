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



        // thoes who have experience more than 5 years
        System.out.println("Employees with more than 5 years of experience:");
        System.out.println("------------------------------");
        for (Employee emp : employees) {
                if (emp.getEmpEx() > 5) {
                    System.out.println("Employee Id: " + emp.getEmpId());
                    System.out.println("Employee Name: " + emp.getEmpName());
                    System.out.println("Employee Experience: " + emp.getEmpEx());
                    System.out.println("------------------------------");
                }
            }

            // print the experience values in descending order
            System.out.println("Experience values in descending order:");
            for (int i = 0; i < employees.length; i++) {
                for (int j = i + 1; j < employees.length; j++) {
                    if (employees[i].getEmpEx() < employees[j].getEmpEx()) {
                        Employee temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }

            }

            System.out.println("------------------------------");




            // print the experience values in descending order
            for (Employee emp : employees) {   // 
                System.out.println("Employee Experience: " + emp.getEmpEx());
            }


            // print the 2nd highest experience value without sorting
            int max = Integer.MIN_VALUE;
            int Smax = Integer.MIN_VALUE;



            for (int i = 0; i < employees.length; i++){  
                if (employees[i].getEmpEx() > max) {
                    Smax = max;
                    max = employees[i].getEmpEx();


                } else if (employees[i].getEmpEx() > Smax && employees[i].getEmpEx() != max) {

                    Smax = employees[i].getEmpEx();
                }
            }
            System.out.println("Second highest experience value: " + Smax);

                

       scanner.close();
   }

   }


