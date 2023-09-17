package book.test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Test8Main {
    public static void main(String[] args) {
        BufferedReader reader;
        //reader.mark();

        int a = 10, b = 5, c = 1, result;
        result = a - ++c - ++b;

        System.out.println(result); // 2


        List<String> s1 = new ArrayList<>();
        s1.add("a");
        s1.add(null);
        s1.add("b");
        s1.remove(null);
        System.out.println(s1);


        int[][] orig = {{1, 2, 3}, {4, 5, 6, 7}};
        int[][] dup = orig.clone();
        int[] copy = dup[0].clone();

        System.out.println(orig == dup);
        System.out.println(orig.equals(dup));
        System.out.println(orig[0] == dup[0]);
        System.out.println(dup[0] == copy);
        System.out.println(dup[0].equals(copy));


        //How many times will true be printed?
        //1.


        //q13

        //   What will be the result of compilation and execution of the following code ?

        DoubleStream is = DoubleStream.of(0, 2, 4); //1
        //is.average() // returns OptionalDouble.
        double sum = is.filter(i -> i % 2 != 0)
                //.count() //terminal and simple type (long)
                .sum(); //2
        System.out.println(sum); //3


        //q17
        List al = new ArrayList(); //1
        al.add(111); //2 - autoboxing to integer which matches object.
        //System.out.println(al.get(al.size()));  //3 - throws exception - should be al.get(al.size()-1).


        //q27
        //  What will the following code print?
        Duration d = Duration.ofMillis(1100);
        System.out.println(d);
        d = Duration.ofSeconds(61);
        System.out.println(d);


        Duration duration = Duration.ofSeconds(30, 345_678_901_01_01_01_01_01L);
        System.out.println(duration);

        Period p = Period.ofDays(3);
        Period period = p.withMonths(1);
        System.out.println(period);
        System.out.println(period.toTotalMonths());

        throwsMethod();

        String[][][][][][] strArr = new String[2][3][4][5][6][7];
        String[][][][] strArr2 = new String[][][][] {
            {
                    {
                            {"A"}
                    }
            }
        };

        System.out.println(strArr2[0][0][0][0]);

    }


    static class MyException extends Exception {
    }

    static class MyException1 extends MyException {
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends MyException2 {
    }

    private static void throwsMethod() {
        try {
            // code that could potentially throw any of the above-mentioned exceptions
            // throw new MyException();
            // throw new MyException1();
            // throw new MyException2();
               throw new MyException3();
        }

        catch(MyException3 me3){} // valid but not necessary unless we want to do stuff with me3.
        catch(Exception e){ }

       // catch(MyException2 me2){}
       // catch(MyException3 me3){} // must be first or super class will catch it.
    }
}
