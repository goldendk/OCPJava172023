package chapter6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Chapter6Main {

    public static void main(String... args) {
        //immutable datetime formatter.
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().toFormatter();

        SimpleDateFormat sdf = new SimpleDateFormat();

        foo();
    }

    private static void foo() {
        try {
            // this was one error on the exam - good thing there were not too many of these.
            // catch clauses are  mandatory.
//            try{
//                OutputStream outputStream = new ByteArrayOutputStream();
//                outputStream.write(3);
//            }
//            try{
//                OutputStream outputStream = new ByteArrayOutputStream();
//                outputStream.write(3);
//            }

            OutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(3);

        } catch (IOException e) {

        }
    }
}
