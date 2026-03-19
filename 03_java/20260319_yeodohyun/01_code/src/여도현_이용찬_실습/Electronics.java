package 여도현_이용찬_실습;

public class Electronics extends Goods {
	private String size;

	public Electronics() {

	}

	public Electronics(String name, int price, int quantity, int refundPeriod, String size) {
		super(name, price, quantity, refundPeriod);
		this.size = size;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("사이즈: " + size);
	}
}
