package 실습_여도현;

public class Drip extends Coffee {

	public Drip() {
		System.out.println("Drip 생성자 호출");
	}

	public void Brewing() {
		System.out.println("브루잉");
	}

	@Override
	public void coffee() {
		// TODO Auto-generated method stub
//		super.coffee();
		System.out.println("드립커피입니다.");
	}
}
