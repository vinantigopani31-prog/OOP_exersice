import java.util.Scanner;
abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}
class Car extends Vehicle {
    String fuel;
    Car(String fuel) {
        this.fuel = fuel;
    }
    @Override
    String fuelType() {
        return fuel;
    }
    @Override
    int noOfWheels() {
        return 4;
    }
}
class Bike extends Vehicle {
    String fuel;
    Bike(String fuel) {
        this.fuel = fuel;
    }
    @Override
    String fuelType() {
        return fuel;
    }
    @Override
    int noOfWheels() {
        return 2;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline
        Vehicle v;
        if (choice == 1) {
            System.out.print("Enter fuel type for Car (Petrol/Diesel): ");
            String fuel = sc.nextLine();
            v = new Car(fuel);
            System.out.println("\n--- Car Details ---");
            System.out.println("Fuel Type: " + v.fuelType());
            System.out.println("Number of Wheels: " + v.noOfWheels());
        } else if (choice == 2) {
            System.out.print("Enter fuel type for Bike (Petrol): ");
            String fuel = sc.nextLine();
            v = new Bike(fuel);
            System.out.println("\n--- Bike Details ---");
            System.out.println("Fuel Type: " + v.fuelType());
            System.out.println("Number of Wheels: " + v.noOfWheels());
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
/*output:
Choose Vehicle Type:
1. Car
2. Bike
1
Enter fuel type for Car (Petrol/Diesel): Diesel

--- Car Details ---
Fuel Type: Diesel
Number of Wheels: 4
  
Choose Vehicle Type:
1. Car
2. Bike
2
Enter fuel type for Bike (Petrol): Petrol

--- Bike Details ---
Fuel Type: Petrol
Number of Wheels: 2*/