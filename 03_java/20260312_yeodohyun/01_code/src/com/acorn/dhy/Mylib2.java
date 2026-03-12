package com.acorn.dhy;

public class Mylib2 {

	public static void printWeather(String[][] weather) {
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

		for (int i = 0; i < week.length; i++) {
			for (int j = 0; j < week[i].length; j++) {

				int r = (int) (Math.random() * 4); // 0~3 랜덤
				week[i][j] = types[r];

			}
		}

		return week;
	}
}
