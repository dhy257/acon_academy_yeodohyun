package day1.인터페이스_static_default;

public interface 한식요리가능한 {

	
	void 구절판만들기();
	void 불고기전골만들기();	 
 
	
	
	// default 매서드
	//1)모든 한식요리가능한 인터페이스를 구현하는 클래스들이 모두 똑같은 기능을 구현해야 한다면
	//개별적으로 implements 하는것이 아니라 하나의 구현을 제공할 수 있다.
	//2)필요하면  상속받은 자식 클래스에서 오버라이드가 가능하다	
	//결론) 디폴트매서드를 그냥사용해도 되고 오버라이드해서 재정의 가능하다 
	//     디폴트매서는 다른 인스턴스매서드를 사용해도 된다
	//
	
	//제공이유:  static매서드로 같은기능을 제공할 수 있다. 다른 인스턴스 매서드 호출할 수 없음
	
	
	default void 김치만두만들기() {	
		 
		System.out.println( "<김치만두만들기>>");
		System.out.println( "만두피 만들기");
		System.out.println( "김치넣기");
		System.out.println( "대파및 당면 양념한거 섞기");
		System.out.println( "중불에 15분 찌기");	
		
	}
	
	static void 김치만두만들기s() {			
		System.out.println( "<김치만두만들기>>");
		System.out.println( "만두피 만들기");
		System.out.println( "김치넣기");
		System.out.println( "대파및 당면 양념한거 섞기");
		System.out.println( "중불에 15분 찌기");	
		
		
		//default와  static 차이 !!
		//오버라이드 가능, 불가능 
		//매서드 사용법이 다르다 .
		//default 매서드는 객체생성후 사용가능
		//default 매서드는 다른 인스턴스 매서드를 호출할 수 있다
		
	}
 
	 
}
