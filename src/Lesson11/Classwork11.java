package Lesson11;
import java.util.Random;

public class Classwork11 {
    public static void main(String[] args) {
        int[] randomArray = new int[10]; // Создаем массив из 10 элементов
        Random random = new Random();

        System.out.println("Случайные числа от 0 до 100:");

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101); // Генерируем случайное число от 0 до 100
            System.out.println("Элемент " + i + ": " + randomArray[i]);
        }
    }
}
