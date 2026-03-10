package 배열실습문제;

import java.util.Scanner;

public class 배열실습문제1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2) stop 입력될 때 까지  사원명과 출장비가 입력되면 화폐매수를 출력하는 프로그램 작성하시오

		Scanner sc = new Scanner(System.in);
		int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] total = new int[8];
		int[] cnt = new int[8];
		int money;
		String name = "";

		while (true) {
			System.out.print("사원명 입력(stop 종료): ");
			name = sc.next();

			if (name.equals("stop")) {
				break;
			}

			System.out.print("출장비 입력: ");
			money = sc.nextInt();

			for (int i = 0; i < moneys.length; i++) {
				cnt[i] = money / moneys[i];
				money %= moneys[i];

				total[i] += cnt[i];
			}

			System.out.println(name + " 화폐매수");

			for (int i = 0; i < moneys.length; i++) {
				System.out.println(moneys[i] + "원 : " + cnt[i]);
			}

			System.out.println("==================");
			System.out.println("전체 화폐매수");

			for (int i = 0; i < moneys.length; i++) {
				System.out.println(moneys[i] + "원 : " + total[i]);
			}

		}

		//
	}

}
