package day4prac.reflect;

import java.lang.reflect.Method;

public class 매서드정보가져오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("day4prac.reflect.Member");

		Method[] methods = clazz.getDeclaredMethods();

		for (Method method : methods) {

			System.out.println(method.getName());
		}
	}
}
