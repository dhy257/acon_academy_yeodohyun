package day2prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Scanner;

public class 오후실습_여도현 {

	public static void main(String[] args) {

		// 1. Runnable : 버킷리스트 출력하기

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("===== 버킷리스트 =====");
				System.out.println("1. 버킷리스트1");
				System.out.println("2. 버킷리스트2");
				System.out.println("3. 버킷리스트3");
			}
		};

		r1.run();

		// 2. Consumer : 3만원으로 장보기

		Consumer<Integer> c1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer money) {
				// TODO Auto-generated method stub

				System.out.println("===== 장보기 =====");
				System.out.println("예산 : " + money + "원");

				int shop1 = 5000;
				int shop2 = 3000;
				int shop3 = 7000;

				int total = shop1 + shop2 + shop3;

				System.out.println("장거리1 : " + shop1 + "원");
				System.out.println("장거리2 : " + shop2 + "원");
				System.out.println("장거리3 : " + shop3 + "원");
				System.out.println("총 사용 금액 : " + total + "원");
				System.out.println("남은 금액 : " + (money - total) + "원");

			}
		};

		c1.accept(30000);

		//
		Consumer<Integer> c2 = money -> {
			System.out.println("3만원으로 장보기 끝");
		};

		c2.accept(30000);

		// 3. Supplier : 요리 만들기

		Supplier<String> s1 = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub

				System.out.println("===== 계란볶음밥 레시피 =====");
				System.out.println("1. 계란을 푼다");
				System.out.println("2. 밥을 넣는다");
				System.out.println("3. 볶는다");

				return "계란볶음밥";
			}
		};

		String food = s1.get();
		System.out.println(food + " 요리 완료");

		//
		Supplier<String> s2 = () -> {

			System.out.println("===== 라면 레시피 =====");
			System.out.println("1. 고추,파 기름 볶아서 만들기");
			System.out.println("2. 물 넣고 스프 반 넣기");
			System.out.println("3. 면 2분 끓이고 빼두기");
			System.out.println("4. 끓은 스프넣은 물에 빼둔 면 넣기");
			System.out.println("5. 계란을 풀고 끓는 라면 위에 둘러서 붓기");

			return "라면";
		};

		String food2 = s2.get();
		System.out.println(food2 + " 요리 완료");

		// 4. Predicate 입력으로 받은 요리가 내가만든요리인 경우 true, false반환하기

		ArrayList<String> myFood = new ArrayList<>();

		myFood.add(food);
		myFood.add(food2);

		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return myFood.contains(t);
			}
		};

		boolean result = p1.test("라면");
		System.out.println("내가 만든 요리인가? " + result);

		//
		Predicate<String> p2 = item -> myFood.contains(item);

		boolean result2 = p2.test("피자");
		System.out.println("내가 만든 요리인가? " + result2);

		// 5. Function 입력하나 반환있는 함수 만들기

		Scanner sc = new Scanner(System.in);

		// 1) 입력받은 수의 제곱 반환

		Function<Integer, Integer> f1 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t;
			}
		};

		System.out.print("제곱할 숫자 입력 : ");
		int num1 = sc.nextInt();

		int square = f1.apply(num1);
		System.out.println("제곱 결과 : " + square);

		//
		Function<Integer, Integer> f2 = num -> num * num;

		System.out.print("제곱할 숫자 입력 : ");
		int num2 = sc.nextInt();

		int square2 = f2.apply(num2);
		System.out.println("제곱 결과 : " + square2);

		// 2) 입력받은 수 범위안의 난수 반환

		Function<Integer, Integer> f3 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return (int) (Math.random() * t) + 1;
			}
		};

		System.out.print("난수 범위 입력 : ");
		int randomNum1 = sc.nextInt();

		int random = f3.apply(randomNum1);
		System.out.println("난수 결과 : " + random);

		//
		Function<Integer, Integer> f4 = num -> (int) (Math.random() * num) + 1;

		System.out.print("난수 범위 입력 : ");
		int randomNum2 = sc.nextInt();

		int random2 = f4.apply(randomNum2);
		System.out.println("난수 결과 : " + random2);

		// 3) 입력받은 금액에 대한 화폐 매수 구하기

		Function<Integer, int[]> f5 = new Function<Integer, int[]>() {

			@Override
			public int[] apply(Integer money) {
				// TODO Auto-generated method stub

				int[] result = new int[4];

				result[0] = money / 50000; // 5만원
				money %= 50000;

				result[1] = money / 10000; // 1만원
				money %= 10000;

				result[2] = money / 5000; // 5천원
				money %= 5000;

				result[3] = money / 1000; // 천원

				return result;
			}
		};

		System.out.print("금액 입력 : ");
		int money1 = sc.nextInt();

		int[] moneyResult = f5.apply(money1);

		System.out.println("5만원 : " + moneyResult[0] + "개");
		System.out.println("1만원 : " + moneyResult[1] + "개");
		System.out.println("5천원 : " + moneyResult[2] + "개");
		System.out.println("1천원 : " + moneyResult[3] + "개");

		//
		Function<Integer, int[]> f6 = money -> {

			int[] result3 = new int[4];

			result3[0] = money / 50000;
			money %= 50000;

			result3[1] = money / 10000;
			money %= 10000;

			result3[2] = money / 5000;
			money %= 5000;

			result3[3] = money / 1000;

			return result3;
		};

		System.out.print("금액 입력 : ");
		int money2 = sc.nextInt();

		int[] moneyResult2 = f6.apply(money2);

		System.out.println("5만원 : " + moneyResult2[0] + "개");
		System.out.println("1만원 : " + moneyResult2[1] + "개");
		System.out.println("5천원 : " + moneyResult2[2] + "개");
		System.out.println("1천원 : " + moneyResult2[3] + "개");

		sc.close();
	}

}