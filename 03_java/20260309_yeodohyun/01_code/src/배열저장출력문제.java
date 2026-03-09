
public class 배열저장출력문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	   실습 )
//	   1. 배열저장출력문제    (값 넣고  출력하기)
//	   1) 1차원배열 사용하기 -  일주일점심메뉴 또는 단어  
//	   2) 1차원배열 사용하기 -  예상 로또번호  저장하고 출력하기
//	   3) 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
//	   4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
//	   5) 3차원배열 사용하기

		// 1) 1차원배열 사용하기 - 일주일점심메뉴 또는 단어
		System.out.print("1) 1차원배열 사용하기 - 일주일점심메뉴 또는 단어");
		String[] lunch = { "김치찌개", "돈까스", "제육볶음", "초밥", "쌀국수", "햄버거", "파스타" };

		for (int i = 0; i < lunch.length; i++) {
			System.out.println((i + 1) + "일차 메뉴: " + lunch[i]);
		}
		System.out.println("\n");

		// 2) 1차원배열 사용하기 - 예상 로또번호 저장하고 출력하기
		System.out.println("2) 1차원배열 사용하기 - 예상 로또번호 저장하고 출력하기");
		int[] lotto = { 10, 15, 19, 27, 30, 33, 14 };
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("\n");

		// 3) 1차원 배열 사용하기 - 좋아하는 음식 5개 저장하고 출력하기
		System.out.println("3) 1차원 배열 사용하기 - 좋아하는 음식 5개 저장하고 출력하기");
		String[] foods = { "김치찌개", "돈까스", "제육볶음", "초밥", "쌀국수" };
		for (String food : foods) {
			System.out.print(food + " ");
		}
		System.out.println("\n");

		// 4) 2차원배열 사용하기 - 한 달 점심메뉴 또는 단어
		System.out.print("4) 2차원배열 사용하기 - 한 달 점심메뉴 또는 단어");
		String[][] months = {
				//
				{ "김치찌개", "돈까스", "제육볶음", "초밥", "쌀국수", "햄버거", "파스타" }, // 0
				{ "김치볶음밥", "비빔밥", "된장찌개", "라면", "카레라이스", "김밥", "부대찌개" }, // 1
				{ "짜장면", "짬뽕", "우동", "초밥", "오므라이스", "삼겹살", "닭갈비" }, // 2
				{ "순두부찌개", "설렁탕", "칼국수", "샌드위치", "토스트", "볶음우동", "낙지덮밥" }, // 3
		};
		for (int i = 0; i < months.length; i++) {
			System.out.println("\n" + (i + 1) + "주");
			for (int j = 0; j < months[i].length; j++) {
				System.out.print(months[i][j] + " ");
			}
		}
		System.out.println("\n");

		// 5) 3차원배열 사용하기
		System.out.print("5) 3차원배열 사용하기");
		String[][][] movie = {
				//한국영화
				{
						//장르별
						{ "살인의 추억", "신세계", "추격자" }, //
						{ "극한직업", "과속스캔들", "7번방의 선물" }, //
						{ "부산행", "터널", "감기" },//
				},
				//외국영화
				{
						//장르별
						{ "Interstellar", "The Matrix", "Blade Runner 2049" }, //
						{ "Se7en", "Shutter Island", "Gone Girl" }, //
						{ "John Wick", "Mad Max: Fury Road", "Gladiator" },//
				} };

		for (int i = 0; i < movie.length; i++) {
			System.out.println("");
			for (int j = 0; j < movie[i].length; j++) {
				for (int k = 0; k < movie[i][j].length; k++) {
					System.out.print(movie[i][j][k] + " ");
				}
				System.out.println("");
			}
		}

		//
	}

}
