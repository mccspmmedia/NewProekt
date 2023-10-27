package Lesson37.Task2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> dateList = new ArrayList<>();
        dateList.add(LocalDate.of(2023, 10, 1));
        dateList.add(LocalDate.of(2023, 10, 15));
        dateList.add(LocalDate.of(2023, 11, 5));

        long daysBetween = DateUtils.getDaysBetweenMinMax(dateList);

        System.out.println("Количество дней между самой ранней и поздней датами: " + daysBetween);
    }
}
