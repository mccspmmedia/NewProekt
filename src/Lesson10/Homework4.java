package Lesson10;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetWord = "hello";
        int attempts = 0;

        System.out.println("Попробуйте угадать слово: ");

        while (true) {
            String userInput = scanner.nextLine();
            attempts++;

            if (userInput.equals(targetWord)) {
                System.out.println("Поздравляем! Вы угадали слово.");
                System.out.println("Количество попыток: " + attempts);
                break;
            } else {
                System.out.println("Попробуйте снова.");
            }
        }

        scanner.close();
    }
}

