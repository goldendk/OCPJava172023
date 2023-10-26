package book.test11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TestClass {
    public static void main(String[] args) throws IOException {
        try {
            amethod();
            System.out.println("try ");
        } catch (Exception e) { //this also covers runtime exceptions so this is allowed.
            // the same catch clause with an IOException would not compile as it cannot have subclasses that are
            //unchecked. So java.lang.Exception is a special case in the catch blocks. Same would go for Throwable.
            System.out.print("catch ");
        } finally {
            System.out.print("finally ");
        }
        System.out.print("out ");


        // random access file

        var raf = new RandomAccessFile(new File("./build.gradle"), "rwd");

        System.out.println("raf: " + raf.length());
        raf.seek(97);
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(raf.getFilePointer());
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(raf.getFilePointer());
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));
        System.out.println(Character.valueOf((char) raf.read()));

        raf.seek(400);
        System.out.println(raf.read());
        System.out.println(raf.getFilePointer());


        //streams
        List<Book> books = Arrays.asList(new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0));
        books.stream()
                .collect(Collectors.toMap(((Book b) -> b.getTitle()),b -> b.getPrice()))
                .forEach((a, b) -> System.out.println(a + " " + b));

    }

    public static void amethod() {
    }
}