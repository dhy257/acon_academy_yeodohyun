package 변수과제물;

import java.util.Scanner;

public class 일주일식단표 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 요일 배열
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일"};

		// 음식 배열
		String[] food = {"계란5개", "닭가슴살3개", "삼계탕1마리", "바나나10개", "감자10개"};

		System.out.print("요일을 입력하세요: ");
		String input = sc.nextLine();

		for(int i = 0; i < day.length; i++) {
			if(input.equals(day[i])) {
				System.out.println(input + " 식단은 " + food[i] + " 입니다.");
			}
		}

		sc.close();
	}
}