package 실습1;

public class Order {

	String orderNumber;
	String orderId;
	String orderDate;
	String orderName;
	String productNumber;
	String address;

	// 입력
	public void inputOrderInfo(String orderNumber, String orderId, String orderDate, String orderName,
			String productNumber, String address) {

		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.productNumber = productNumber;
		this.address = address;
	}

	// 출력
	public void printOrderInfo() {
		System.out.println("주문번호: " + this.orderNumber);
		System.out.println("주문자아이디: " + this.orderId);
		System.out.println("주문날짜: " + this.orderDate);
		System.out.println("주문자이름: " + this.orderName);
		System.out.println("주문상품번호: " + this.productNumber);
		System.out.println("배송주소: " + this.address);
	}
}
