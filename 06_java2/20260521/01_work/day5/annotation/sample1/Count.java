package day5.annotation.sample1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// 사용자 애너테이션 만들기 
//  @interface 애너테이션이름 
//  유지범위 :  runtime   => 실행시 ( runtime )까지 애너테이션 정보가 유지됨
 @Retention( RetentionPolicy.RUNTIME)
public @interface Count {	
	 int value() default 1;   //     어노테이션객체.value()로 애너테이션의 값을 얻어 올 수 있다
}

