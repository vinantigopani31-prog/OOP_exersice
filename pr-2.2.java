import java.util.Scanner;

class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Employee
        Employee emp = new Employee();

        // Calling methods
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}

/*output:
Enter Employee Name: evan
Enter Employee Salary: 45000

Employee Details:
Employee Name: evan
Employee Salary: 45000.0*/