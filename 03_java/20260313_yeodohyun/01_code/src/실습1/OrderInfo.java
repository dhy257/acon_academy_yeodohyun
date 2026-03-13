package 실습1;

public class OrderInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o = new Order(); // 객체 생성

		o.inputOrderInfo("201803120001", "abc123", "2018년3월12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		o.printOrderInfo(); // 출력

	}

}
