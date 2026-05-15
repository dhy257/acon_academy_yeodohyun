package day1.라이브러리만들기;

public class TestMain {
 
	
	 
	public static void main(String[] args) {
		
		MyLib lib = new MyLib();
		lib.printChar('a');
		
		//1) 인터페이스를 이름있는 클래스로 구현하기 
		lib.코드반복실행하기(  new 코드구현() );
		
		
		
		//2) 인터페이스를 익명클래스로 구현한기
		lib.코드반복실행하기(  new 코드() {

			@Override
			public void 실행코드() {
				
				
				System.out.println( "3단  !!!!");

				for( int i=1 ; i<=9; i++) {
					System.out.println( 3*i);
				}
				
			}});
		
		
		//3.람다식으로 구현하기  (함수형인터페이스만 가능함)
		
		lib.코드반복실행하기( ()-> {
			System.out.println( "3단  !!!!");

			for( int i=1 ; i<=9; i++) {
				System.out.println( 3*i);
			}
		});
		 
	}

}
