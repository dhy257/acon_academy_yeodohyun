package wrapper;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본자료형
		int a;
		char b;
		double c;
		boolean d;

		// 자바는 객체지향언어
		// 자바의 라이브러리: 자바가 제공하는 기능에서는 대부분 객체를 매개변수로 받는다

		// 기본형을 객체로 만들어주는 Wrapper 제공
		// 오토박싱 : int => Integer
		// 오토언박싱 : Integer => int

		// 기본자료형 => 객체로 다룰 필요가 있다.
		// 기본자료형을 객체로 만들어주는 Wrapper클래스가 제공되고 있다.

		// int => Integer
		// char => Character
		// double => Double
		// boolean => Boolean

		ArrayList list = new ArrayList();
		list.add(3); // 내부적으로 오토박싱 일어남 int => Integer
		list.add(new Integer(5));
		list.add(Integer.valueOf(10));

		for (int i = 0; i < list.size(); i++) {
			Object oo = list.get(i);
			System.out.println(oo);
		}
	}

}
