package code;

public class 제어문_분기문switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int code = 2;
		int time = 10;
		int price = 0;

		// 구분코드에 따른 price구하기
		switch (code) {
		case 1:
			price = 1000;
			break;
		case 2:
			price = 2000;
			break;
		case 3:
			price = 3000;
			break;
		default:
			price = 0;
			break;
		}

		int money = time * price;
		System.out.println(money);
		
	}

}
