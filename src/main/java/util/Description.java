package util;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.METHOD})
public @interface Description {

    enum Difficulty {EASY, MIDDLE, HARD}

    Difficulty difficulty() default Difficulty.EASY;

    boolean solve() default true;
}
