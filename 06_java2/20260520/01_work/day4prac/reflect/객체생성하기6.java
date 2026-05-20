package day4prac.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기6 {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		// 설정파일 읽어오기
		// 설정파일 파싱하기 => 클래스정보 얻어오기

		// 클래스정보로 객체생성하기

		String className = "";

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\user\\Desktop\\acon_academy_yeodohyun\\06_java2\\20260520\\01_work\\day4prac\\reflect\\config.txt"));
		String line = br.readLine();
		System.out.println(line);

		String[] result = line.split("=");
		className = result[1];

		System.out.println(className);

		Class clazz = Class.forName(className);
		Constructor c = clazz.getDeclaredConstructor();

		Member m = (Member) c.newInstance();
		m.printSquare(3);

	}

}
