package Lesson18;
public class Dog {
    private String name;
    private int jumpHeight; // высота прыжка
    private int maxJumpHeight; // максимальная высота после тренировок

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2; // Максимальная высота после тренировок
    }

    public void train() {
        if (jumpHeight < maxJumpHeight) {
            jumpHeight += 10;
            System.out.println(name + " тренируется и увеличивает высоту прыжка до " + jumpHeight + " см.");
        } else {
            System.out.println(name + " достиг максимальной высоты прыжка в " + jumpHeight + " см.");
        }
    }

    public void jump(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " перепрыгнул барьер высотой " + barrierHeight + " см.");
        } else {
            System.out.println(name + " не смог перепрыгнуть барьер высотой " + barrierHeight + " см.");
            if (jumpHeight < maxJumpHeight) {
                System.out.println(name + " тренируется и увеличивает высоту прыжка.");
                train();
                if (jumpHeight >= barrierHeight) {
                    System.out.println(name + " теперь способен перепрыгнуть барьер высотой " + barrierHeight + " см.");
                } else {
                    System.out.println(name + " не смог достичь высоты для прыжка.");
                }
            } else {
                System.out.println(name + " не способен перепрыгнуть барьер.");
            }
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 20); // Создаем собаку с высотой прыжка 20 см

        // Примеры прыжков через барьер
        dog.jump(15); // Бобик перепрыгнет барьер высотой 15 см
        dog.jump(25); // Бобик тренируется, увеличивает высоту прыжка до 30 см и перепрыгивает барьер
        dog.jump(50); // Бобик не сможет перепрыгнуть барьер высотой 50 см
        dog.train(); // Бобик тренируется, но достиг максимальной высоты прыжка

        // Пример тренировки и прыжка после достижения максимальной высоты
        dog.train(); // Бобик не может больше тренироваться
        dog.jump(30); // Бобик перепрыгнет барьер высотой 30 см
    }
}
