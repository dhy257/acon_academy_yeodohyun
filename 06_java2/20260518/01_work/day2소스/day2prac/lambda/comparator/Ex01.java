package day2prac.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

import day2.lambda.consumer.Acorn;

// ArrayList 출력하기 forEach 매서드
// " 정렬하기 - Comparator 직접구현, Comparator.compararing 으로 구현하기
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Acorn> list = new ArrayList<>();
		list.add(new Acorn("acorn1", "0000", "나해수"));
		list.add(new Acorn("acorn2", "1234", "손영석"));
		list.add(new Acorn("acorn3", "3456", "송주창"));
		list.add(new Acorn("acorn4", "1234", "김민경"));
		list.add(new Acorn("acorn5", "5678", "김민정"));
		list.add(new Acorn("acorn6", "1090", "박세인"));
		list.add(new Acorn("acorn7", "0000", "여도현"));
		list.add(new Acorn("acorn8", "0000", "이용찬"));
		list.add(new Acorn("acorn9", "1234", "이현겸"));

		// 출력하기
		list.forEach(new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				// TODO Auto-generated method stub
				System.out.println(t.getName());
			}
		});

		// 람다
		list.forEach((item) -> {
			System.out.println(item);
		});

		list.forEach(item -> System.out.println(item));

		// 정렬하기
		// Arrays
		Collections.sort(list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName()); // 기준이 크면 양수, 아니면 음
			}
		});

		System.out.println("==이름 정렬후==");
		list.forEach(item -> System.out.println(item.getName()));

		Collections.sort(list, (o1, o2) -> {
			return o1.getPw().compareTo(o2.getPw());
		});
		System.out.println("==비밀번호 정렬후==");
		list.forEach(item -> System.out.println(item.getName()));

		//
		Collections.sort(list, (o1, o2) -> o1.getPw().compareTo(o2.getPw()));
		System.out.println("==비밀번호 정렬후==");
		list.forEach(item -> System.out.println(item.getName()));
	}

}
