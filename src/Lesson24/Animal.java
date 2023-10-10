package Lesson24;
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String info() {
        return "Животное: " + name;
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String info() {
        String flightAbility = canFly ? "Умеет летать" : "Не умеет летать";
        return super.info() + ", " + flightAbility;
    }
}

class Mammal extends Animal {
    private int numberOfLegs;

    public Mammal(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String info() {
        return super.info() + ", Количество ног: " + numberOfLegs;
    }
}

