package Lesson16;
public class Homework2 {
    public static void main(String[] args) {
        String input = "Пример строки для тестирования";

        // Примеры использования метода
        String result1 = getSubstring(input, 8);
        String result2 = getSubstring(input, 8, 15);

        System.out.println("Результат 1: " + result1);
        System.out.println("Результат 2: " + result2);
    }

    public static String getSubstring(String input, int startIndex) {
        if (startIndex < 0 || startIndex >= input.length()) {
            System.out.println("Некорректный индекс.");
            return "";
        }

        return input.substring(startIndex);
    }

    public static String getSubstring(String input, int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= input.length() || endIndex < 0 || endIndex > input.length() || startIndex > endIndex) {
            System.out.println("Некорректные индексы.");
            return "";
        }

        return input.substring(startIndex, endIndex);
    }
}

