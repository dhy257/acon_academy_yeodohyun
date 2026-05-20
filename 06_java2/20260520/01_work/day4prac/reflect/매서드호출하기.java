package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 매서드호출하기 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("day4prac.reflect.Member");
		Constructor c = clazz.getDeclaredConstructor();
		Member m = (Member) c.newInstance();
		// printInfo

		// printSquare

		Method method = clazz.getDeclaredMethod("printInfo");

		// 매서드정보를 가진 객체

		// invoke 호출하다
		method.invoke(m);
	}
}
