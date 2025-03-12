package chap08.polymorphism;

public class Driver {
    void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            System.out.println("//Bus");
        } else if (vehicle instanceof Taxi) {
            System.out.println("//Taxi");
        }
        vehicle.run();
    }
}
