package factory;

abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Riding a motorcycle");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

public class Factory {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive(); // Output: Driving a car

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive(); // Output: Riding a motorcycle
    }
}

