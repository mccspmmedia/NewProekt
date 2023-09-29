package Lesson12;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float depositAmount = scanner.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        float interestRate = 0.07f; // 7% годовых

        for (int i = 0; i < months; i++) {
            depositAmount += depositAmount * interestRate;
        }

        System.out.println("Итоговая сумма вклада после " + months + " месяцев: " + depositAmount);

        scanner.close();
    }
}

