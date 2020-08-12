package localization;

import java.util.Locale;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/12/20 4:23 PM
 */

public class LocaleExample {
    public static void main(String[] args) {
        //Locale locale = Locale.getDefault(); //default is USA

        Locale locale = new Locale("bn", "BD"); // for Bangladesh
        //Locale locale = new Locale("en", "CA"); // for Canada

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getLanguage());

        System.out.println(locale.getDisplayName());

        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());



    }
}
