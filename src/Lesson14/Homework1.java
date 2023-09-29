package Lesson14;
public class Homework1 {
    public static void main(String[] args) {
        int number = 5;

        if (number < 0) {
            System.out.println("Число должно быть неотрицательным.");
        } else {
            long result = calculatePowerOfTwo(number);
            System.out.println("2 в степени " + number + " равно " + result);
        }
    }

    public static long calculatePowerOfTwo(int n) {
        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }

        return result;
    }
}
