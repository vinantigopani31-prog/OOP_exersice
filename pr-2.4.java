class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println();

        System.out.println("Rectangle 2:");
        r2.display();

        System.out.println();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}

/*output:
Rectangle 1:
Width: 4.0
Height: 40.0
Area: 160.0
Perimeter: 88.0

Rectangle 2:
Width: 3.5
Height: 35.9
Area: 125.64999999999999
Perimeter: 78.8

Rectangle 1 has a larger area.*/