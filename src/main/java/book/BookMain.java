package book;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

public class BookMain {
    public static void main(String... args) {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yy MMM dd G");

        String formatted = sdf.format(LocalDate.of(0, 1, 1));
        System.out.println(formatted);

        Arrays.stream(new int[]{2, 1, 4, 5}).forEachOrdered(v -> System.out.print(v));
        System.out.println("");
        Arrays.stream(new int[]{2, 1, 4, 5}).forEach(v -> System.out.print(v));
        System.out.println("");

        Path buildFile = Path.of("chapter19", "module1");
        Path settings = Path.of("chapter19", "module2");
        Path resolve = buildFile.resolve(settings);
        System.out.println(resolve);
        System.out.println(buildFile.relativize(settings));
        System.out.println(resolve.relativize(settings));
        System.out.println(buildFile.relativize(settings).normalize());


        //
        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.stream().forEach(x -> {
            x = x + 10;
        });
        dList.stream().forEach(d -> System.out.println(d));

        Predicate<String> p = (var pp) -> {
            return pp.isEmpty();
        };

        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max = ls.stream().max(Comparator.comparing(a -> a)).get();
        System.out.println(max);

        ServiceLoader<FooService> loader = ServiceLoader.load(FooService.class);
        Iterator<FooService> iterator = loader.iterator();
        if (!iterator.hasNext()) {
            System.out.println("No FooService(s) available.");
        }
        for (FooService service : loader) {
            System.out.println("foo service...");
        }

        try {

            exception();
        } catch (Exception e) {
            System.out.println("Exception message : " + e.getMessage());
        }


        floats();

    }

    private static void floats() {
        Float f1 = 10.0f;
        Float f2 = 0.0f;
        Float f3 = null;
        float f = 0.0f;
        try {
            f = f1 / f2;
            System.out.println(f);
            f3 = f1 / f2;
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(f3.isInfinite());
    }

    private static void exception() {
        try {
            throw new RuntimeException("from body");
        } catch (RuntimeException e) {
            throw new RuntimeException("from catch");
        } finally {
            throw new RuntimeException("from finally");
        }
    }


}
