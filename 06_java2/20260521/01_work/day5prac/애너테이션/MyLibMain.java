package day5prac.애너테이션;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLibMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		MyLib lib = new MyLib();
		검증하기(lib);

	}

	private static void 검증하기(MyLib lib) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class clazz = lib.getClass();
		Method method = clazz.getDeclaredMethod("printStar");
		BeforeAndAfter annotation = method.getAnnotation(BeforeAndAfter.class);

		if (annotation != null) {

			String before = annotation.before();
			String after = annotation.after();

			// 전
			System.out.println(before);
			method.invoke(lib);
			// 후
			System.out.println(after);
		}

	}

}