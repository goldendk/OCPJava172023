package book.test9;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Test9Main {

    public static void main(String[] args) throws IOException {

        IntStream s = IntStream.range(0, 2);
        //s.collect(null, null, null);

        DoubleStream d = DoubleStream.of(0.0, 0.1);
        Init init = new Init();
        System.out.println(init.i);

        byte b = 27;
        int i = 9;
        int ii = 'a';
        //int iii = 1L;
        int iiii = b;
        long l = 2;
        long ll = 'a';
        //long lll = Long.parseLong("1_000_000"); // runtime error.
        long llll = 5_000_000_000_000L;
        System.out.println(llll);
        long lllll = b;
        System.out.println("---");
        int iiiii = (int) llll;
        System.out.println(iiiii);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE < iiiii);
        System.out.println(Integer.MAX_VALUE - iiiii);
        byte bb = (byte) i;
        byte bbb = (byte) llll;
        System.out.println(bbb);

        Collector<Object, ?, Long> counting = Collectors.counting();
        DirectoryStream<Path> paths = Files.newDirectoryStream(Path.of("."), "*.{gradle,bat}" );
        for(Path p: paths){
            System.out.println(p);
        }
    }

    static class Init {
        private int i;

        public Init() {
            System.out.println(i);
        }

        {

            i = 5;
        }

    }
}
