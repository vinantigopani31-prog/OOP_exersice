import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("The given sides form a valid triangle.");
            System.out.printf("Area of the triangle = %.2f\n", area);
        } else {
            System.out.println("The given sides do NOT form a valid triangle.");
        }

        sc.close();
    }
}

/*output:
Enter side a: 3
Enter side b: 4
Enter side c: 5
The given sides form a valid triangle.
Area of the triangle = 6.00