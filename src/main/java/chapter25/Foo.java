package chapter25;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_PARAMETER,
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.TYPE})
public @interface Foo {
    String[] value() default {"x"};
}
