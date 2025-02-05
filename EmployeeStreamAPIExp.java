package Assignment5;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    
    public double getSalary(){
        return salary;
    }

}
public class EmployeeStreamAPIExp {
    
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("Nagendra", 28, 50000),
            new Employee("Vinod", 35, 70000),
            new Employee("Rahul", 32, 80000),
            new Employee("Devansh", 29, 55000),
            new Employee("Ammy", 40, 90000)
        );

        // Filter employees older than 30
        List<String> employeeNames = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        // Calculate average salary of filtered employees
        double averageSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        // Print the results
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average salary of these employees: " + averageSalary);
    }
}
