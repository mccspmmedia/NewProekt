package Lesson24;

public class Main24 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle1", 2023);
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Модель " + vehicle1.getModel());
//
//        System.out.println(vehicle.toString());
//        vehicle.start();
//        vehicle.stop();

        System.out.println("\n=========================");

        Bus bus = new Bus("Bus-xModel", 2000, 3);
        System.out.println(bus.toString());
        bus.start();
        bus.stop();
        bus.dropOffPassenger();

        bus.takePassenger();
        bus.takePassenger();
        System.out.println("Пассажиров в автобусе: " + bus.getCountPassengers());
        bus.takePassenger();
        bus.dropOffPassenger();

        bus.takePassenger();
        System.out.println("Пассажиров в автобусе: " + bus.getCountPassengers());


        System.out.println("\n=========================");
        Bus bus1 = new Bus();
        bus1.start();
        bus1.stop();

        System.out.println("\n=========================");

        InternationalBus iBus =
                new InternationalBus("Ikarus",
                        1999, 32, new String[]{"Spain", "Italy", "Germany"});

        System.out.println(iBus.toString());
        iBus.start();
        iBus.takePassenger();
        iBus.takePassenger();
        iBus.dropOffPassenger();

        iBus.goToRoute(1000);





    }
}
