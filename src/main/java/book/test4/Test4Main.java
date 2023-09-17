package book.test4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.DayOfWeek.FRIDAY;


public class Test4Main {

    public static void main(String[] args) throws Exception {
        int sum = IntStream.range(0, 3).boxed().mapToInt(x -> x).sum();
        long sum1 = IntStream.range(0, 3).summaryStatistics().getSum();


        double summ = 0;
//        List.of(2,4).stream().forEach(a->{ summ=summ+a; }); // cant change final variable.

        LocalDate ld = LocalDate.parse("2023-08-10");
        System.out.println(ld);

        RandomAccessFile raf = new RandomAccessFile("build.gradle", "rw");
        raf.seek(raf.length() - 1);
        System.out.println(raf.read());

        System.out.println(raf.length() + ": " + raf.getFilePointer());
        Path buildPath = Path.of(".\\build.gradle").toAbsolutePath();
        System.out.println(buildPath.normalize());
        System.out.println(buildPath.subpath(0, 2));
        System.out.println(buildPath.getRoot());
        System.out.println(buildPath.startsWith("foo"));
        System.out.println(buildPath.startsWith("d:\\"));
        System.out.println(buildPath.subpath(0, 2).startsWith("sandbox"));

        Path settingsPath = Path.of(".\\settings.gradle").toAbsolutePath();

        Path relative = Path.of(".\\src\\main");
        System.out.println(relative.toString());
        try {
            System.out.println(settingsPath.relativize(relative));
            throw new Exception("Shouild have IllegalARgumentException");
        } catch (IllegalArgumentException e) {

        }

        System.out.println(buildPath);
        ;

        try {
            System.out.println(relative.relativize(buildPath));
            throw new Exception("Shouild have IllegalARgumentException");
        } catch (IllegalArgumentException e) {

        }

        Path of = Path.of("foo\\bar");
        Path of2 = Path.of("baz\\bar");
        System.out.println(of.toAbsolutePath());
        System.out.println(of.toString());
        System.out.println(of.subpath(0, 1));
        System.out.println(of.relativize(of2));

        // String line = System.console().readLine();
        int a = 2;
        System.out.println(a += a = 4);
        a++;
        int[] aa = new int[]{1, 2};
        int idx = 0;
        aa[idx] = aa[++idx] * 2;
        System.out.println(Arrays.toString(aa));
        aa[idx]++;
        System.out.println(Arrays.toString(aa));
        ToIntFunction<Integer> f = (ii) -> ii;
        Double collect = IntStream.range(0, 3).boxed().collect(Collectors.averagingInt(f));


        Runnable r = () -> {
            someMethod();
        }; //void functional interfaces do not need return statement even if there are braces!

        try {
            SOME_LABEL:
            Files.newBufferedReader(Paths.get("does-not-exist.txt"));
        } catch (NoSuchFileException e) {
            System.out.println("Checked exception: " + e);
        }
        System.out.println("SWitch");
        switchExample();
        System.out.println("Switch");


        long count = IntStream.rangeClosed(0, 4)
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println("even numbers: " + count);

        int[] intArray = {2, 3, 4};
        int[] intArray2 = new int[3];
        int[] intArray3 = new int[]{2, 3, 4};

        System.out.println(intArray[0]);
        System.out.println(intArray2[0]);
        System.out.println(intArray3[0]);

        int j = 0;
        for (int i = 0;
             i < 10;  //1
             i++, j++) { // 3
            System.out.print(i + " "); //2
        }
        System.out.println("");

        //Factory method using minute resolution.
        LocalDateTime of1 = LocalDateTime.of(2023, Month.APRIL, 30, 23, 59);

        Arrays.sort(new String[]{"a"});
        String s = 20 + "9";
        System.out.print(s);
        System.out.println("");
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<? super Integer> superInteger = new ArrayList<>();

        superInteger = numberList;
        superInteger = integerList;

        String switchReturnValue = switchWithReturn(0);
        System.out.println(switchReturnValue);

        cardSwitch();

    }

    private static void cardSwitch() {
        switch (Card.valueOf("HEART")) {
            case HEART -> System.out.println("heart");
            case CLUB -> System.out.println("club");
            case SPADE -> System.out.println("spade");
            case DIAMOND -> System.out.println("diamond");
            //default is never reached but still works.
            default -> System.out.println("unknown");
        }
    }

    private static String switchWithReturn(int i) {
        final int ii = 0;

        return switch (ii) {
            case 0 -> {
                yield "0";
            }
            case 1 -> {
                yield "1";
            }
            //default is required in order to compile, even with final variables.
            default -> {
                yield "foo";
            }
        };
    }

    private static void switchExample() {
        var day = LocalDate.now().with(FRIDAY).getDayOfWeek();
        switch (day) {
//            default:
//                System.out.println("default");
//                break;
            case MONDAY:
                TUESDAY:
                WEDNESDAY:
                THURSDAY:
                FRIDAY:
                System.out.println("working");
            case SATURDAY:
                SUNDAY:
                System.out.println("off");
        }
    }

    public static int someMethod() {
        return -1;
    }
}
