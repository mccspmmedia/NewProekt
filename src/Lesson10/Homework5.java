package Lesson10;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число:");
        String userInput = scanner.nextLine();

        int sum = 0;

        // Перебираем каждую цифру в строке пользователя
        for (int i = 0; i < userInput.length(); i++) {
            char digitChar = userInput.charAt(i);

            // Проверяем, является ли символ цифрой
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                sum += digit; // Добавляем цифру к сумме
            }
        }

        System.out.println("Сумма цифр числа: " + sum);

        scanner.close();
    }
}

