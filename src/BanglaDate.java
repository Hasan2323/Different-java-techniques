import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @Author Muhammad Saimon
 * @since Mar 3/25/21 1:38 PM
 */

public class BanglaDate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat yyyy_MMM_dd = new SimpleDateFormat("yyyy-MMM-dd");

        // Date in Bangla
        Locale bangla = Locale.forLanguageTag("bn-BD");
        DateFormat timeInstance = SimpleDateFormat.getDateInstance(DateFormat.LONG, bangla);
        String todayBnDate = timeInstance.format(new Date());
        System.out.println(todayBnDate);

        // date conversion

        // -------------- opening date -------------------------
        String dateAsString = LocalDateTime.now(ZoneId.of("GMT+6")).toString(); // openingDate
        System.out.println("\nopeningDate: " + dateAsString); // 2021-05-12T12:51:50.813141

        LocalDateTime parse = LocalDateTime.parse(dateAsString);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        // String localTest = myFormatObj.format(parse);
        String localTest = parse.format(myFormatObj);
        System.out.println("openingDate output way 1: " + localTest.toUpperCase());

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(dateAsString);
        System.out.println("openingDate output way 2: " + yyyy_MMM_dd.format(date).toUpperCase(Locale.ENGLISH));
        // -------------- opening date end -------------------------

        System.out.println("");

        // -------------- maturity date -------------------------
        String maturityDateInput = "20230422124300";
        LocalDateTime parse2 = LocalDateTime.parse(maturityDateInput, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        String localTest2 = myFormatObj2.format(parse2);
        System.out.println("maturity date output way 1 : " + localTest2.toUpperCase());

        SimpleDateFormat format3 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date1 = format3.parse(maturityDateInput);
        System.out.println("maturity date output way 2 : " + yyyy_MMM_dd.format(date1).toUpperCase(Locale.ENGLISH));
        // ----------------------- maturity date end ---------------------------------------

        System.out.println("");

        // ----------------------- Cancellation Date ---------------------------------------
        SimpleDateFormat yyyy_MM_dd_hh_mm_ss_a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS a");
        String cancellationDateInput = yyyy_MM_dd_hh_mm_ss_a.format(new Date());
        System.out.println("Cancellation Date Input: " + cancellationDateInput); // 2021-05-12 12:51:50.864 PM

        LocalDateTime parse3 = LocalDateTime.parse(cancellationDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.SSS a"));
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        String outputDate1 = myFormatObj3.format(parse3);
        System.out.println("Cancellation Date output way 1: " + outputDate1.toUpperCase());

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date outputDate2 = format2.parse(cancellationDateInput);
        System.out.println("Cancellation Date output way 2: " + yyyy_MMM_dd.format(outputDate2).toUpperCase(Locale.ENGLISH));
        // ----------------------- Cancellation Date end ---------------------------------------


        // ----------------------------- UTC ---------------------------
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        String todayInUTC = formatter.format(new Date());
        System.out.println("\nToday in UTC (-6 hours version): " + todayInUTC);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String todayInUTCWithLocalDate = LocalDateTime.now(ZoneId.of("UTC")).format(dateTimeFormatter);

        System.out.println("Today in UTC with LocalDateTime (-6 hours version): " + todayInUTCWithLocalDate);
        // ----------------------------- UTC End ---------------------------


        // ----------------------------- UTC to yyyyMMddHHmmss ---------------------------
        DateTimeFormatter yyyyMMddHHmmssLocal = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime localDateTimeUTC = LocalDateTime.parse(todayInUTCWithLocalDate, dateTimeFormatter);
        String UTC_to_yyyyMMddHHmmss = localDateTimeUTC.format(yyyyMMddHHmmssLocal);
        System.out.println("\nUTC to yyyyMMddHHmmss with LocalDateTime: " + UTC_to_yyyyMMddHHmmss);

        SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
        String UTC_to_yyyyMMddHHmmss_2 = yyyyMMddHHmmss.format(formatter.parse(todayInUTC));
        System.out.println("UTC to yyyyMMddHHmmss way 2: " + UTC_to_yyyyMMddHHmmss_2);
        // ----------------------------- UTC to yyyyMMddHHmmss End ---------------------------



//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
//        Date parse = sdf.parse("12-oct-14");

//        SimpleDateFormat DATE_FORMAT_yyyy_MM_dd = new SimpleDateFormat("yyyy-MMM-dd");
//        //Date format1 = DATE_FORMAT_yyyy_MM_dd.parse("2021-03-24T19:56:16.928994");
//        String format = DATE_FORMAT_yyyy_MM_dd.format(new Date());
//        //System.out.println("Hello : " + format1);
//        System.out.println("Hello : " + format);

        String approval_request = TestEnum.valueOf("WEEKLY").getDescription();
        System.out.println("\n" + approval_request);








    }
}
