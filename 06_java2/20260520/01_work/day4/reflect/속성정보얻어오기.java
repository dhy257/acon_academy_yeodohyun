package day4.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

public class 속성정보얻어오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class  clazz1 = Class.forName("day4.reflect.Member");
		
		Field fields[] = clazz1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println( field);
		}
		
		
		
		//실습
		
		Field[]   fields2 = clazz1.getDeclaredFields();
		
		for( Field  field   : fields2) {
			System.out.println( field);
		}
		 
		
		
	}

}
