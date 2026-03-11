package javaprj.day07;

import java.util.Arrays;

public class 함수만들기_me3 {

	/*
	 * 기능 : 이세계생존법알려주기
	 * 입력 : x
	 * 반환 : o
	 */
	
	public static String[] 이세계생존법알려주기() {
		String[] tips = {
				  "마을 NPC와 친해지기",
			      "초반에는 숲에서 약초 모으기",
			      "슬라임부터 잡아서 레벨업하기",
			      "마법사 길드 가입하기",
			      "던전은 파티를 만들어 들어가기"
		};
		return tips;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] result = 이세계생존법알려주기();
		
		System.out.println(Arrays.toString(result));
 	}

}
