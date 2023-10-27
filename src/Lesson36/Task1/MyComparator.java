package Lesson36.Task1;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        boolean isNum1Even = num1 % 2 == 0;
        boolean isNum2Even = num2 % 2 == 0;

        if (isNum1Even && isNum2Even) {
            return num1.compareTo(num2); // Сначала четные в порядке возрастания
        } else if (!isNum1Even && !isNum2Even) {
            return num2.compareTo(num1); // Затем нечетные в порядке убывания
        } else if (isNum1Even) {
            return -1; // Четные идут перед нечетными
        } else {
            return 1; // Нечетные идут после четных
        }
    }
}

