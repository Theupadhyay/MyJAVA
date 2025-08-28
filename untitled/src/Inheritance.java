class vihecle{
    String brand;
    int speed;

    vihecle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    void start(){
        System.out.println(brand + " started");
    }
    void stop(){
        System.out.println(brand + " stopped");
    }
}
class car extends vihecle{
    int doors;

    car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showCarDetails(){
        System.out.println(brand + " Car | Speed: " + speed + " | Doors: " + doors);
    }
}
class Bike extends vihecle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    void showBikeDetails() {
        System.out.println(brand + " Bike | Speed: " + speed + " | Has Gear: " + hasGear);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        car car = new car("Toyota", 120, 4);
        Bike bike = new Bike("Hero", 80, true);

        car.start();
        car.showCarDetails();
        car.stop();

        System.out.println();

        bike.start();
        bike.showBikeDetails();
        bike.stop();
    }
}
