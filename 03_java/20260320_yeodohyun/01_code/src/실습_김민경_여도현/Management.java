package 실습_김민경_여도현;

import java.util.Scanner;

public class Management {

	public boolean select(int a) {

	    Scanner sc = new Scanner(System.in);

	    while(true) {

	        System.out.println("결제수단 선택:");
	        System.out.println("1. 카드  2. 현금  3. 카카오페이");

	        int payChoice = sc.nextInt();

	        Payment p;

	        if(payChoice == 1){
	            p = new CardPayment();
	        } else if(payChoice == 2){
	            p = new CashPayment();
	        } else if(payChoice == 3){
	            p = new KakaoPay();
	        } else {
	            System.out.println("잘못된 선택입니다.");
	            continue;
	        }

	        return p.pay(a); // ⭐ 여기서 결과 반환
	    }
	}
}
