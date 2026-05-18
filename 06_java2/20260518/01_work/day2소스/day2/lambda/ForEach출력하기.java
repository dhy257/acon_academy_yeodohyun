package day2.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach출력하기 {

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		// 하나씩 등록
		drinks.add("콜라");
		drinks.add("사이다");
		drinks.add("환타");
		drinks.add("레몬에이드");
		drinks.add("오렌지주스");
		drinks.add("아이스티");
		drinks.add("밀크티");
		drinks.add("커피");
		drinks.add("에너지드링크");
		drinks.add("생수");

		
		// forEach 매서드 사용하여 출력하기
		drinks.forEach(drink -> System.out.println(drink +"^^"));

		
		drinks.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		
		// 
		drinks.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				System.out.println(t);

			}
		});

		
		
		class A implements Consumer<String> {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		}

		drinks.forEach(new A());

		// 메서드 참조로도 가능
		// drinks.forEach(System.out::println);
	}
}
