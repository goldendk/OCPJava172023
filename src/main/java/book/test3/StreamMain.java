package book.test3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {
        IntStream.range(0,10).boxed()
                //terminal
                .forEach(System.out::println) //terminal - returns void.
                ;//.filter(e->e);

        List<Integer> collect = IntStream.range(0, 10).boxed()
                .collect(Collectors.toList());//terminal;

        boolean allMatch = IntStream.range(0, 10).boxed()
                .allMatch(e -> true);// terminal

        boolean anyMatch = IntStream.range(0, 10).boxed()
                .anyMatch(e -> true);// terminal

        Spliterator<Integer> spliterator = IntStream.range(0, 10).boxed()
                .spliterator();// terminal

        int reduceResult =  IntStream.range(0, 10).boxed()
                .reduce(0, (a,b)->a + b);// terminal

        Optional<Integer> reduceOptionalResult =  IntStream.range(0, 10).boxed()
                .reduce( (a,b)->a + b);// terminal


        Optional<Integer> findFirst =  IntStream.range(0, 10).boxed()
                .findFirst();// terminal

        Optional<Integer> findAny = IntStream.range(0, 4).boxed().findAny();
        OptionalInt reduce = IntStream.range(0, 5).reduce((a, b) -> a + b);// XXXStreams returns OptionalXXX instead of Optional<XXX>
        Optional<Integer> max = IntStream.range(0, 5).boxed().max(Integer::compare);
        Optional<Integer> min = IntStream.range(0, 5).boxed().min(Integer::compare);
        IntSummaryStatistics intSummaryStatistics = IntStream.range(0, 5).summaryStatistics();

        OptionalDouble average = IntStream.range(0, 3).average(); //terminal. XXXStreams returns OptionalXXX.
        //intermediate operation

        IntStream.range(0,3).boxed()
                .distinct()
                .onClose(()->System.out.println("Closing"))
                .map(e->e)
                .mapToLong(e->e)
                .boxed()
                .takeWhile(e->true)
                .dropWhile(e->false)
                .flatMap(e->List.of(e,e).stream())
                .limit(3)
                .skip(0)
                .filter(e->true) // take all
                .peek(System.out::println)
                .sorted()
                .sorted(Comparator.comparing(Long::longValue))
                .collect(Collectors.toList());

    }
}
