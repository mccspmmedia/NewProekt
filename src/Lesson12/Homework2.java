package Lesson12;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int primeCount = 0;

        Random random = new Random();

        // Заполняем массив случайными числами от 1 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Массив случайных чисел:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nПростые числа в массиве:");

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
        }

        System.out.println("\nКоличество простых чисел: " + primeCount);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

