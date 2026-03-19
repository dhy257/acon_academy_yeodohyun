package object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스가 상속을 받지 않으면 자바는 무조건 Object를 상속받게 한다.

		A a1 = new A();
		B b1 = new B();

		// 두 개의 객체는 부모타입으로 다룰 수 있다. 업캐스팅
		// Object만큼으로 해석한다, 실체가 바뀌는 건 아님
		// 필요하면 다운캐스팅 해서 고유의 기능을 사용할 수 있다
		Object[] arr = new Object[] { a1, b1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); 
//			System.out.println(arr[i].toString()); 

		}

		// 객체의 정보를 반환하는 매서드 ( 목적: 객체의 정보 반환 )
		// 자식들이 객체의 정보를 올바르게 제공하기 위해서는 적절하게 오버라이딩
		// toString 매서드는 부모에 있는 매서드로 상속받은 것이다.

		// 객체가 최소한 자신의 올바른 정보를 제공할 수 있도록 해야함
		
	}

}
