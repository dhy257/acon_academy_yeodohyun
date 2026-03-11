package 함수문제2;

public class 함수문제3_여도현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 주간날씨정보를  반환하는 함수 만들기

		String[][] weather = week_weather();

		// 출력
		for (int i = 0; i < weather.length; i++) {
			System.out.print((i + 1) + "일차 : ");

			for (int j = 0; j < weather[i].length; j++) {
				System.out.print(weather[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static String[][] week_weather() {

		String[] types = { "맑음", "흐림", "비옴", "눈옴" };

		String[][] week = new String[7][3];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {

				int r = (int) (Math.random() * 4); // 0~3 랜덤
				week[i][j] = types[r];

			}
		}

		return week;
	}
}