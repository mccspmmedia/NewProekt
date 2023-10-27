package Lesson37.Task1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Текущая дата: " + currentDate.format(dateFormatter));

        // Текущий год, месяц и день
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        // Создание и вывод даты рождения
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        System.out.println("Дата рождения: " + birthday.format(dateFormatter));

        // Создание двух дат и проверка на равенство
        LocalDate date1 = LocalDate.of(2023, 10, 25);
        LocalDate date2 = LocalDate.of(2023, 10, 25);
        if (date1.equals(date2)) {
            System.out.println("Даты равны");
        } else {
            System.out.println("Даты не равны");
        }

        // Текущее время и время + 3 часа
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Текущее время: " + currentTime.format(timeFormatter));

        LocalTime timeIn3Hours = currentTime.plusHours(3);
        System.out.println("Текущее время + 3 часа: " + timeIn3Hours.format(timeFormatter));

        // Создание дат на неделю позже, на год раньше и на год позже
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastYear = today.minusYears(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("Сегодня: " + today);
        System.out.println("На неделю позже: " + nextWeek);
        System.out.println("На год раньше: " + lastYear);
        System.out.println("На год позже: " + nextYear);

        // tomorrow и yesterday и проверка находятся ли они до или после сегодняшней
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);

        if (tomorrow.isAfter(today)) {
            System.out.println("Завтрашний день находится после сегодняшнего");
        } else if (tomorrow.isBefore(today)) {
            System.out.println("Завтрашний день находится перед сегодняшним");
        } else {
            System.out.println("Завтрашний день и сегодняшний день совпадают");
        }

        if (yesterday.isAfter(today)) {
            System.out.println("Вчерашний день находится после сегодняшнего");
        } else if (yesterday.isBefore(today)) {
            System.out.println("Вчерашний день находится перед сегодняшним");
        } else {
            System.out.println("Вчерашний день и сегодняшний день совпадают");
        }
    }
}
