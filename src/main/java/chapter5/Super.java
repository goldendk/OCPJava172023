package chapter5;

public class Super {

    public static void staticMethod(String name){
        System.out.println("super class static method");
    }
     Super someMethod(int i ){
         System.out.println("someMethod in super");
        return new Super();
    }
}
