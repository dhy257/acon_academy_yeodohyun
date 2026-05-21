package day5prac.애너테이션;

public class MyLib {
	@BeforeAndAfter(before = "매서드 실행되기전에 출력!", after = "매서드 실행 후 실행")
	public void printStar() {
		System.out.println("***");
	}
}
