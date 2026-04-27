import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextDouble();
        }

        double average = total / n;

        Result r = new Result();

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Division: " + r.getDivision(average));

        sc.close();
    }
}

/*output:
Enter number of subjects: 6
Enter marks of subject 1: 68
Enter marks of subject 2: 76
Enter marks of subject 3: 85
Enter marks of subject 4: 96
Enter marks of subject 5: 93
Enter marks of subject 6: 90

Average Marks: 84.66666666666667
Division: First Division*/