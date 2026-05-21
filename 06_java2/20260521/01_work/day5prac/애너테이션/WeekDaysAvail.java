package day5prac.애너테이션;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WeekDaysAvail {
	String[] value();
}

