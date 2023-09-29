package Lesson11;
public class Homework1 {
    public static void main(String[] args) {
        String[] arr = {"Eins", "Zwei", "Zwanzig"};

        // Находим самую длинную строку
        String longestString = "";

        for (String str : arr) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        // Выводим все символы из самой длинной строки
        for (char ch : longestString.toCharArray()) {
            System.out.print(ch + " ");
        }
    }
}
