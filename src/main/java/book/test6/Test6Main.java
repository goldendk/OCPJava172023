package book.test6;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test6Main {

    public static void main(String[] args) throws Exception {
        int i = 0;
        int j = 2;

        try {
            double result = j / i;
            throw new Exception("");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        Float f = -0.0f;
        Float ff = 2.0f;

        float fff = ff / f;

        System.out.println(Float.isInfinite(fff));

        Double d = 0.0;
        Double dd = 2.0;

        Double ddd = dd / d;
        System.out.println(ddd.isInfinite());

        Integer int1 = new Integer(0);
        Integer int2 = new Integer(2);

        try {
            Integer int3 = int2 / int1;
            throw new Exception("");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        Runnable r = () -> System.out.println("In Runnable");
        Callable<Integer> c = () -> {
            System.out.println("In Callable");
            return 0;
        };
        var es = Executors.newCachedThreadPool();


        Future<Integer> fi1 = es.submit(c);
        Future<?> fi2 = es.submit(r);
        Object o = fi2.get();
        es.shutdown();


        Path p1 = Path.of("foo", "bar", "a.txt");
        Path p2 = Path.of("123", "456", "b.txt");
        Path p3 = Path.of("123", "456", "a.txt");
        Path p4 = Path.of("foo", "456", "b.txt");
        System.out.println(p1.relativize(p2));
        System.out.println(p1.relativize(p3));
        System.out.println(p1.relativize(p4));
        System.out.println(p1.relativize(p4).toAbsolutePath());



    }
}
