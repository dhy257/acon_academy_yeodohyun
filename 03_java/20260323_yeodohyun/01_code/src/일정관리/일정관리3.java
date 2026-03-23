package 일정관리;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리3 {
	ArrayList<Day> days;
//	Scanner sc = new Scanner(System.in);
	Scanner sc;

	public 일정관리3() {
		// TODO Auto-generated constructor stub
		days = new ArrayList<Day>();
		sc = new Scanner(System.in);
	}

	// 등록
	public void register() {
		System.out.println("일정 등록, 일정 이름, 일정 시간");
		String tempName = sc.nextLine();
		String tempTime = sc.nextLine();

		Day day = new Day(tempName, tempTime);
		days.add(day);
	}

	// 조회
	public void findAll() {
		System.out.println("조회");
		for (int i = 0; i < days.size(); i++) {
			Day day = days.get(i);
			System.out.println((i + 1) + ". " + day);
		}

	}

	// 변경
	public void update() {

		findAll();
		System.out.println("변경할 번호 선택");
		int index = sc.nextInt() - 1;
		sc.nextLine();

		System.out.println("변경할 내용, 시간 입력");
		String tempName = sc.nextLine();
		String tempTime = sc.nextLine();
		Day day = days.get(index);
		day.setName(tempName);
		day.setTime(tempTime);
		System.out.println("변경 완료");
	}

	// 삭제
	public void delete() {
		findAll();
		System.out.println("삭제할 번호 선택");
		int index = sc.nextInt() - 1;
		days.remove(index);
		System.out.println("삭제 완료");
	}

	// 메뉴 반복 -- 시작점
	public void run() {
		loop: while (true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				findAll();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴x");

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		일정관리3 mgt = new 일정관리3();
		mgt.run();
	}
}
