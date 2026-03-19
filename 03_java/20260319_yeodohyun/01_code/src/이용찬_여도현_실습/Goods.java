package 이용찬_여도현_실습;

public class Goods extends Product {
	private int refundPeriod;

	public Goods() {}
	
	// 환불기한 추가
	public Goods(String name, int price, int quantity, int refundPeriod) {
		super(name, price, quantity);
		this.refundPeriod = refundPeriod;
	}
	
	public int getRefundPeriod() {
		return this.refundPeriod;
	}
	
	// 오버라이드 => 환불기한 표시
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("환불기한: " + refundPeriod + "일");
	}

}
