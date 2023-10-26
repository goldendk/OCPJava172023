package book.test15;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class Test15Main {
    public static void main(String[] args) throws SQLException {
        Format formatter1 = NumberFormat.getCurrencyInstance();
        DecimalFormat formatter2 = (DecimalFormat) NumberFormat.getPercentInstance();
        Format formatter3 = NumberFormat.getNumberInstance();
        System.out.println(formatter1.getClass().getName());
        System.out.println(formatter2.getClass().getName());
        System.out.println(formatter3.getClass().getName());


        System.out.println("--------------------");

        iCanDoThis();

        System.out.println("--------------------");

        //Connection connection = null;
        //CallableStatement foo = connection.prepareCall("foo");

        System.out.println("----------------------");
        System.out.println("String".replace('g', 'g') == "String");
        System.out.println("----------------------");

        String hello = "Hello", lo = "lo";
        System.out.print((book.test15.Other.hello == hello) + " ");    //line 1
        System.out.print((book.test15.other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel" + "lo")) + " ");           //line 3
        System.out.print((hello == ("Hel" + lo)) + " ");              //line 4
        System.out.println(hello == ("Hel" + lo).intern());          //line 5
        System.out.println("--------------------");
        parallelStream();
        System.out.println("--------------------");

        int foo = Arrays.binarySearch(new String[]{""}, "foo");
        int[][][] a = new int[1][][];
        System.out.println(a[0].length);
        OutputStream os;

    }

    public static void parallelStream() {
        List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");
        String join = vals.parallelStream().
                peek(System.out::println) //this shows how the elements are retrieved from the stream
                .reduce("_", (a, b) -> {
                    System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                    return a.concat(b);
                }, (a, b) -> {
                    System.out.println("combining " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                    return a.concat(b);
                });
        System.out.println(join);
    }

    public static void iCanDoThis() {
        int x = 2;
        int y = ~x;  //LINE 2
        int z = x ^ y;  //LINE 3
        boolean flag = x < y & x > z++; //   LINE 4
        if (flag) {
            flag = x > y && x > --z;  //LINE 6
        }
        if (z > -1) {  //LINE 8
            --z;
        } else z++;
        System.out.println(flag + " " + z);   //LINE 11
    }
}
