package day5prac.실습;

public class Drink {

	private String name;

	@MaxSugar(30)
	private int sugar;

	public Drink(String name, int sugar) {

		this.name = name;
		this.sugar = sugar;

	}

	public String getName() {
		return name;
	}

	public int getSugar() {
		return sugar;
	}
}