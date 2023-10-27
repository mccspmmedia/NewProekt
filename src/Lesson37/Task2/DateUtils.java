package Lesson37.Task2;
import java.time.LocalDate;
import java.util.List;

public class DateUtils {
    public static long getDaysBetweenMinMax(List<LocalDate> dateList) {
        if (dateList == null || dateList.isEmpty()) {
            return 0;
        }

        LocalDate minDate = dateList.get(0);
        LocalDate maxDate = dateList.get(0);

        for (LocalDate date : dateList) {
            if (date.isBefore(minDate)) {
                minDate = date;
            }
            if (date.isAfter(maxDate)) {
                maxDate = date;
            }
        }

        return minDate.until(maxDate).getDays();
    }
}
