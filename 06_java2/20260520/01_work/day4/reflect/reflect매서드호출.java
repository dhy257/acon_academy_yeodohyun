package day4.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect매서드호출 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Member  m = new Member();
		m.printInfo();  //     m.printInfo( m);  ->   this
		m.printSquare(5);
		
		
		Class  clazz  = Class.forName("day4.reflect.Member");		
		//매서드 호출
		// invoke 		
		
		//매서드정보 객체 얻어오기
	 
		//매서드 호출하기
		Method method  = clazz.getDeclaredMethod("printInfo");
		method.invoke(m);  // 매서드의 첫번째 인수로 객체정보가 전달된다
		
		
		//매서드정보 객체 얻어오기
		//매서드 호출하기
		Method method2= clazz.getDeclaredMethod("printSquare", int.class);
		method2.invoke(m, 3); // 매서드의 첫번째 인수로 객체정보가 전달된다
		
		
		
		//실습
		// 클래스정보로 부터 특정매서드 정보 얻어오기
		Method method3= clazz.getDeclaredMethod("printInfo");
		
		
		//method 호출하기
		//method.invoke( clazz.newInstance());
		method.invoke(  m );
		

	}

}
