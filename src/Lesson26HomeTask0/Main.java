package Lesson26HomeTask0;

class Vehicle {
    public void startEngine() {
        System.out.println("Двигатель транспортного средства запущен.");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }
}

class Bicycle extends Vehicle {
    // Нет переопределения, так как у велосипеда нет двигателя.
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель мотоцикла запущен.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
