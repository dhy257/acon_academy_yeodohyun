package day2prac.lambda;

import java.util.ArrayList;

public class 맛보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> foods = new ArrayList<>();
		foods.add("케이크");
		foods.add("초코");
		foods.add("커피");
		foods.add("딸기");

		// foods 출력하기

		// get(index) 반복문
		for (int i = 0; i < foods.size(); i++) {
			String item = foods.get(i);
		}

		// forEach
		for (String item : foods) {
			System.out.println(item);
		}

		// forEach
		// 반복을 내부적으로 수행 - 반복하면서 수행할 일(수행할 코드 작성) => Consumer 인터페이스 구현
		foods.forEach((item) -> {
			System.out.println(item);
		});
		foods.forEach(item -> System.out.println(item));

	}

}
