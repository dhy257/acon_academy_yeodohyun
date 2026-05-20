package day4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect실습 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		
		
		Class clazz =  Class.forName("day4.reflect.Member");
		
		
		//1. 매개변수가 없는 생성자 정보 가져오기 		
		Constructor  constructor = clazz.getDeclaredConstructor();
		System.out.println( constructor.getName());
		
		
		//2. 생성자정보로   Member객체 생성하기		 
		Member member  = (Member)constructor.newInstance();
		member.printInfo();
		
		
		
		//3.  매개변수가 있는 생성자 정보 얻어오기
		Constructor constructor2=  clazz.getDeclaredConstructor(String.class , String.class );
		
		//4. 매개변수가 있는 생성자를 통해서 객체 생성하기 
		
		Member member2 = (Member)constructor2.newInstance("victoai", "1234");
		member2.printInfo();
		
		
		//5. 매서드정보 가져오기 
		
		Method printSquare =  clazz.getDeclaredMethod("printSquare", int.class);
		Method printInfo =  clazz.getDeclaredMethod("printInfo" ) ;
		
		
		//6. 매서드 호출하기
		printSquare.invoke( member2 , 6);  //매서드 호출시 첫번째 매개변수로 객체의 정보가 전달되어야 한다
		printInfo.invoke(member2);  //매서드 호출시 첫번째 매개변수로 객체의 정보가 전달되어야 한다
	 
		

	}

}
