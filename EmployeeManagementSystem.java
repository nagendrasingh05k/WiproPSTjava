package Assignment;

/* Abstraction:
Question:
Design an Employee Management System where you create an abstract class Employee with abstract methods like calculateSalary() 
and displayDetails(). Create two derived classes, FullTimeEmployee and PartTimeEmployee, and implement the abstract methods. 
For FullTimeEmployee, calculate salary as a fixed monthly rate, and for PartTimeEmployee, calculate salary based on hourly rates. 
Demonstrate polymorphism by creating an array of Employee objects and calculating/displaying salaries using overridden methods. */


abstract class Employee {
    protected String name;
    protected int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    public abstract double calculateSalary();
    public abstract void displayDetails();
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println("Salary: $" + calculateSalary());
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        
        employees[0] = new FullTimeEmployee("Alice", 101, 5000);
        employees[1] = new PartTimeEmployee("Bob", 102, 20, 80);
        
        
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
