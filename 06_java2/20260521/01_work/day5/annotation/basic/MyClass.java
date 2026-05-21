package day5.annotation.basic;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class MyClass {
   
	// ==> source 레벨의 애너테이션이 사라진것을 확인 함
	
  @RetSource
  int retSource;
  
  @RetClass
  int retClass;
  
  @RetRuntime
  int retRuntime;
  
  public static void main(String[] args) throws ClassNotFoundException {
    Class<?> myclass = Class.forName("day5.annotation.basic.MyClass");
    byte b;
    int i;
    Field[] arrayOfField;
    for (i = (arrayOfField = myclass.getDeclaredFields()).length, b = 0; b < i; ) {
      Field f = arrayOfField[b];
      if ((f.getAnnotations()).length > 0)
        Arrays.<Annotation>stream(f.getAnnotations()).forEach(s -> System.out.println(s)); 
      b++;
    } 
  }
}