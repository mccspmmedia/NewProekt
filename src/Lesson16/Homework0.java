package Lesson16;
public class Homework0 {
    public static void main(String[] args) {
        String input = "Пример строки с маленькими буквами abcdefg";
        String result = convertToUpperCase(input);
        System.out.println(result);
    }

    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar >= 'a' && currentChar <= 'z') {
                // Если символ - маленькая латинская буква, перевести в верхний регистр
                char upperCaseChar = (char)(currentChar - 'a' + 'A');
                result.append(upperCaseChar);
            } else {
                // Иначе оставить символ без изменений
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
