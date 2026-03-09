
public class 배열기본문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2.  기본배열문제
//		  이번주 날씨 정보가 배열로 제공되었다
//		  int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
//
//
//		1) 이번주 날씨정보를 출력하시오
//		2) 평균온도를 구하시오
//		3) 35도가 넘는 날의 횟수를 구하시오
//		4) 가장 높은 온도를 구하시오

		int[] Temperatures = { 33, 35, 32, 35, 36, 35, 34 };
		int sumTem = 0;
		int cnt = 0;
		int maxTem = Temperatures[0];
		double avgTem;
		String[] Day = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		// 1) 이번주 날씨정보를 출력하시오
		for (int i = 0; i < Temperatures.length; i++) {
			System.out.printf("이번 주 온도(%s): %d \n", Day[i], Temperatures[i]);
			sumTem += Temperatures[i];

			if (Temperatures[i] > 35) {
				cnt++;
			}
			maxTem = Math.max(maxTem, Temperatures[i]);

		}

		// 2) 평균온도를 구하시오
		avgTem = (double) sumTem / Temperatures.length;
		System.out.printf("평균 온도는 %.2f도\n", avgTem);

		// 3) 35도가 넘는 날의 횟수를 구하시오
		System.out.printf("일주일동안 %d일 동안 35도를 넘었습니다\n", cnt);

		// 4) 가장 높은 온도를 구하시오
		System.out.printf("가장 높은 온도는 %d였습니다", maxTem);
	}

}
