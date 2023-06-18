package chapter6;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Chapter6Main {

    public static void main(String... args){
        //immutable datetime formatter.
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().toFormatter();

        SimpleDateFormat sdf = new SimpleDateFormat();
    }
}
