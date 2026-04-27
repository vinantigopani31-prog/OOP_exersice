import java.util.Scanner;

class Volume {

    void calculateVolume(double side) {
        double volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }

    void calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume of Rectangular Cube = " + volume);
    }

    void calculateVolume(int radius) {
        double volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of Cube: ");
        double side = sc.nextDouble();
        v.calculateVolume(side);

        System.out.print("Enter length, width, height of Rectangular Cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        v.calculateVolume(l, w, h);

        System.out.print("Enter radius of Sphere: ");
        int r = sc.nextInt();
        v.calculateVolume(r);

        sc.close();
    }
}

/* output:
Enter side of Cube: 4
Volume of Cube = 64.0
Enter length, width, height of Rectangular Cube: 4 3 2
Volume of Rectangular Cube = 24.0
Enter radius of Sphere: 3
Volume of Sphere = 113.03999999999998
*/