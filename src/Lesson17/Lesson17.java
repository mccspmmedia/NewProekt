public class Lesson17 {
    String name;
    int age;
    String color;

    public Lesson17() {
        // Конструктор без параметров
    }

    public Lesson17(String name) {
        this.name = name;
        // Конструктор с одним параметром
    }

    public Lesson17(String name, String color) {
        this.name = name;
        this.color = color;
        // Конструктор с двумя параметрами
    }

    public Lesson17(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        // Конструктор с тремя параметрами
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void whoAmI() {
        System.out.println("I am a cat.");
    }

    public static void main(String[] args) {
        // Ваш код main() здесь...
    }
}
