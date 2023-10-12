package Lesson25;
public class BusDriver {
    private final int id;
    private String name;
    private String driveLicence;
    private Bus bus1;
    private Bus bus2;

    private static int counter;

    public BusDriver(String name, String driveLicence) {
        this.name = name;
        this.driveLicence = driveLicence;
        this.id = counter++;
    }

    public void assignBus1(Bus bus) {
        bus1 = bus;
    }

    public void assignBus2(Bus bus) {
        bus2 = bus;
    }

    public Bus getBus1() {
        return bus1;
    }

    public Bus getBus2() {
        return bus2;
    }

    // Остальные методы и геттеры/сеттеры
}
