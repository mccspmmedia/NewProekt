package Lesson16;
public class Homework1 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = {"apple", "banana", "cherry", "date"};

        // Пример использования метода swap для массива целых чисел
        swap(intArray, 1, 5);
        printArray(intArray);

        // Пример использования метода swap для массива строк
        swap(stringArray, 0, 3);
        printArray(stringArray);
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Индексы находятся за пределами массива.");
            return;
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(String[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Индексы находятся за пределами массива.");
            return;
        }

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

