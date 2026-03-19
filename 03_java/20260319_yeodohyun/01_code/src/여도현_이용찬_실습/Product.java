package 여도현_이용찬_실습;

public class Product {
	protected String name;
	protected int price;
	protected int quantity;

	public Product() {

	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// 재고추가
	public void addStock(int amount) {
		quantity += amount;
	}
	// 판매
	public void sell(int amount) {
		if (quantity >= amount) {
			quantity -= amount;
			System.out.println("판매완료");
		} else {
			System.out.println("재고부족");
		}
	}
	// 정보출력 => 이후 오버라이드로 자식객체만의 정보 추가 출력
	public void showInfo() {
		System.out.println("이름: " + name + ", 가격: " + price + ", 수량: " + quantity);

	}

}
