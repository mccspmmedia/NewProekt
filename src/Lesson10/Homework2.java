package Lesson10;
public class Homework2 {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("Числа от 1 до 100, делящиеся на 5 без остатка:");

        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }
}
