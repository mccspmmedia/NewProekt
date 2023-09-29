package Lesson11;
import java.util.Random;

public class Homevork0 {
    public static void main(String[] args) {
        int[] numbers = new int[6]; // Создаем массив из 6 элементов
        Random random = new Random();

        // Заполняем массив случайными значениями
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        // Находим минимальное значение в массиве
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Находим максимальное значение в массиве
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Находим сумму всех значений в массиве
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Вычисляем среднее арифметическое
        double average = (double) sum / numbers.length;

        // Выводим результаты на экран
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}
