package chap06.annotation;

// @AnnotationName(String, int)
// @AnnotationName("value아무거나")

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface AnnotationName {
    String value() default "";
    String elementOne() default "";
    int elementTwo() default 10;
}
