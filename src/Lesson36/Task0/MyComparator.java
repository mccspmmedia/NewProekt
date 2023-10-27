package Lesson36.Task0;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        // Сначала проверяем, является ли число четным или нечетным
        boolean isNum1Even = num1 % 2 == 0;
        boolean isNum2Even = num2 % 2 == 0;

        // Если оба числа либо четные, либо нечетные, сравниваем их обычным образом
        if (isNum1Even == isNum2Even) {
            return num1.compareTo(num2);
        }

        // В противном случае, сравниваем четное число с нечетным так, чтобы четное идет первым
        return isNum1Even ? -1 : 1;
    }
}

