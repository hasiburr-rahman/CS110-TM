package Interface;

// Vehicle interface with required methods
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

// Bicycle class implementing Vehicle
class Bicycle implements Vehicle {
    private int speed;
    private int gear;

    public Bicycle() {
        speed = 0;
        gear = 1;
    }

    public void changeGear(int a) {
        gear = a;
    }

    public void speedUp(int a) {
        speed += a;
    }

    public void applyBrakes(int a) {
        speed -= a;
        if (speed < 0) speed = 0;
    }

    public void displayStatus() {
        System.out.println("Bicycle - Speed: " + speed + ", Gear: " + gear);
    }
}

// Bike class implementing Vehicle
class Bike implements Vehicle {
    private int speed;
    private int gear;

    public Bike() {
        speed = 0;
        gear = 1;
    }

    public void changeGear(int a) {
        gear = a;
    }

    public void speedUp(int a) {
        speed += a;
    }

    public void applyBrakes(int a) {
        speed -= a;
        if (speed < 0) speed = 0;
    }

    public void displayStatus() {
        System.out.println("Bike - Speed: " + speed + ", Gear: " + gear);
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        // Create Bicycle and Bike objects
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();

        // Perform 3 operations on Bicycle
        bicycle.changeGear(2);
        bicycle.speedUp(10);
        bicycle.applyBrakes(3);
        bicycle.displayStatus(); // Show final state

        // Perform 3 operations on Bike
        bike.changeGear(3);
        bike.speedUp(25);
        bike.applyBrakes(10);
        bike.displayStatus(); // Show final state
    }
}
