import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();

        System.out.println("Enter 5 Student Marks:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Mark " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nStudent Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        System.out.println("\nHighest Marks = " + Collections.max(marks));
        System.out.println("Lowest Marks = " + Collections.min(marks));

        sc.close();
    }
}

/*output 
Enter 5 Student Marks:
Enter Mark 1: 78
Enter Mark 2: 85
Enter Mark 3: 67
Enter Mark 4: 92
Enter Mark 5: 74
Student Marks:
78
85
67
92
74
Highest Marks = 92
Lowest Marks = 67 */