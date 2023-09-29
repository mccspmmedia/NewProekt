package Lesson14;
public class Homework0 {

    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverse(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Некорректный индекс.");
            return;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = arr.length - 1; i >= index; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printArray(int[] arr, boolean reverse) {
        if (reverse) {
            printReverse(arr);
        } else {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};

        System.out.println("Массив в обратной последовательности:");
        printReverse(array);

        System.out.println("Массив с индексом 2:");
        printReverse(array, 2);

        System.out.println("Массив в зависимости от флага (false):");
        printArray(array, false);

        System.out.println("Массив в зависимости от флага (true):");
        printArray(array, true);
    }
}
