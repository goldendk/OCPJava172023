package book.test13;

import book.test13.subpackage.A;
import bookexam.person.Student;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main13 {
    public static void main(String[] args) throws Exception {


        //var a = 100, b, c; var not allowed in compound declaration

        int a = 100, b, c = 20;
        //char d = b;

        int e, f, g;
        e = f = g = 100;

        var bb = 0;
        var cc = 0;
        var aa = bb = cc;
        //int aaa = bbb = ccc; assignment, not declaration of bbb and ccc

        switchM(3);
        switchM(11);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        printWriter(new PrintWriter(new OutputStreamWriter(out)), "foo");
        System.out.println(out.toByteArray());
        randomMethod();

        A aaaa = new A();
        // default constructor is public. Book says that default visibility is the same.


        byte bbbbb = -128;
        byte bbbbbb = 127;

        toughSwitch();

        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("");
        short ss = 2;
        var shortt = new Short(ss);


        int[] aArr = null;
     //   int bvalue = aArr[aIdx()];


        Optional<String> empty = Optional.empty();
        Optional<String> string = empty.of("String");
        List<String> stringList;

        List<Integer> iList = List.of(1,2,3,4,5);
        iList.stream().filter(i->{
            System.out.println("i" + i);
            return i<4;
        }).forEach(i->{
            System.out.println("ii" +i);
        });
    }

    private static int aIdx() throws Exception {
        throw new Exception();
    }

    private static void switch2(){
        int i = 2;
        switch(i){
            case 1 -> System.out.println("1");
            case 3, 4 -> System.out.println("3");
        }
    }
    private static void toughSwitch() {
        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }

    private static void fragments(){

        var list = new ArrayList<>();
        List<?> list2 = new ArrayList<>();

        list.add(20);
        list.add("foo");

       // var str = null; // no type inference.

       // var ints = null; // no type inference.


    }


    private static void randomMethod(){
         new Random().ints().limit(10)
                 .peek(e-> System.out.println("peek: " + e))
                .forEach(e-> System.out.println(e))
                ;

         Random r = new Random();
        DoubleStream.generate(r::nextDouble)
                .limit(10)
                .forEach(System.out::println);
    }


    private static class Student {
        public static enum Grade {A, B, C, D, F}

        private String name;
        private Grade grade;

        public Student(String name, Grade grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Grade getGrade() {
            return grade;
        }

        public void setGrade(Grade grade) {
            this.grade = grade;
        }
    }

    private static void cascadeCollectors() {
        List<Student> ls = Arrays.asList(
                new Student("S1", Student.Grade.A),
                new Student("S2", Student.Grade.A),
                new Student("S3", Student.Grade.C));
        ls.stream().collect(
            Collectors.groupingBy(
                    Student::getGrade,
                    Collectors.mapping(Student::getName, Collectors.toList())
            )
                );
    }


    private static void printWriter(PrintWriter pw, String text) {
        //try{
        pw.write(text);
        if (pw.checkError()) {
            System.out.println("Exception when writing");
        }
        pw.println(text);
        // }
        //catch (IOException e){
        //    System.out.println("exception when writing");
        // }
    }

    private static void bufferedReader() {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
            AccessDeniedException exp;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void switchM(Integer x) {

        switch (x) {
            default -> System.out.println("default");
            case 1, 2 -> System.out.println("1,2");
            case 3, 4, 5 -> System.out.println("3,4,5");
        }
    }


    private class m {

    }
}
