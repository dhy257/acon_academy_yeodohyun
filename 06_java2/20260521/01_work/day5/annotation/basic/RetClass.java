package day5.annotation.basic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//사용자 애너테이션 만들기 
//유지정책 ( 소스, 클래스(기본)  ,실행시 )
@Retention( RetentionPolicy.CLASS)
public @interface RetClass {

}
