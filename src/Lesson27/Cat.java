package Lesson27;
public class Cat extends Animal {
    @Override
    void move() {
        System.out.println("Кот передвигается");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать!!! ");
    }
}
