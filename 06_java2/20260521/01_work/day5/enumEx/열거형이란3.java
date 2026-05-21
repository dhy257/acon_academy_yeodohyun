package day5.enumEx;


//열거형자료형 
//한정된 값을 사용할 수 있도록 한다. 
//가독성 높이고, 원치않는 값이 설정되는 오류를 방지할 수 있다.

//열거형 만들기
 enum ScreenMode {
    LIGHT,
    DARK
}

public class 열거형이란3 {
	
	public static void main(String[] args) {	
		
		
		//열거형변수 만들기 
		ScreenMode mode = null;  // null로 초기화
		
		//변수에 값을 설정하기
		mode = ScreenMode.LIGHT;   //열거형이름.상수
		mode = ScreenMode.DARK;
		 
		System.out.println( mode);
		
		
		//values를 통해서 열거형 값들을 확인할 수 있다
		System.out.println(   ScreenMode.values()[0]);
		

		
	}
}
