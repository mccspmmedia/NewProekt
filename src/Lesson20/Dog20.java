public class Dog20 {
    private String name;
    private int jumpHeight;
    private int increasePerOneTraining;
    private int maxJumpHeight;

    // Добавляем константу для увеличения высоты прыжка
    private static final int JUMP_INCREASE = 10;

    // Добавляем поле для подсчета прыжков
    private static int totalJumps = 0;

    public Dog20(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.increasePerOneTraining = JUMP_INCREASE;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void jump() {
        System.out.println(name + " прыгнула!");
        totalJumps++; // Увеличиваем счетчик прыжков
    }

    public void train() {
        if (jumpHeight < maxJumpHeight) {
            jumpHeight += increasePerOneTraining;
        }

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }
    }

    public boolean takeBarrier(int barrier) {
        // Текущий прыжок vs барьер?
        if (jumpHeight >= barrier) {
            jump();
            return true;
        }

        if (maxJumpHeight >= barrier) {
            // собачка может. Надо тренироваться
            System.out.println(name + " идет тренироваться");
            while (jumpHeight < barrier) {
                train();
            }
            jump();
            System.out.printf("Собака %s перепрыгивает барьер: %d!\n", name, barrier);
            System.out.println("Текущий прыжок: " + jumpHeight);

            return true;

        } else {
            System.out.printf("Барьер высотой %d собака %s взять не может!\n", barrier, name);
            System.out.println("Текущий прыжок: " + jumpHeight);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    // Добавляем статический метод для получения общего количества прыжков
    public static int getTotalJumps() {
        return totalJumps;
    }

    public String toString() {
        return "Dog " + name + "; current jump: " + jumpHeight;
    }
}
