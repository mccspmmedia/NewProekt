package Lesson16;
public class Classwork2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8};
        int targetNumber = 6;

        int index = findNumber(array, targetNumber);

        if (index != -1) {
            System.out.println("Число " + targetNumber + " найдено в массиве на позиции " + index);
        } else {
            System.out.println("Число " + targetNumber + " не найдено в массиве.");
        }
    }

    // Метод для поиска числа в массиве
    public static int findNumber(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Возвращаем индекс числа, если оно найдено
            }
        }
        return -1; // Возвращаем -1, если число не найдено
    }
}

