package day4.reflect;

import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationTargetException;
 

public class 리플렉션란 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		
	    // 실행 시간에 동적으로 특정 클래스의 정보를 추출할 수 있는 프로그래밍 기법입니다.		
		// 동적으로 클래스를 사용해야할 때 필요합니다.
		// 작성 시점에는 어떠한 클래스를 사용해야 할지 모르지만 런타임 시점에서 클래스를 가져와서 실행해야하는 경우 필요합니다.
		// 대표적으로는 Spring 프레임워크의 어노테이션 같은 기능들이 리플렉션을 이용하여 프로그램 실행 도중 동적으로 클래스의 정보를 가져와서 사용합니다
		
		 Class    clazz =Class.forName("day4.reflect.Member");		 
		 Constructor  consturctor = clazz.getDeclaredConstructor();		 
		 Member  member = (Member)consturctor.newInstance();	
		// Member member =(Member) clazz.newInstance();
    	 member.printInfo();
		 
		 
		 
		
	}

}
