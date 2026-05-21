package day5prac.실습;

public class DrinkMain {

	public static void main(String[] args) throws Exception {

		Drink d1 = new Drink("콜라", 25);

		Drink d2 = new Drink("초코라떼", 45);

		DrinkValidator.validate(d1);

		System.out.println();

		DrinkValidator.validate(d2);

	}
}