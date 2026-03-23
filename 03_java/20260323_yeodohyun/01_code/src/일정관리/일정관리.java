package 일정관리;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Day> days = new ArrayList<Day>();
		loop: while (true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("일정 등록, 일정 이름, 일정 시간");
				String tempName = sc.nextLine();
				String tempTime = sc.nextLine();
				Day tempDay = new Day(tempName, tempTime);
				days.add(tempDay);
				break;
			case 2:
				System.out.println("조회");
				for (int i = 0; i < days.size(); i++) {
					System.out.println(days.get(i));
				}
				break;
			case 3:
				for (int i = 0; i < days.size(); i++) {
					System.out.println((i + 1) + ". " + days.get(i));
				}
				System.out.println("변경 할 번호를  선택하세요");
				int updateIndex = sc.nextInt() - 1;
				sc.nextLine();
				System.out.println("변경 할 일정, 일정 이름, 일정 시간");
				String updateName = sc.nextLine();
				String updateTime = sc.nextLine();

				Day updateDay = days.get(updateIndex);

				updateDay.setName(updateName);
				updateDay.setTime(updateTime);

				System.out.println("변경 완료");
				break;
			case 4:
				for (int i = 0; i < days.size(); i++) {
					System.out.println((i + 1) + ". " + days.get(i));
				}
				System.out.println("삭제 할 번호를  선택하세요");
				int deleteIndex = sc.nextInt() - 1;
				days.remove(deleteIndex);

				System.out.println("삭제완료");
				break;
			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("메뉴x");
				break;
			}
		}
	}

}
