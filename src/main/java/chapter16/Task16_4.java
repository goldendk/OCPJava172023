package chapter16;

import java.util.stream.IntStream;

public class Task16_4 {
    public static void main(String... args) {


        System.out.println(IntStream.range(0, 5).reduce(0, (x,y)->x+1));

        System.out.println(IntStream.range(0, 5).reduce( (x,y)->x+1));
        System.out.println(IntStream.range(0, 5).reduce(0, (x,y)->y+1));
    }
}
