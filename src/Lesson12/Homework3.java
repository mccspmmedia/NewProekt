package Lesson12;
public class Homework3 {
    public static void main(String[] args) {
        int rows = 6; // Количество строк в треугольнике

        for (int i = 1; i <= rows; i++) {
            // Выводим пробелы перед цифрами
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Выводим цифры от 1 до i
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Переходим на следующую строку
            System.out.println();
        }
    }
}

