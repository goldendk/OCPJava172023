package chapter25;

@Foo(value = "y")
//@MethodAnnotation // compiler error.
public class AnnotationMain<@Foo T> {

    @MethodAnnotation
    @Foo
    public static void main(String... args){


    }
    @MethodAnnotation
    private void someMethod(int foo){

    }
}
