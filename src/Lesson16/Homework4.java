package Lesson16;
public class Homework4 {
    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "He";
        String input3 = "H";

        String result1 = getSubstringToUpperCase(input1);
        String result2 = getSubstringToUpperCase(input2);
        String result3 = getSubstringToUpperCase(input3);

        System.out.println("Результат 1: " + result1);
        System.out.println("Результат 2: " + result2);
        System.out.println("Результат 3: " + result3);
    }

    public static String getSubstringToUpperCase(String input) {
        if (input.length() >= 3) {
            char char2 = Character.toUpperCase(input.charAt(1));
            char char3 = Character.toUpperCase(input.charAt(2));
            return String.valueOf(char2) + char3;
        } else {
            return input.toUpperCase(); // Если строка содержит меньше 3 символов, перевести все символы в верхний регистр
        }
    }
}

