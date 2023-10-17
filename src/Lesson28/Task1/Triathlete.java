package Lesson28.Task1;
public class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Триатлет плавает.");
    }

    @Override
    public void run() {
        System.out.println("Триатлет бежит.");
    }
}

