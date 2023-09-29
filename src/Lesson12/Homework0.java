package Lesson12;
import java.util.Random;

public class Homework0 {
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101); // Генерируем случайное число от 0 до 100
        }

        // Выводим массив на экран
        System.out.println("Массив случайных чисел:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Подсчитываем количество четных чисел и их сумму
        int evenCount = 0;
        int evenSum = 0;

        for (int num : randomArray) {
            if (num % 2 == 0) {
                evenCount++;
                evenSum += num;
            }
        }


        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Сумма всех четных чисел: " + evenSum);
    }
}
