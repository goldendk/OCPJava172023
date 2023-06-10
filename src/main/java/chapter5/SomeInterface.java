package chapter5;

public interface SomeInterface {
    public static final String SOME_CONSTANT = "FOO";
   static void someMethod() {
        System.out.println("foo");
    }

    default String getString(){
       return "bar";
    }
}
