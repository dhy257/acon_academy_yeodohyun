package day3prac.collection.stream;

import java.util.ArrayList;

//1.모든 데이터소스를 표준화된 방법으로 다루게 하겟다
//2.선언식프로그래밍 가능하게 함
public class 스트림맛보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");
		list.add("hi");

		// 1. "hello" 같은 문자열만 출력하기
		list.stream().filter((item) -> {
			return item.equals("hello");
		}).forEach((item) -> {
			System.out.println(item);
		});

		list.stream().filter(item -> item.equals("hello")).forEach(item -> System.out.println(item + "^^"));

		// 2. "hi" 같은 문자열의 개수 구하기
		long cnt = list.stream().filter(item -> item.equals("hi")).count();
		System.out.println(cnt);

		// 2. "hi" 같은 문자열의 개수 구하기 => 스트림 안쓰기
		int count = 0;
		for (String str : list) {
			if (str.equals("hi")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
