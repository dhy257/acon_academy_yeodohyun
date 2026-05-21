package day5.enumEx2;

public class 요일사용하기 {

	public static void main(String[] args) {
		
		
		
		
		// 1. 요일을 숫자로 다루기
		
		//0:일,  1:월 ....  토:6		
		int day=1;     //1이 무엇을 의미하는지 알 수 없다. 가독성 떨어짐, 다른값이 들어가는 것을 막을 수 없다
		
		
		//2.  요일을 상수로 다루기
		
		 
		int day2= DAY.MONDAY;     //가독성이 높아진다
		//day2 =100;   //          요일 정보가 아닌 다른 값이 들어가는 것을  막을 수 없다 
		
		 
		//enum ( 일요일 ~ 토요일 요일정보를 나타내도록 하자!!)		
		DAY2 day3  =DAY2.MONDAY;
		
		//가독성, 다른값이 들어 가는 것을 막을 수 있다
		 
		
		System.out.println(  day);
		System.out.println(  day2);
		System.out.println(  day3);
		 
		
		 System.out.println( "DAY2  enum  내용 확인하기");
		 for( DAY2 d  : DAY2.values()) {
			 System.out.println( d);
		 }
		
		
	}

}
