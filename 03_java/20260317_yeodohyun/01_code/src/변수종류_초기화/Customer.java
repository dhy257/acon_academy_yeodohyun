package 변수종류_초기화;

public class Customer { // new 에 의해서 변수(객체)가 만들어짐

	// 인스턴스 변수
	// 기본초기화
	String name;
	int age;
	// 명시적 초기화
	int point = 100;

	// 인스턴스 초기화 블럭
	{

	}

	// 생성자
	public Customer() {

	}

	public Customer(String name, int age, int point) {
		this.name = name;
		this.age = age;
		this.point = point;
	}

	// toString

	// getter

	// setter

}
