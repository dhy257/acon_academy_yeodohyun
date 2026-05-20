package day4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 	
		// 자바9버전 이후 생성자 객체를 얻어온후 생성자를 통해서 객체를 생성함
		Class clazz  =Class.forName("day4.reflect.Member");		
		Constructor c = clazz.getDeclaredConstructor();
		Member member  =(Member)c.newInstance();
		member.printInfo();
		
		
		
		//실습
		
		Class clazz2 =  Class.forName("day4.reflect.Member");
		Constructor c2= clazz2.getDeclaredConstructor( );
		Member member2  = (Member) c2.newInstance();
		member.printSquare(6);
		
		

	}

}
