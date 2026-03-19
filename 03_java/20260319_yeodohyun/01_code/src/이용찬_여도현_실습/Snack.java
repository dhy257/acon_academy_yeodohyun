package 이용찬_여도현_실습;

public class Snack extends Food {

	private int weight;
	
	public Snack() {}
	
	public Snack(String name, int price, int num, int exp, int weight) {
		super(name, price, num, exp);
		this.weight = weight;
	}
	
	@Override
	public void spoil() {
		System.out.println("잘 부패하지 않습니다");
	}
	
	
	
}
