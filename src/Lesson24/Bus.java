package Lesson24;
public class Bus extends Vehicle {

    int capacity;
    int countPassengers;
    private int totalMileage; // Поле для хранения общего пробега

    public Bus() {
        this.setModel("Bus-01");
    }

    public Bus(String model, int yearOfMan, int capacity) {
        super(model, yearOfMan);
        System.out.println("Конструктор Bus");
        this.capacity = capacity;
    }

    public void takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
        } else {
            System.out.println("Автобус полный!");
        }
    }

    public void dropOffPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса");
        } else {
            System.out.println("В автобусе больше нет пассажиров!");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getTotalMileage() {
        return totalMileage;
    }

    // Метод для увеличения общего пробега
    public void addMileage(int mileage) {
        totalMileage += mileage;
    }
}
