package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class 속성정보얻어오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("day4prac.reflect.Member");
		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field);
		}
	}

}
