package Lesson12;
import java.util.Random;

public class Classwork1 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(11) + 5; // Генерируем случайную длину массива от 5 до 15
        int[] randomArray = new int[arrayLength]; // Создаем массив с случайной длиной

        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Случайные числа от -50 до 50:");

        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = random.nextInt(101) - 50; // Генерируем случайное число от -50 до 50
            randomArray[i] = randomNumber;
            System.out.println("Элемент " + i + ": " + randomNumber);
        }
    }
}
