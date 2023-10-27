package Lesson36.Task1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new MyComparator());

        // Вывод отсортированного массива
        for (Integer num : integers) {
            System.out.print(num + " ");
        }
    }
}
