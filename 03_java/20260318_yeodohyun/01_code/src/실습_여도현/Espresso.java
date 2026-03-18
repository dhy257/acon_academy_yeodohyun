package 실습_여도현;

public class Espresso extends Coffee {

	// 생성자
	public Espresso() {
		System.out.println("Espresso 생성자 호출");
	}

	public void Extraction() {
		System.out.println("추출");
	}

	@Override
	public void coffee() {
		// TODO Auto-generated method stub
//		super.coffee();
		System.out.println("에스프레소입니다.");
	}
}
