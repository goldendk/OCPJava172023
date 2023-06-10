package chapter5;

public class SubClass extends Super{

    //hide static method.
    public static void staticMethod(String name){
        System.out.println("sub-class static method.");
    }

    //annotation helps the compiler check that we are in fact overriding rather
    // than silently declaring a new method or overloading an existing method.
    @Override
    //the accessibility of the method has been widened.
    public SubClass someMethod(final int i) { // final keyword not part of method signature.
        //Return type can be a co-variant type.
        System.out.println("someMethod in SubClass");
        return new SubClass();
    }

    public static void main(String... args){
        staticMethod("foo");
    }
}
