package chapter18;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Enumeration;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class I18NMain {

    public static void main(String... args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("bundle1"); // default locale.
        String foo = bundle.getString("foo");
        System.out.println(foo);

        System.out.println("bar=" + bundle.getObject("bar").getClass().getSimpleName());
        ResourceBundle daBundle = ResourceBundle.getBundle("bundle1", new Locale("da"));
        System.out.println(daBundle.getString("foo"));

        ResourceBundle daDKBundle = ResourceBundle.getBundle("bundle1", new Locale("da", "dk")); // country is case-insensitive but maybe because is on windows.
        System.out.println(daDKBundle.getString("foo"));

        try {

            ResourceBundle bundle3 = ResourceBundle.getBundle("bundle3");
        } catch (MissingResourceException e) {
            System.out.println("WARNING: missing resource bundle!!!! (bundle3)");
        }

        try {
            ResourceBundle resource4 = ResourceBundle.getBundle("chapter18.bundle4");
        } catch (Exception e) {
            System.out.println("local bundle4 missing");
        }


        try {
            ResourceBundle resource4 = ResourceBundle.getBundle("chapter18.bundle5");
        } catch (Exception e) {
            System.out.println("resources bundle 5 missing");
        }

        ResourceBundle bundle2 = ResourceBundle.getBundle("chapter18.bundle2", Locale.FRANCE);
        System.out.println(bundle2.keySet());

        for(String s : bundle2.keySet()){
            System.out.println(bundle2.getString(s));
        }


        //some formatting.
        DateTimeFormatter day = DateTimeFormatter.ofPattern("day").localizedBy(Locale.UK);
        String format = day.format(LocalDateTime.of(2021, Month.APRIL, 1, 14, 30, 0));
        System.out.println(format);

        LocalDate foolsDay = LocalDate.of(2021, Month.APRIL, 1);
        Locale.setDefault(Locale.UK);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(formatter.getLocale());
        System.out.println(formatter.format(foolsDay));
        Locale.setDefault(Locale.FRANCE);
        System.out.println(formatter.getLocale());
        System.out.println(formatter.format(foolsDay));
        Locale.setDefault(Locale.CHINA);
        System.out.println(formatter.getLocale());
        System.out.println(formatter.format(foolsDay));
//
//        NumberFormat percentInstance = NumberFormat.getPercentInstance(Locale.US);
//        System.out.println(percentInstance.format(0.9876));
//
//
//        MessageFormat messageFormat = new MessageFormat("{0}");
//        messageFormat.setFormat(0, null);



    }

}
