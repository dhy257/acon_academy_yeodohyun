package day1.인터페이스_static_default;

public class 한식요리가능한프로그램 {

	public static void main(String[] args) {
		 
		
		
		A요리사  a= new A요리사();
		B요리사  b = new B요리사();
		
		
		//default매서드는 객체생성 후 사용가능
		// 필요하면 오버라이드 할 수 있음 
		
		a.김치만두만들기();
		b.김치만두만들기();
		
		
		
		//static매서드는 객체생성과 상관없이 호출할 수 있다	
		//자식이 오버라이드 할 수 없다
		한식요리가능한.김치만두만들기s();

	}

}
