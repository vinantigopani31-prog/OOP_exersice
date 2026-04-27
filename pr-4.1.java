import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    void areaTriangle() {
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Rectangle extends Shape {
    void areaRectangle() {
        double area = d1 * d2;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        System.out.print("Enter base and height of Triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        t.getData(b, h);
        t.areaTriangle();

        System.out.print("Enter length and width of Rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        r.getData(l, w);
        r.areaRectangle();

        sc.close();
    }
}

/*output:
Enter base and height of Triangle: 8 4
Area of Triangle = 16.0
Enter length and width of Rectangle: 10 5
Area of Rectangle = 50.0*/