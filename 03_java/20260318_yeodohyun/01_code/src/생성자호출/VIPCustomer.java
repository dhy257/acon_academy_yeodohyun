package 생성자호출;

public class VIPCustomer extends Customer {

	double discountRate;

	// 생성자

	// 자식의 생성자
	// 자식의 생성자에서 명시하지 않으면 (명시적으로 부모의 생성자를 호출하지 않으면) 기본적으로 무조건 부모의 기본생성자를 호출한다

	// 확인하기!!
	// 부모클래스에 기본생성자가 있는지 확인하기

	// 이 문제를 해결하는 방법
	// -부모에 기본생성자 만들기
	// -부모의 명시적으로 매개변수가 있는 생성자를 호출하는 방법

	public VIPCustomer(String name, String email, String phoneNumber, double discountRate) {
		// super(); // 명시하지 않으면 자동으로 super() => 부모의 기본생성자가 없으니까 오류가 발생했음
		super(name, email, phoneNumber);
		this.discountRate = discountRate;

	}

	/*
	 * public VIPCustomer( String name, String email, String phoneNumber , double
	 * discountRate) { //super(); 부모생성자를 명시적으로 호출하지 않으면 자동으로 들어감 ! this.name= name;
	 * this.email= email; this.phoneNumber = phoneNumber; this.discountRate =
	 * discountRate;
	 * 
	 * }
	 */

	// 부모의 toString()
	// 자식의 toString()
	// 이름이 같은 매서드가 있을 때 부모의 매서드를 호출하려면 super.toString()

	public String toString() {
		String str = super.toString();
		return str + " " + discountRate;

	}

	public void printInfo() {

		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNumber);
		System.out.println(discountRate);
	}

}
