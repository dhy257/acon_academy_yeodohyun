package javaprj.day07;

import java.util.Scanner;

public class 함수만들고공유하기_이현겸 {
	
	/*
	 * 기능: T식 응원, F식 응원
	 * 입력: 숫자(int)
	 * 반환: 응원 메시지
	 */
	public static String 응원메시지출력(int num) {
		String[][] messages = {
				{
					"운동 많이 되네요~!~!~!",
					"너보다 잘하는 사람 널렸다~!~!~!",
					"그냥 평생 쉬어라~~!!",
					"이것도 못하면 직장은 첫 날 점심 먹고 퇴사 할 거냐~!~!",
					"개못하네~!!!!"
				},
				{
					"아주 잘 하고 있어요~~!!! ^^",
					"너무 좋아요 그대로만 하면 돼요!!!!",
					"화이팅 오늘도 화이팅~!!!!!",
					"우와 정말 멋있어요!!!!!"
				}
		};
		int randNum = (int)(Math.random() * 5);
		String message = messages[num - 1][randNum];
		return message;
	}
	
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("T식 응원이 필요하시면 1번, F식 응원이 필요하시면 2번. 종료하려면 0번");
			int cheerNum = sc.nextInt();
			
			if(cheerNum == 0) {
				break;
			}else {
			String result = 응원메시지출력(cheerNum);
			System.out.println(result);
			};
		}

	}

}
