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
