package 배열실습문제;

import java.util.Scanner;

public class 배열실습문제2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[][] schedule = new String[7][5];
		int code;
		loop: while (true) {
			System.out.println("=================================");
			System.out.println("1.일정등록 2.일정 조회 3.일정 수정 4.종료");
			System.out.println("=================================");
			code = sc.nextInt();
			sc.nextLine();
			int index_day, index;
			switch (code) {
			case 1:
				System.out.println("일정 등록");
				for (int i = 0; i < schedule.length; i++) {
					System.out.println((i + 1) + "일차 일정 입력");
					for (int j = 0; j < schedule[i].length; j++) {
						System.out.print((j + 1) + "번째 일정: ");
						schedule[i][j] = sc.nextLine();
					}
				}

				break;
			case 2:
				System.out.println("일정 조회");
				for (int i = 0; i < schedule.length; i++) {
					System.out.println((i + 1) + "일차 일정 입력");
					for (int j = 0; j < schedule[i].length; j++) {
						System.out.print((j + 1) + "번째 일정: ");
						System.out.println(schedule[i][j]);

					}
				}
				break;
			case 3:
				System.out.println("일정 수정");
				// 변경
				System.out.println("변경할 일정(n일차):");
				index_day = sc.nextInt() - 1;
				System.out.println("변경할 일정(n번째):");
				index = sc.nextInt() - 1;

				System.out.println("변경내용:");
				schedule[index_day][index] = sc.next();
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
