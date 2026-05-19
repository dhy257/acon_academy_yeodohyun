package day2prac;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습 {
	public static void main(String[] args) {
		System.out.println("==========Runnable==========");
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("곧 영화가 시작됩니다. 휴대폰은 매너모드로 변경해주세요.");
			}
		};

		r1.run();

		System.out.println("==========Consumer==========");
		Consumer<String> welcomeMessage = name -> {
			System.out.println("🎉 " + name + "님, 회원가입을 축하합니다!");
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력: ");
		String inputName = sc.next();
		welcomeMessage.accept(inputName);

		//
		System.out.println("==========Supplier==========");

		Supplier<Integer> seat = () -> (int) (Math.random() * 100) + 1;
		int randomSeats = seat.get();
		System.out.printf("남은 좌석 수는 %d\n", randomSeats);

		System.out.println("==========Predicate==========");
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add(inputName);

		Predicate<String> nameCheck = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return nameList.contains(t);
			}

		};

		System.out.println("이름 확인: ");
		String checkName = sc.next();

		boolean result = nameCheck.test(checkName);
		System.out.println("본인인증 : " + result);

		//
		System.out.println("==========Function==========");
		Function<Integer, Integer> payment = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer cnt) {
				// TODO Auto-generated method stub
				int price = 10000;
				return cnt * price;
			}

		};

		System.out.println("예매할 인원 수를 입력하세요: ");
		int price = sc.nextInt();

		int total = payment.apply(price);
		System.out.printf("최종 결제 금액 : %d\n", total);

		//
		sc.close();
	}
}
