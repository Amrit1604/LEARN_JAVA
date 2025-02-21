package BASICS.oops;

public class Employees {
    private String name;
    private int Ex;
    private int Id;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEx() {
        return Ex;
    }
    public void setEx(int Ex) {
        this.Ex = Ex;
    }

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    // parameterized constructor and implement equals method
    public Employees(String name, int Ex, int Id) {
        this.name = name;
        this.Ex = Ex;
        this.Id = Id;
    }

    @Override
    public boolean equals(Object obj) {    // Object class is the super class of the java
        if (this == obj) {
            return true;
        }
        Employees emp = (Employees) obj;
        return Ex == (emp.Ex) && Id == (emp.Id) && name.equals(emp.name);
    }

    public static void main(String[] args) {
        Employees emp1 = new Employees("Amrit", 6, 101);
        Employees emp2 = new Employees("Amrit", 6, 101);
        Employees emp3 = new Employees("Amrit", 5, 102);

        System.out.println(emp1.equals(emp2)); // true
        System.out.println(emp1.equals(emp3)); // false
    }




}
