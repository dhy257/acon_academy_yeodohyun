package Javaprj.day05;

public class 배열실습 {

	public static void main(String[] args) {
		
		
		//1차원배열
		String[] str = {"아디다스","나이키","아식스","살로몬","베이프"};
		
		System.out.println("1차원배열");
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		
		
		//예상로또번호
		int [] lotto = {12, 17, 23, 31, 36, 38};
		
		System.out.println("\n예상로또번호");
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		//음식 5개 저장하고 출력하기
		String[] food = new String[5];
		
		food[0] = "고기";
		food[1] = "회";
		food[2] = "떡볶이";
		food[3] = "초밥";
		food[4] = "햄버거";
		
		System.out.println("\n음식 5개 저장 후 출력");
		
		System.out.print(food[0] + " ");
		System.out.print(food[1] + " ");
		System.out.print(food[2] + " ");
		System.out.print(food[3] + " ");
		System.out.print(food[4]);
		
		System.out.println();
		
		
 		//2차원배열
		String[][] strr = {
				{"류현진","문동주","김서현","코디폰세"},
				{"노시환","하주석","문현빈","김인환"},
				{"채은성","이진영","변우혁","플로리얼"}
		};
		
		
		
		System.out.println("\n2차원배열");
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(strr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//3차원배열
		String[][][] strrr = {
				{
					{"축구", "야구", "농구","배구"},
					{"배드민턴", "탁구", "테니스", "골프"},
					{"유도", "태권도", "수영", "스키"}		
				}
				,
				{
					{"아디다스","나이키","아식스","푸마"},
					{"살로몬","아이앱","스투시","슈프림"},
					{"산산기어","아크테릭스","사파리스팟","폴로"}
				}
		};
		
		System.out.println("\n3차원배열");
		for(int k=0; k<2; k++) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<4; j++) {
					System.out.print(strrr[k][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
