package Lesson10;
public class Homework3 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("Первые 7 чисел от 1 до 100, делящиеся на 5 без остатка:");

        while (count < 7) {
            if (number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

