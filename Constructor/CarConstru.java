package Constructor;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle: Default constructor");
    }

    Vehicle(String type) {
        System.out.println("Vehicle: Type - " + type);
    }
}

class Car extends Vehicle {
    Car() {
        this("Sedan");  
        System.out.println("Car: Default constructor");
    }

    Car(String model) {
        super("Car");  
        System.out.println("Car: Model - " + model);
    }
}

public class CarConstru {
    public static void main(String[] args) {
        Car c = new Car();  
    }
}

