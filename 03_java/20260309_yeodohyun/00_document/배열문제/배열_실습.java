package javaprj_day05;

public class 배열_실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*실습)
		 * 1. 배열저장출력문제    (값 넣고  출력하기)
		   1) 1차원배열 사용하기 -  일주일점심메뉴 또는 단어  
		   2) 1차원배열 사용하기 -  예상 로또번호  저장하고 출력하기
		   3) 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
		   4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
		   5) 3차원배열 사용하기
		 * 
		 */
		
		//1차원
		String[] camera = new String[] {"Casio", "Canon", "Sony", "Kodak", "Fujifilm", "Samsung", "Nikon"};  
		
		for(int i=0; i<camera.length; i++) {
			System.out.println(camera[i]);
		}
		
		
		//2차원
		String[][] girlgroup = {
				{"S.E.S", "핑클", "베이비복스", "쥬얼리"},
				{"원더걸스", "소녀시대", "카라", "2NE1"},
				{"블랙핑크", "트와이스", "AOA", "레드벨벳"},
				{"에스파", "뉴진스", "아이브", "르세라핌"}
				
		};
		//첫번째 그룹
		System.out.println("1세대 걸그룹");
		System.out.print(girlgroup[0][0]);
		System.out.print(girlgroup[0][1]);
		System.out.print(girlgroup[0][2]);
		System.out.print(girlgroup[0][3]);
				
		//두번째 그룹
		System.out.println("\n2세대 걸그룹");
		System.out.print(girlgroup[1][0]);
		System.out.print(girlgroup[1][1]);
		System.out.print(girlgroup[1][2]);
		System.out.print(girlgroup[1][3]);
				
		//세번째 그룹
		System.out.println("\n3세대 컬그룹");
		System.out.print(girlgroup[2][0]);
		System.out.print(girlgroup[2][1]);
		System.out.print(girlgroup[2][2]);
		System.out.print(girlgroup[2][3]);
				
		//네번째 그룹
		System.out.println("\n4세대 걸그룹");
		System.out.print(girlgroup[3][0]);
		System.out.print(girlgroup[3][1]);
		System.out.print(girlgroup[3][2]);
		System.out.print(girlgroup[3][3]);
						
				
				
		for(int i=0; i<4; i++) {
			System.out.println("\n" + (i+1) + "세대 걸그룹 :");
					
			for(int j=0; j<4; j++) {
				System.out.print(girlgroup[i][j] + " ");
					}
				}
		
		
		System.out.println("넷플릭스 찜리스트"); 
		//3차원배열
		String [][][] list = {
				{
					{"첫사랑 일기", "퍼스트 러브 하츠코이", "도망치는건 부끄럽지만 도움이 된다"}, //일본로맨스드라마
					{"SPEC(스펙)", "언내추럴", "리갈하이"}, //일본범죄드라마
					{"브레이킹 배드", "기묘한 이야기", "쉐임리스"} //해외드라마
				},
				{
					{"친절한 금자씨", "박쥐", "복수는 나의 것", "꿈의 제인"}, //한국영화
					{"헬터 스켈터", "하이앤로우", "물에 빠진 나이프", "호문쿨루스"}, //일본영화
					{"아비정전", "타락천사", "화양연화", "천장지구"} //홍콩영화
				}
				
		};
		System.out.print(list[0][0][0]);
		System.out.print(list[0][0][1]);
		System.out.println(list[0][0][2]);
		
		System.out.print(list[0][1][0]);
		System.out.print(list[0][1][1]);
		System.out.println(list[0][1][2]);
		
		System.out.print(list[0][2][0]);
		System.out.print(list[0][2][1]);
		System.out.println(list[0][2][2]);
		
		//두번째 2차원 배열 출력하기(2번째 면 출력하기)
		
		System.out.print(list[1][0][0]);
		System.out.print(list[1][0][1]);
		System.out.print(list[1][0][2]);
		System.out.println(list[1][0][3]);
		
		System.out.print(list[1][1][0]);
		System.out.print(list[1][1][1]);
		System.out.print(list[1][1][2]);
		System.out.println(list[1][1][3]);
		
		System.out.print(list[1][2][0]);
		System.out.print(list[1][2][1]);
		System.out.print(list[1][2][2]);
		System.out.println(list[1][2][3]);
		
		
	
		for(int k=0; k<list.length; k++) {
			for(int i=0; i<list[k].length; i++) {
				for(int j=0; j<list[k][i].length; j++) {
					System.out.print(list[k][i][j] + " ");
				}
				System.out.println();  
			}
		}
	}

}
