package Lesson16;
public class Homework3 {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date"};
        String target = "cherry";

        int resultIndex = searchInArray(stringArray, target);

        if (resultIndex != -1) {
            System.out.println("Строка найдена в индексе: " + resultIndex);
        } else {
            System.out.println("Строка не найдена.");
        }
    }

    public static int searchInArray(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Возвращаем индекс, если строка найдена
            }
        }

        return -1; // Возвращаем -1, если строка не найдена
    }
}

