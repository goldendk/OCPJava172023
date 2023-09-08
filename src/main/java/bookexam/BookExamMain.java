package bookexam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BookExamMain {
    public static void main(String... args) {
        boolean flag = false;
        if (false)
        //while  (false) // does not compile.
            flag = !flag;

        System.out.println(flag);
        parse();
    }

    private static void parse() {
        Locale.setDefault(Locale.US);
        String input = "'the time is 15 minutes past 10PM";
        String pattern = "' the time is 'mm' minutes past 'ha";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        //LocalTime time = LocalTime.parse(input, dtf);
        LocalDate localDate = LocalDate.parse(input, dtf);
    }


}
