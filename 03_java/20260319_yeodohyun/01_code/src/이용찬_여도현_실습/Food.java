package 이용찬_여도현_실습;

public class Food extends Product {
	
	private int exp;
	
	public Food() {}
	
	public Food(String name, int price, int num, int exp) {
		super(name, price, num);
		this.exp = exp;
	}

	public void eat() {
		System.out.println("먹기");
	}
	
	public void spoil() {
		System.out.println("상했습니다");
	}
	
	public int getExp() {
		return this.exp;
	}

	
	
	
	
	
}
