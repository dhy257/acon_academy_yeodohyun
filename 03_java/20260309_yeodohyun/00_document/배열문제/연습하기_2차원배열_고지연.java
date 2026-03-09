package javaprj.day05;

public class 연습하기_2차원배열_고지연 {

	public static void main(String[] args) {
		
		//   4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
		
		String [][] englishwords = {
					{"person","life","job","country","earth"},
					{"problem","way","language","story","lot"},
					{"name","hand","place","practice","work"},
					{"use","kind","fun","future","have"}
		
		};
		System.out.println("영어단어 월요일");
		System.out.print(englishwords[0][0]+" ");
		System.out.print(englishwords[0][1]+" ");
		System.out.print(englishwords[0][2]+" ");
		System.out.print(englishwords[0][3]+" ");
		System.out.println(englishwords[0][4]);
		
		System.out.println("영어단어 화요일");
		System.out.print(englishwords[1][0]+" ");
		System.out.print(englishwords[1][1]+" ");
		System.out.print(englishwords[1][2]+" ");
		System.out.print(englishwords[1][3]+" ");
		System.out.println(englishwords[1][4]);
		
		System.out.println("영어단어 수요일");
		System.out.print(englishwords[2][0]+" ");
		System.out.print(englishwords[2][1]+" ");
		System.out.print(englishwords[2][2]+" ");
		System.out.print(englishwords[2][3]+" ");
		System.out.println(englishwords[2][4]);
		
		System.out.println("영어단어 목요일");
		System.out.print(englishwords[3][0]+" ");
		System.out.print(englishwords[3][1]+" ");
		System.out.print(englishwords[3][2]+" ");
		System.out.print(englishwords[3][3]+" ");
		System.out.println(englishwords[3][4]);
		
		System.out.println("영어단어 일주일");
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(englishwords[i][j]+" ");
			}
			System.out.println();
		}

		

	}

}
