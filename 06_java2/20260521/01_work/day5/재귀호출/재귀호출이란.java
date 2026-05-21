package day5.재귀호출;

public class 재귀호출이란 {

	public static void main(String[] args) {
		 
		
		System.out.println("재귀호출이란? 자기자신을 호출하는 것을 말한다.");
		System.out.println("주의사항 !! 반드시 종료 조건이 있어야 한다.");
		
		
		// 1부터 10까지 합				
		int total=0;
		int su=10;
		for( int i=1; i<=10 ; i++) {
			total+= i;
		}
		
		System.out.println(  "수 까지 합" +total);			
		// 1~10까지 합 함수만들기		
		int result1 =getTotal(10);
		System.out.println(result1);
		
		
		// 1~10까지 합 재귀함수로 만들기 
		
		int result2=getTotalR(10);
		System.out.println(result2);		
	}
	 
	
	
	public static int getTotal(int su) {         // static 매서드 , 객체생성없이 호출가능 
		int total=0;
		for( int i=1; i<=su ; i++) {
			total += i;
		}		
		return total;
	}	
	
	public static int getTotalR( int su) {		
		if( su==1) {
			return 1;
		}else  return  su + getTotalR( su-1);
	}
	
	
	
	
	
	
}
