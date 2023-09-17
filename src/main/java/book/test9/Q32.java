package book.test9;

import java.util.Spliterator;
import java.util.stream.Stream;

public class Q32 {
    public static void main(String[] args) {
        Stream<String> ss = Stream.of("a", "b", "c", "d", "e");
        Spliterator<String> sit1 = ss.spliterator();
        long s0 = sit1.estimateSize();
        Spliterator<String> sit2 = sit1.trySplit();
        long i = sit2.estimateSize();
        Spliterator<String> sit3 = sit2.trySplit();
        long ii = sit2.estimateSize();
        Spliterator<String> sit4 = sit3.trySplit();
       // Spliterator<String> sit5 = sit4.trySplit();
       // Spliterator<String> sit6 = sit5.trySplit();

        long s1 = sit1.estimateSize();
        long s2 = sit2.estimateSize();
        System.out.println(s0 - (s1 + s2));
    }
}
