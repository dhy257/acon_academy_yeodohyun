package day1.라이브러리만들기;



public class MyLib {
	
	

	public void printStar() {		
		//
		for( int i=1; i<=3; i++) {
			System.out.print("*");
		}		
	}
	
	public void printChar(char ch) {		
		//
		for( int i=1; i<=3; i++) {
			System.out.println(ch);
		}		
	}
	
	
	//  실행할 코드  =?
	//  인터페이스 활용함 !!   (약속을 정할 때 인터페이스 활용함 )
	
	
	public  void  코드반복실행하기( 코드 code  ) {		
		//
		for( int i=1; i<=3; i++) {
			code.실행코드();
			 
		}	
	}
	

}
