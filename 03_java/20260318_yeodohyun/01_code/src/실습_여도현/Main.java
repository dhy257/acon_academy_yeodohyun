package 실습_여도현;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drip coffee1 = new Drip();
		Espresso coffee2 = new Espresso();

		dripCoffee(coffee1);
		extractCoffee(coffee2);
		System.out.println("==============업캐스팅============");
		coffeeDivide(coffee1); // Drip > Coffee
		coffeeDivide(coffee2); // Espresso > Coffee
		System.out.println("==============잘못된 다운캐스팅============");

		// coffee3는 에스프레소인데 드립으로 변환 시도 >> 서로 다른 자식이라 잘못됨
		Coffee coffee3 = new Espresso(); // 실제 객체는 Espresso

		Drip wrong = (Drip) coffee3; // 잘못된 다운캐스팅
		wrong.Brewing();

	}

	public static void dripCoffee(Drip coffee) {
		coffee.coffee();
		coffee.Brewing();
	}

	public static void extractCoffee(Espresso coffee) {
		coffee.coffee();
		coffee.Extraction();
	}

	// 업캐스팅
	public static void coffeeDivide(Coffee coffee) {
		coffee.coffee();
		// instanceof + 다운캐스팅
		if (coffee instanceof Drip) {
			((Drip) coffee).Brewing();
		} else if (coffee instanceof Espresso) {
			((Espresso) coffee).Extraction();
		}
	}

}
