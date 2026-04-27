import java.util.Scanner;
class Employee {
    protected String name;
    protected String department;

    Scanner sc = new Scanner(System.in);

    public void inputDetails() {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
class Manager extends Employee {
    private int teamSize;
    private String projectName;

    @Override
    public void inputDetails() {
        super.inputDetails(); 
        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Type:");
        System.out.println("1. Employee");
        System.out.println("2. Manager");
        int choice = sc.nextInt();
        sc.nextLine();
        Employee emp; 
        if (choice == 1) {
            emp = new Employee();
            emp.inputDetails();
            emp.displayDetails();

        } else if (choice == 2) {
            emp = new Manager(); 
            emp.inputDetails();
            emp.displayDetails();
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
/*output:
Choose Type:
1. Employee
2. Manager
1
Enter Employee Name: namit
Enter Department: CE

--- Employee Details ---
Name: namit
Department: CE
  
Choose Type:
1. Employee
2. Manager
2
Enter Employee Name: shivam
Enter Department: CE
Enter Team Size: 10
Enter Project Name: digital board

--- Manager Details ---
Name: shivam
Department: CE
Team Size: 10
Project Name: digital board */