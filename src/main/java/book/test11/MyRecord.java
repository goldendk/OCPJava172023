package book.test11;

import java.util.Map;

public record MyRecord(String name, int age) {
//    public MyRecord{
//        name += "bar";
//        age *= 2;
//    }

//    public MyRecord(String name, int age){
//        this(name, age);
//
////        this.name = name;
////        this.age = age;
//    }

    public MyRecord(String bar){
        this(bar + "bar", 1);
    }

    public static void main(String... args){
        System.out.println(new MyRecord("foo", 12));
        System.out.println(new MyRecord("foo"));
    }
}
