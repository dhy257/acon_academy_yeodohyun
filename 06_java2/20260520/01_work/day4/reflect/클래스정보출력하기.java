package day4.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 클래스정보출력하기 {
	 public static void main(String[] args) throws ClassNotFoundException {
		
		 
		 Class clazz =Class.forName("day4.reflect.Member");
		 
		 
		 //속성정보
		 Field[]  fields  = clazz.getDeclaredFields();
		 		 
		 for( Field  field  : fields) {
			 System.out.println( field);
		 }
		 
		 
		 
		 //매서드 정보
		 
		 Method[]  methods= clazz.getDeclaredMethods();
		 
		 for( Method  method : methods) {
			 System.out.println( method);
		 }
		 
		 
		 
		 
		 
	}

}
