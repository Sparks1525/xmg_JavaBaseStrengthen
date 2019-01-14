package mytest.day02._04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VIP {
    String level();
    int age() default 20;
    String[] hobby();
    Gender sex() default Gender.NONE;
}
