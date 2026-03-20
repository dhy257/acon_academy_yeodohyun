package 인터페이스실습;

import java.util.Scanner;

//public class Management {

//
//	public void select(int a) {
//
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//
//			// 🎯 결제수단 선택
//			System.out.println("결제수단 선택:");
//			System.out.println("1. 카드  2. 현금  3. 카카오페이");
//
//			int payChoice = sc.nextInt();
//
//			Payment p;
//
//			if (payChoice == 1) {
//				p = new CardPayment();
//				p.pay(a);
//				break;
//			} else if (payChoice == 2) {
//				p = new CashPayment();
//				p.pay(a);
//				break;
//			} else if (payChoice == 3) {
//				p = new KakaoPay();
//				p.pay(a);
//				break;
//			} else {
//				System.out.println("잘못된 선택입니다.");
//				continue;
//			}
//		}
//
//	}
//}

import java.util.HashMap;
import java.util.Map;

public class Management {

	private Map<Integer, Payment> paymentMap = new HashMap<>();

	public Management() {
		paymentMap.put(1, new CardPayment());
		paymentMap.put(2, new CashPayment());
		paymentMap.put(3, new KakaoPay());
	}

	// select() 메서드 존재 + 반환 타입 Payment
	public Payment select() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("결제수단 선택:");
			System.out.println("1. 카드  2. 현금  3. 카카오페이");

			int choice = sc.nextInt();
			Payment p = paymentMap.get(choice);

			if (p != null)
				return p;
			System.out.println("잘못된 선택 ❌");
		}
	}
}