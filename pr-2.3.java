class Point {
    private int x;
    private int y;

    // Default constructor
    Point() {
        this.x = 5;
        this.y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Point p1 = new Point();
        System.out.println("Using Default Constructor:");
        p1.display();

        System.out.println();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.println("Using Parameterized Constructor:");
        p2.display();

        System.out.println();

        // Using copy constructor
        Point p3 = new Point(p2);
        System.out.println("Using Copy Constructor (copy of p2):");
        p3.display();
    }
}

/*output:
Using Default Constructor:
Point coordinates: (5, 5)

Using Parameterized Constructor:
Point coordinates: (10, 20)

Using Copy Constructor (copy of p2):
Point coordinates: (10, 20)*/