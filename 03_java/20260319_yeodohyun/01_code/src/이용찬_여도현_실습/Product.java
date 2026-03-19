package 이용찬_여도현_실습;

public class Product {

	private String name;
	private int price;
	private int num;
	
	public Product() {}
	
	public Product(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public void showInfo() {
		
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
	
}
