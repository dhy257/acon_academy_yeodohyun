package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기5 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class clazz = Class.forName("day4prac.reflect.Member");
		Constructor c = clazz.getDeclaredConstructor();

		Member m = (Member) c.newInstance();
		m.printInfo();
		m.printSquare(2);

	}

}
