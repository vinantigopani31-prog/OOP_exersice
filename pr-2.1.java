public class RectangleTest {

    // Rectangle class
    static class Rectangle {
        double width = 1;
        double height = 1;

        // No-argument constructor
        Rectangle() {
        }

        // Parameterized constructor
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Method to calculate area
        double getArea() {
            return width * height;
        }

        // Method to calculate perimeter
        double getPerimeter() {
            return 2 * (width + height);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Object using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Values)");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

        // Object using parameterized constructor
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Rectangle 2 (Custom Values)");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}

/*output:
Rectangle 1 (Default Values)
Width: 1.0
Height: 1.0
Area: 1.0
Perimeter: 4.0

Rectangle 2 (Custom Values)
Width: 5.0
Height: 3.0
Area: 15.0
Perimeter: 16.0*/