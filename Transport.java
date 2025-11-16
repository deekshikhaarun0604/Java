class Vehicle {
    String brand;
    int speed;

    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    int numberOfDoors = 4;

    public void showCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


class Bike extends Vehicle {
    boolean hasGear = true;

    public void showBikeDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Has Gear: " + hasGear);
    }
}


public class Transport {
    public static void main(String[] args) {

        Car c = new Car();
        c.brand = "Toyota";
        c.start();
        c.showCarDetails();

        System.out.println();

        Bike b = new Bike();
        b.brand = "Royal Enfield";
        b.start();
        b.showBikeDetails();
    }
}
