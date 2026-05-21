package day5prac.애너테이션;

public class 사원 {
	@MaxLen(length = 3)
	String name;

	@WeekDaysAvail({ "MonDay", "Wendsday", "Friday" })
	String 쉬는요일;

	// 생성자
	public 사원(String name, String 쉬는요일) {
		super();
		this.name = name;
		this.쉬는요일 = 쉬는요일;
	}

	// toString
	@Override
	public String toString() {
		return "사원 [name=" + name + ", 쉬는요일=" + 쉬는요일 + "]";
	}
}
