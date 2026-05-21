package day5.enumEx;

public class 열거형이란 {

	
	public static void main(String[] args) {
		// 열거형이란?  지정된 선택지 내의 값을 사용할 수 있도록함 	  
		
		//화면모드가 LIGTH , DARK 만 사용하고 싶다면  열거형을 만들어 사용할 수 있다.
		 //열거형을 사용하면 좋은점?
		// 1. 가독성 , 2. 오타방지 : 올바른 상수를 선택하도록 돕는다
        String mode = "LIGHT";
        mode = "DARK";     
        
        
 
     // 문자열로 사용하면 사용이 불안정함 !   
     // mode를 둘 중 한 개의 값만 사용하고 싶을 때 
     // 아래와 같은 실수를 간편히 방지할 방법이 없음
        mode = "lite"; 
        
        
	
        
       
        

	}

}
