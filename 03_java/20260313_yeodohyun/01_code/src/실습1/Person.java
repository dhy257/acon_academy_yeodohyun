package 실습1;

public class Person {

	int age;
	String name;
	boolean isMarried;
	int child;

	// 입력
	public void inputPersonInfo(int age, String name, boolean isMarried, int child) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.child = child;
	}

	// 출력
	public void printPersonInfo() {
		System.out.println("이 사람의 나이: " + this.age);
		System.out.println("이 사람의 이름: " + this.name);
		System.out.println("이 사람의 결혼 여부: " + (this.isMarried ? "결혼함" : "미혼"));
		System.out.println("이 사람의 자녀수: " + this.child);
	}
}
