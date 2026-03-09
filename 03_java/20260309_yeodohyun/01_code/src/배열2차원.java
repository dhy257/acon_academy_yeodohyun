
public class 배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원배열: 1차원배열의 집합
		// 접근방법:
		// 배열명[행][렬]
		// 배열을 기준으로 몇번째 1차원배열인지 찾기(행찾기)
		// 찾은 1차원 배열에서 몇번째 요소인지 찾는다(열찾기)

		// 2차원배열 만들고 초기화
		String[][] teams = {
				// 0 1 2 3
				{ "손영석", "황스일", "장해든", "이현겸" }, // 0
				{ "이용찬", "박세인", "김태준", "고지연" }, // 1
				{ "정철진", "엄진희", "김민경", "여도현" }, // 2
				{ "이정하", "나해수", "조아진", "장윤성" }, // 3
				{ "송주창", "김민정", "김재민", "김건희" }, // 4
		};

//		System.out.println(teams[2][3]);

//		System.out.println("1-다운캐스팅");
//		System.out.println(teams[0][0]);
//		System.out.println(teams[0][1]);
//		System.out.println(teams[0][2]);
//		System.out.println(teams[0][3]);
//
//		System.out.println("2-this");
//		System.out.println(teams[1][0]);
//		System.out.println(teams[1][1]);
//		System.out.println(teams[1][2]);
//		System.out.println(teams[1][3]);
//
//		System.out.println("3-업캐스팅");
//		System.out.println(teams[2][0]);
//		System.out.println(teams[2][1]);
//		System.out.println(teams[2][2]);
//		System.out.println(teams[2][3]);
//
//		System.out.println("4-오버라이딩");
//		System.out.println(teams[3][0]);
//		System.out.println(teams[3][1]);
//		System.out.println(teams[3][2]);
//		System.out.println(teams[3][3]);

		// 2차원 배열 => 중첩반복 해결
		for (int i = 0; i < 5; i++) {
			System.out.println("\n" + (i + 1) + "조");
			for (int j = 0; j < 4; j++) {
				System.out.println(teams[i][j]);
			}
		}

		// 2차원 배열 만들고 사용
		String[][] teams2 = new String[5][4];
		// String은 기본값 null
		
		teams2[0][0] = "손영석";
		teams2[0][1] = "황스일";
		teams2[0][2] = "장해든";
		teams2[0][3] = "이현겸";
		
		teams2[1][0] = "이용찬";
		teams2[1][1] = "박세인";
		teams2[1][2] = "김태준";
		teams2[1][3] = "고지연";
		
		teams2[2][0] = "정철진";
		teams2[2][1] = "엄진희";
		teams2[2][2] = "김민경";
		teams2[2][3] = "여도현";
		
		teams2[3][0] = "이정하";
		teams2[3][1] = "나해수";
		teams2[3][2] = "조아진";
		teams2[3][3] = "장윤성";
		
		teams2[4][0] = "송주창";
		teams2[4][1] = "김민정";
		teams2[4][2] = "김재민";
		teams2[4][3] = "김건희";
		
		
	}

}
