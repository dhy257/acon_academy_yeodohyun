package day5.enumEx;

import java.util.Random;

enum DiceFace {
    ONE, TWO, THREE, FOUR, FIVE, SIX   //  0  1  2  3  4  5   // 대문자로 작성 
}

public class 주사위문제열거형사용 {
    // 주사위 면을 나타내는 enum 정의
	// enum Type 
	// 열거형자료형 만들기  
  
    public static void main(String[] args) {
        // 무작위로 주사위 던지기
        //열거형변수 선언
        DiceFace diceface = null;        
        // 결과 출력
        diceface = rollDice();  // DiceFace 범위에 올 수 있는 값이 정해져 있다.        
        
        System.out.println( diceface);
        switch(diceface) {
	        case   ONE:
	        	System.out.println("주사위 던져서 나온 개수  :  한 개"); 
	        	break;
	        case  TWO:
	        	System.out.println("주사위 던져서 나온 개수  :   두 개"); 
	            break;
	        case THREE:
	        	System.out.println("주사위 던져서 나온 개수  :  세 개"); 
	            break;
	        case FOUR:
	        	System.out.println("주사위 던져서 나온 개수  :  네 개"); 
	            break;
	        case FIVE:
	        	System.out.println("주사위 던져서 나온 개수  :  다섯 개"); 
	            break;
	        case SIX:
	        	System.out.println("주사위 던져서 나온 개수  :  여섯 개");     
        }              
       
    }  

    // 주사위를 무작위로 던지는 메서드
    public static DiceFace rollDice() {
        Random random = new Random();
        int randomNumber = random.nextInt(DiceFace.values().length);  //0~5 
        return DiceFace.values()[randomNumber];
    }
}

