package day5prac.애너테이션;

public class Store {
	@Count(value = 5)
	private int apples;

	@Count(3) // value 생략가능
	private int bananas;

	@Count // default 사용
	private int tomatos;

	public Store(int apples, int bananas, int tomatos) {
		super();
		this.apples = apples;
		this.bananas = bananas;
		this.tomatos = tomatos;
	}

}
