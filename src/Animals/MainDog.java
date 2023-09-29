package Animals;

import Animals.Dog;

public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);
        System.out.println(dog.whoAmI());

        dog.run();


        System.out.println(dog.whoAmI());
    }
}