package day2prac.consumer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("구구단 입력 : ");
		int dan = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			list.add(i);
		}

		// 익명 클래스
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
			}
		});

		System.out.println("-----");

		// 람다
		list.forEach((i) -> {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		});

		System.out.println("-----");

		list.forEach(i -> System.out.printf("%d x %d = %d\n", dan, i, (dan * i)));

		System.out.println("-----");

		// 4. 메서드 참조
		Consumer<Integer> gugudan = i -> System.out.printf("%d x %d = %d\n", dan, i, (dan * i));

		list.forEach(gugudan);

		sc.close();
	}
}