import java.util.Scanner;
class Student {
    protected int rollNo;
    protected String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Result extends Student {
    private int marks1, marks2, marks3;
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void displayResult() {
        displayStudent();
        System.out.println("\n--- Marksheet ---");
        System.out.println("Subject 1 Marks: " + marks1);
        System.out.println("Subject 2 Marks: " + marks2);
        System.out.println("Subject 3 Marks: " + marks3);

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();
        Result r = new Result(rollNo, name, m1, m2, m3);

        r.displayResult();
        sc.close();
    }
}
/*output:
Enter Roll Number: 001
Enter Student Name: piya
Enter Marks of Subject 1: 68
Enter Marks of Subject 2: 78
Enter Marks of Subject 3: 95

--- Student Details ---
Roll No: 1
Name: piya

--- Marksheet ---
Subject 1 Marks: 68
Subject 2 Marks: 78
Subject 3 Marks: 95
Total Marks: 241
Average Marks: 80.33333333333333*/