package 오후실습_여도현;

public class Espresso extends Coffee {

	public Espresso(String name) {
		super(name);
	}

	@Override
	public void make() {
		System.out.println("에스프레소를 추출했다!");
	}

	public void steamMilk() {
		System.out.println("우유를 스티밍했다!");
	}
}