package day5prac.애너테이션;

public class Food {
	String name;
	@MAXCalorie(180)
	int calorie;

	public Food(String name, int calorie) {
		super();
		this.name = name;
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calorie=" + calorie + "]";
	}

}
