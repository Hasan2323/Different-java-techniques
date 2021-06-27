import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Muhammad Saimon
 * @since Jun 6/27/21 11:19 AM
 */

public class DateCompare {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate todayPlus3 = LocalDate.now().plusDays(3);
        System.out.println("Day after 2 : " + todayPlus3);

        LocalDate from = LocalDate.from(todayPlus3);
        System.out.println("from : " + from);


        Stream<LocalDate> datesUntil = LocalDate.now().plusDays(1).datesUntil(todayPlus3);
        System.out.println("dateUntil : " + datesUntil.collect(Collectors.toList()));

        List<String> collect = LocalDate.now().plusDays(1).datesUntil(todayPlus3)
                .map(localDate -> localDate.format(formatter)).collect(Collectors.toList());
        System.out.println("Formatted: " + collect);

    }
}
