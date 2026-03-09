package Day0309;

import java.util.Scanner;

public class 실습3차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원배열 만들고 초기화하기
				String[][][] teams = {
						{
							{"손영석", "황스일", "장해든", "이현겸"},
							{"이용찬", "박세인", "김태준", "고지연"},
							{"정철진", "엄진희", "김민경", "여도현"},
							{"이정하", "나해수", "조아진", "장윤성"},
							{"송주창", "김민정", "김재민", "김건희"}
						},
						{
							{"피시방", "용용", "행복", "음식"},
							{"반팔티", "티셔츠", "가구", "여행"},
							{"먹성", "좋아요", "하트", "삼겹살"},
							{"미국", "한국", "일본", "태국"},
							{"주식", "미주", "떡상", "떡락"}
						}
				};
				
				//teams2
				
				Scanner sc = new Scanner(System.in);
				System.out.println("면, 행, 열을 입력해주세요");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println(teams[a][b][c]);
				for(int i = 0; i<teams.length; i++) {
					for(int j = 0; j<teams[i].length;j++) {
						for(int d = 0; d<teams[i][j].length; d++) {
						if(i == a && j == b && d == c){
						System.out.print(teams[i][j][c]);
						}
						}
					}
					System.out.println();
				}
				
				
	}

}
