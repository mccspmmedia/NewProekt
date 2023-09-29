import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите начальную остановку ");
        String start = scanner.nextLine();
        System.out.println("Введите конечную остановку ");
        String finisch = scanner.nextLine();

        System.out.println("Введите количество минут");
        double minutes = scanner.nextDouble();

        System.out.println("Введите расстояние в метрах");
        double distance = scanner.nextInt();


        String massage = "Вам нужно от " + start + "до " + finisch +
                "проехать" + distance + "метров за " + minutes + "минут";

        System.out.println(massage);

    }

}

