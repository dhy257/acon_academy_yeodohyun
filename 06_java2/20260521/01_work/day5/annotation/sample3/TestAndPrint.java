package day5.annotation.sample3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//애너테이션을 적용할 대상 : 기본이  class ,   필드  ,  매서드 
@Target( ElementType.METHOD)
@Retention( RetentionPolicy.RUNTIME)
public @interface TestAndPrint {
	String before() default "";
	String after()  default "";
}
