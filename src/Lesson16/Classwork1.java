public class Classwork1 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 2;

        int result = calculatePower(base, exponent);
        System.out.println(base + " в степени " + exponent + " равно " + result);
    }

    // Метод для вычисления степени числа
    public static int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Экспонент должен быть неотрицательным.");
            return -1; // Возвращаем -1 как индикатор ошибки
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
