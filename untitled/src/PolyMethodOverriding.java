// Parent class
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving...");
    }
}

// Child class Car
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving at high speed...");
    }
}

// Child class Bike
class bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bike is driving with balance...");
    }
}

public class PolyMethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // upcasting
        Vehicle v2 = new bike();

        v1.drive();  // Car's version
        v2.drive();  // Bike's version
    }
}
