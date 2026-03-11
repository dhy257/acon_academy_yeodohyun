package 함수문제2;

import java.util.Random;

public class 함수문제2_여도현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)

		weather();
	}

	public static void weather() {
		Random r = new Random();
		int random_num = r.nextInt(100) + 1;

		if (random_num >= 90) {
			System.out.println("맑음");
		} else if (random_num >= 80 && random_num < 90) {
			System.out.println("흐림");
		} else if (random_num >= 70 && random_num < 80) {
			System.out.println("비옴");
		} else {
			System.out.println("눈옴");
		}
	}
}
