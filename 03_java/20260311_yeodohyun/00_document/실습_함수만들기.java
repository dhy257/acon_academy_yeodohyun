package javaprj_day07;

import java.util.Arrays;

public class 실습_함수만들기 {

	/*
	 * 기능(함수명): 살 안찌는 습관 제공하기
	 * 입력(매개변수): x
	 * 반환:문장1차원배열
	 */
	public static String[] 습관제공하기() {
		String[] st = 
			{"물 자주 마시기", "밥 먹기 전에 단백질 먼저 먹기",  
			"천천히 먹기", "음료 대신 물", "먹고 바로 눕지 않기", 
			"점심을 가장 든든하게 먹기", "취침 전 스트레칭하기",
			"최소 자기 3시간 전까지만 음식 먹기", "군것질 줄이기",
			"어느정도 배 찼으면 더이상 먹지 않기", "가짜 배고픔에 현혹되지 않기"};
		return st;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] result = 습관제공하기();
		System.out.println(Arrays.toString(result));
	}

}
