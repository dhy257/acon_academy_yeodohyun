package 배열실습문제;

import java.util.Scanner;

public class 배열실습문제2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] day = new String[5];
		int code;
		loop: while (true) {
			System.out.println("=================================");
			System.out.println("1.일정등록 2.일정 조회 3.일정 수정 4.종료");
			System.out.println("=================================");
			code = sc.nextInt();
			sc.nextLine();
			int index;
			switch (code) {
			case 1:
				System.out.println("일정 등록");
				for (int i = 0; i < day.length; i++) {
					day[i] = sc.nextLine();
				}
				break;
			case 2:
				System.out.println("일정 조회");
				for (int i = 0; i < day.length; i++) {
					System.out.println((i + 1) + " : " + day[i]);
				}
				break;
			case 3:
				System.out.println("일정 수정");
				// 변경
				System.out.println("변경할 일정(n):");
				index = sc.nextInt() - 1;
				System.out.println("변경내용:");
				day[index] = sc.next();
				break;
			case 4:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴에 없습니다.");
				break;
			}
		}

		//
	}

}
