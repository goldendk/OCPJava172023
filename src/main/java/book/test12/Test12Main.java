package book.test12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Test12Main {
    public static void main(String[] args) throws IOException {

        {
            DataOutputStream dos = new DataOutputStream(new ByteArrayOutputStream());
            dos.writeUTF("");
            DataInput dis = new DataInputStream(new ByteArrayInputStream(new byte[]{1, 2, 3, 4}));
            //dis.readUTF();

            List<String> list = new ArrayList<>();
            String s;

            for (final var ss : list) {

            }

            //cannot assign double to int without casting - loss of precision.
            int i = (int) 1.0;
            long l = (int) (float) 1.0;

            byte b = 127;
            byte bb = -128;
            //byte bbb = 128;
            //byte bbbb = -129; A byte is from -128 to +127

            int ii = 1000;
            byte bbb = (byte) ii;

            System.out.println(Integer.toBinaryString(1000));
            System.out.println("  " + Integer.toBinaryString(232));
            System.out.println("                           " + Integer.toBinaryString(24));
            System.out.println(Integer.toBinaryString(-24));
            System.out.println(b);
            System.out.println(bbb);
            Locale.setDefault(Locale.Category.FORMAT, Locale.US);
        }
        {
            byte b = 1;
            char c = 1;
            short s = 1;
            int i = 1;

            // c = c+b;
            // c = s + b;
            // c = b + b;
            // c = c + c;

            s += s + i;
            s += i;
            s *= i;
            s -= i;
        }
        {
            Stream<String> lines = Files.lines(Path.of("./build.gradle"));
            System.out.println(lines.count());
        }
        {
            test((short) 'a');
            System.out.println(false | true);
            System.out.println('a' | 'b' | 'c');
            System.out.println('a' & 'b' & 'c');
            System.out.println(Integer.toBinaryString(97));
            System.out.println(Integer.toBinaryString(98));
            System.out.println(Integer.toBinaryString(99));
        }
        {
            String fullPhoneNumber = "123-123-1234";
            var xx = new StringBuilder("xxx-xxx-") + fullPhoneNumber.substring(8);
        }
        {
            List<Integer> names = Arrays.asList(1, 2, 3); //1
            names.forEach((Integer x) -> x = x + 1); //2
            names.forEach(System.out::println); //3
        }

        {
            Paths.get("", "", "");
            Path.of("", "", "");
        }
    }


    static void foo() {
        Integer x = 3;
        switch (x) {
            case 1, 2 -> System.out.println("A");
            case 3, 4 -> System.out.println("B");
            default -> System.out.println("C");
        }
    }

    enum X {
        A, B, C
    }

    static void test(short x) {
        switch (x) {
            case 1:
            case (char) 12:
            case 6500:
            default:
                break;
            case 4:
            case 'a' | 'b' | 'c':
                System.out.println('c');
        }
    }
}
