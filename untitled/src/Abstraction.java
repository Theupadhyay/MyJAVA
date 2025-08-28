// Abstract class
abstract class Vehicles {
    abstract void start();   // abstract method (no implementation)

    void fuel() {  // normal method
        System.out.println("Vehicle needs fuel.");
    }
}

// Child class Car implements abstract method
class Cars extends Vehicles {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Child class Bike implements abstract method
class Bikes extends Vehicles {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Vehicles v1 = new Cars();
        Vehicles v2 = new Bikes();

        v1.start();  // Car's start
        v1.fuel();   // common method

        v2.start();  // Bike's start
        v2.fuel();
    }
}

