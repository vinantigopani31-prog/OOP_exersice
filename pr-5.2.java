import java.util.Scanner;
interface Exam {
    boolean isPassed(int mark);
}
interface Classify {
    String getDivision(double average);
}
class Result implements Exam, Classify {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35;
    }
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 35) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;

        System.out.println("\n--- Result Analysis ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " Passed: " + r.isPassed(marks[i]));
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Division: " + r.getDivision(average));

        sc.close();
    }
}
/*output:
Enter number of subjects: 5
Enter marks of subject 1: 78
Enter marks of subject 2: 56
Enter marks of subject 3: 89
Enter marks of subject 4: 57
Enter marks of subject 5: 66

--- Result Analysis ---
Subject 1 Passed: true
Subject 2 Passed: true
Subject 3 Passed: true
Subject 4 Passed: true
Subject 5 Passed: true
Average Marks: 69.2
Division: First Division*/