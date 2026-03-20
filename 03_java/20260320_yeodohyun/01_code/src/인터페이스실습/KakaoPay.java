package 인터페이스실습;

public class KakaoPay implements Payment {

	private int money = 50000;

	@Override
	public boolean pay(int amount) {
		System.out.println("현재 잔액: " + money + "원");
		System.out.println("결제 금액: " + amount + "원");

		if (money >= amount) {
			money -= amount;
			System.out.println("카카오페이 결제 성공 👍");
			System.out.println("남은 잔액: " + money + "원");
			System.out.println();
			return true;
		} else {
			System.out.println("카카오페이 잔액 부족 ❌");
			System.out.println();
			return false;
		}
	}

}
