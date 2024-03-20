package chapter16;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMain {
    public static void main(String... args) {

        IntStream.range(0, 5)
                .dropWhile(x -> x < 2)
                .forEach(System.out::println);
        System.out.println("---");
        IntStream.range(0, 5)
                .takeWhile(x -> x < 2)
                .forEach(System.out::println);

        System.out.println("---takeWhile() stops at the first elements that does not match predicate.");
        List.of(4, 2, 5)
                .stream()
                .takeWhile(x -> x > 3)
                .forEachOrdered(System.out::println);

        System.out.println("---");
        IntStream.range(0, 5)
                .dropWhile(x -> x == 0)
                .forEach(System.out::println);

        System.out.println("--- reduce() without seed returns an optional.");
        OptionalInt reduce = IntStream.range(0, 5)
                .dropWhile(x -> x == 0)
                .reduce((x, y) -> {
                    System.out.println("x: " + x + ", y: " + y);
                    return x * y;
                });

        System.out.println(reduce);


        System.out.println("--- reduce() with seed returns an actual value");
        int reduce2= IntStream.range(0, 5)
                .dropWhile(x -> x == 0)
                .reduce(1, (x, y) -> {
                    System.out.println("x: " + x + ", y: " + y);
                    return x * y;
                });

        System.out.println(reduce2);

        System.out.println("---flatmap");
        IntStream.range(0, 5)
                .filter(e->true)
                .flatMap(x->IntStream.rangeClosed(0, x))
                .forEachOrdered(System.out::println);

        System.out.println("mapMulti calls the provided consumer to 'add' new elements to the stream.");
        IntStream.range(0,5)
                .mapMulti((value, ic) -> {
                    ic.accept(value+1);
                    ic.accept(value+2);
                })
                .sorted()
                .forEachOrdered(System.out::println);

        System.out.println("---max()");
        OptionalInt max = IntStream.range(0, 5).max();
        System.out.println(max);

        System.out.println("-- sequential()");
//        IntStream.range(0,5)
//                .sequential()
//                .collect();

        System.out.println("-- parallel()");
//        IntStream.range(0,5)
//                .parallel()
//                .collect()

        System.out.println("---sum()");
        IntStream.range(0,5)

                .sum();

        System.out.println("IntStream.generate()");
        IntStream generate = IntStream.generate(() -> {
            int x = 0;
            return x++;
        });
        generate.limit(5).forEachOrdered(System.out::println);
        System.out.println("---distinct()");
        List.of(0, 0, 1,2,2,3)
                .stream().distinct()
                .forEachOrdered(System.out::println);

        Optional<String> reduce1 = List.of("a", "b").stream().reduce((a, b) -> a + b);
        System.out.println(reduce1);
    }


}
