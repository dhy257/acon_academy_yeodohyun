package 배열실습문제;

import java.util.Scanner;

public class 배열실습문제1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] cnt = new int[8];

		System.out.print("사원명 입력: ");
		String name = sc.next();

		System.out.print("출장비 입력: ");
		int money = sc.nextInt();

		for (int i = 0; i < moneys.length; i++) {
			cnt[i] = money / moneys[i];
			money = money % moneys[i];
		}

		System.out.println(name + " 화폐매수");

		for (int i = 0; i < moneys.length; i++) {
			System.out.println(moneys[i] + "원 : " + cnt[i]);
		}

	}

}
