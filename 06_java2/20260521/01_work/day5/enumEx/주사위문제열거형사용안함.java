package day5.enumEx;

import java.util.Random;

public class 주사위문제열거형사용안함 {
	  public static void main(String[] args) {
	        // 무작위로 주사위 던지기
	        int result = rollDice();
	         
	        
	        // 0 : 주사위 한 개   . 1 : 주사위  2개  ...  
	        // 결과에 따라 출력
	        switch(result) {
	            case 0:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 한 개");
	                break;
	            case 1:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 두 개");
	                break;
	            case 2:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 세 개");
	                break;
	            case 3:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 네 개");
	                break;
	            case 4:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 다섯 개");
	                break;
	            case 5:
	                System.out.println("주사위를 던져서 나온 눈의 개수: 여섯 개");
	                
	                break;
	            default:
	                System.out.println("주사위를 던진 결과 오류");
	        }
	    }

	    // 주사위를 무작위로 던지는 메서드
	    public static int rollDice() {	    	
	    	// 난수에 관련된 라이브러리   Random 클래스 
	        Random random = new Random();	        
	        return random.nextInt(6) ; // 0부터 5까지의 난수 생성
	    }
}
