package day3prac.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;

import day3prac.collection.stream3.Acorn;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Acorn> list = new ArrayList<Acorn>();
		list.add(new Acorn("고지연", 89));
		list.add(new Acorn("김민정", 99));
		list.add(new Acorn("이현겸", 61));
		list.add(new Acorn("박세인", 81));
		list.add(new Acorn("여도현", 75));

		// 1. 정렬하고 ㅈ출력하기
		// list.stream().sorted().forEach(item->System.out.println(item));
		// => Acorn이 comparable 구현해야함
		list.stream().sorted((o1, o2) -> o1.getScore() - o2.getScore()).forEach(item -> System.out.println(item));

		list.stream().sorted(new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o2.getScore() - o1.getScore();
			}
		});

		// Comparator.comparing

		list.stream().sorted(Comparator.<Acorn, Integer>comparing((item) -> {
			return item.getScore();
		})).forEach((item) -> {
			System.out.println(item);
		});

		System.out.println("=======");

		list.stream().sorted(Comparator.<Acorn, String>comparing(item -> item.getName()))
				.forEach(item -> System.out.println(item));

	}
}