import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Muhammad Saimon
 * @since Jun 6/27/21 11:19 AM
 */

public class DateCompare {
    public static void main(String[] args) {
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter yyyy_MM_dd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate todayPlus3 = LocalDate.now().plusDays(3);
        System.out.println("Day after 3 : " + todayPlus3);

        String formatTodayPlus3 = todayPlus3.format(yyyyMMdd);
        System.out.println("Day after 3 formatted: " + formatTodayPlus3);

        LocalDate from = LocalDate.from(todayPlus3);
        System.out.println("from : " + from);


        Stream<LocalDate> datesUntil = LocalDate.now().plusDays(1).datesUntil(todayPlus3);
        System.out.println("dateUntil : " + datesUntil.collect(Collectors.toList()));

        List<String> collect = LocalDate.now().plusDays(1).datesUntil(todayPlus3)
                .map(localDate -> localDate.format(yyyyMMdd)).collect(Collectors.toList());
        System.out.println("Formatted: " + collect);


        System.out.println("\n################# Find Months Between two Dates ##################\n");
        // https://stackoverflow.com/questions/48950145/java-8-calculate-months-between-two-dates

        String openingDate = "2021-05-11 12:20:10:870 +0600";
        DateTimeFormatter LOCAL_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS Z");

        LocalDateTime parse = LocalDateTime.parse(openingDate, LOCAL_DATE_TIME_FORMAT);

        System.out.println("Parse to LocalDateTime to LocalDate: " + parse.toLocalDate());

//        LocalDate desiredDay = LocalDate.of(2020, Month.JANUARY, 15);
        LocalDate accountOpenDate = parse.toLocalDate();
        LocalDate currentDay = LocalDate.now();

        System.out.println("From " + accountOpenDate + " To " + currentDay);

        //-------------------------------------------------------------
        Period age = Period.between(accountOpenDate, currentDay);
        int years = age.getYears();
        int months = age.getMonths();
        System.out.println("Years : " + years + " and Months : " + months);

        int numberOfMonthsBetweenDates = months + years * 12;
        System.out.println("Number of Months using Period : " + numberOfMonthsBetweenDates);
        //---------------------------------------------------------------

        long monthsBetween = ChronoUnit.MONTHS.between(accountOpenDate, currentDay);
        System.out.println("Number of Months using ChronoUnit : " + monthsBetween);

        //---------------------------------------------------------------

        // If only you concern about the Year and Month NOT DATE, then use it
        long monthsBetween2 = ChronoUnit.MONTHS.between(YearMonth.from(LocalDate.parse("2021-01-31")), YearMonth.from(LocalDate.parse("2021-02-01")));
        System.out.println("Months using ChronoUnit only considering YEAR and MONTH : " + monthsBetween2);

        //---------------------------------------------------------------


    }
}
