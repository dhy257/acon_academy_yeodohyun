package 라이브러리복습;

import java.util.Scanner;

public class HowCoffee {

//	public void selectCoffee(Coffee coffee) {
//		coffee.extraction();
//	}
	public void selectCoffee() {
		Scanner sc = new Scanner(System.in);
		// 콩 종류
		System.out.print("콩 종류를 입력하세요: ");
		String bean = sc.nextLine();
		// 온도 선택
		System.out.println("온도 선택: 1. 핫  2. 아이스");
		int tempChoice = sc.nextInt();
		// 커피 선택
		System.out.println("커피 선택: 1. 드립  2. 에스프레소");
		int coffeeChoice = sc.nextInt();
		// 핫 아이스 넣기 위한 String
		String temp;

		// 온도 선택
		if (tempChoice == 1) {
			temp = "핫";
		} else if (tempChoice == 2) {
			temp = "아이스";
		} else {
			System.out.println("온도 선택 오류");
			return;
		}
		// 커피 선택
		Coffee coffee;

		// 커피 선택
		if (coffeeChoice == 1) {
			coffee = new Drip();
		} else if (coffeeChoice == 2) {
			coffee = new Espresso();
		} else {
			System.out.println("커피 선택 오류");
			return;
		}

		coffee.extraction(bean, temp);
	}

}
