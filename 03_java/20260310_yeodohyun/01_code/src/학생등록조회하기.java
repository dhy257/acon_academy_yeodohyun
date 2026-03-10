import java.util.Scanner;

public class 학생등록조회하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu;
		String[] name = new String[5];

		loop: while (true) {
			System.out.println("1.등록 2.조회 3.종료");
			menu = sc.nextInt();
			sc.nextLine(); // 엔터 제거

			switch (menu) {

			case 1:
				System.out.println("등록");
				for (int i = 0; i < name.length; i++) {
					System.out.printf("학생%d 이름 입력: ", i + 1);
					name[i] = sc.nextLine();
				}
				break;

			case 2:
				System.out.println("조회");
				for (int i = 0; i < name.length; i++) {
					System.out.printf("학생%d 이름: %s\n", i + 1, name[i]);
				}
				break;

			case 3:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("메뉴가 아닙니다.");
			}
		}

		sc.close();
	}
}