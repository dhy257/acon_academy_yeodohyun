package day4.reflect;

import java.lang.reflect.Method;

public class 매서드정보얻어오기 {

	public static void main(String[] args) throws ClassNotFoundException {
	 
		Class  clazz1 = Class.forName("day4.reflect.Member");
		
		Method[] methods = clazz1.getDeclaredMethods();
		
		
		
		//매서드 정보 얻어오기
		for (Method method : methods) {
		    System.out.println("Method name: " + method.getName());		   
		}

	}

}
