package day2.lambda;

public class 람다만나기 {

	public static void main(String[] args) {
		 
		                               //익명클래스작성 , 익명객체생성
		HelloInterface  hi  =  ( ) ->  System.out.println(" hello lamda");		
		hi.print();
		
		
				
		//1. 인터페이스를 구현한 이름있는 클래스 
		
		//매서드안에서 클래스를 작성할 수 있다. ( 지역 내부 클래스 )
		class HelloImp implements HelloInterface{
			@Override
			public void print() {
				 System.out.println(" hello !" );
				
			}			
		}
		
		HelloImp  hi2 = new HelloImp();
		hi2.print();
				
		//2. 인터페이스를 구현한 이름없는 클래스 (익명)		

		HelloInterface hi3  = new  HelloInterface() {

			@Override
			public void print() {
				System.out.println(" hello 익명");
				
			}};
			
	
		hi3.print();		
		
		
		//3. 람다식 사용
		HelloInterface hi4 = () -> System.out.println(" hello lamda ^^");
		hi4.print();
		

	}

}
