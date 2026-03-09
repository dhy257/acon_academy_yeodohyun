package javaprj.day05;

public class 실습1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*실습 )
	   1. 배열저장출력문제    (값 넣고  출력하기)
	   
	   1) 1차원배열 사용하기 -  일주일점심메뉴 또는 단어  
	   2) 1차원배열 사용하기 -  예상 로또번호  저장하고 출력하기
	   3) 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
	   4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
	   5) 3차원배열 사용하기
	   */
		
		
		//
		String[] 계절 = new String [4];
		계절[0] = "봄";
		계절[1] = "여름";
		계절[2] = "가을";
		계절[3] = "겨울";
		
		System.out.print("우리나라 계절은" + " ");
		System.out.print(계절[0] + " ");
		System.out.print(계절[1]+ " ");
		System.out.print(계절[2]+ " ");
		System.out.println(계절[3]);
		
		
		
		//
		String[][] food = {
				{"우엉 ","딸기 ","더덕 "},
				{"아귀 ","바지락 ","꼬막 "},
				{"달래 ","쑥 ","취나물 "},
				{"두릅 ","키조개 ","소라 "},
				{"장어 ","매실 ","멍게"},
				{"감자 ","참외 ","복분자"}
		};
	    
		
		for (int i=0; i<6; i++) {
			 System.out.println("\n" + (i+1) + "월 제철음식");
			 
			for(int j=0; j<3; j++) {
				System.out.println(food[i][j]);
				
			}
		}
			
		
		
	 
	}
	

}
