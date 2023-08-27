package chapter25;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.FIELD, ElementType.TYPE})
public @interface Test5Annotation {
    String[] value() default "x";
}
