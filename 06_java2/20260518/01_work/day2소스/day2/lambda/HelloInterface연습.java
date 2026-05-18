package day2.lambda;


// 인터페이스를 구현하는 3가지 방법




public class HelloInterface연습 {

	public static void main(String[] args) {
		
		
		//1. 인터페이스 구현한 클래스 작성 
		class  HelloInterfaceImp  implements HelloInterface{

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println(" hello ^^");
				
			}
			
		}
		
		
		HelloInterfaceImp instance  = new  HelloInterfaceImp();
		instance.print();
		
		
		


		// 2.익명
		//	HelloInterface   h  =  new HelloInterface() {};  //익명클래스 작성
		HelloInterface   h  =  new HelloInterface() {

			@Override
			public void print() {
				 System.out.println(" 함수형 인터페이스를 익명으로 구현 했어요");
				
			}};			
			
		h.print();
		
		
		// 3. 람다식으로 구현
		// 함수를 간단한 식으로 표현함 
		// 익명클래스의 익명객체가 만들어짐 		
		//  () ->{}
		
		
		//
		HelloInterface h1 =()-> System.out.println("람다구현");
		h1.print();
		
		
		//
		HelloInterface  h2 = () ->{  System.out.println(" 함수형 인터페이스를 람다식으로구현 했어요");};
		h2.print();
		
		//
		HelloInterface h3  = () -> {
			
			
			System.out.println("^______^");
			System.out.println("오늘의 날씨");
			System.out.println("2025-05-15");
			int n = (int) ((Math.random() * 45) + 1);
			System.out.println("랜덤 수" + n);
			
		}; 
		h3.print();
		
	 
		
		
		
		
	 
		
		
		

	}

}
