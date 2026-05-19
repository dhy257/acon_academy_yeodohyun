package day3prac.collection.stream;

import java.util.ArrayList;

public class 스트림맛보기 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");

		//
		list.stream().filter((item) -> {
			return item.equals("hello");
		}).forEach((item) -> {
			System.out.println(item);
		});

		list.stream().filter(item -> item.equals("hello")).forEach(item -> System.out.println(item));

		long cnt = list.stream().filter(item -> item.equals("hi")).count();
		System.out.println(cnt);
		//
	}
}
