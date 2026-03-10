import java.util.Scanner;

public class 학생등록조회변경삭제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int menu;
		int index;
		String[] name = new String[5];

		loop: while (true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
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
				System.out.println("변경");
				// 변경
				System.out.println("변경할 학생(n):");
				index = sc.nextInt() - 1;
				System.out.println("변경할 이름:");
				name[index] = sc.next();
				break;

			case 4:
				System.out.println("삭제");
				System.out.println("삭제할 학생(n):");
				index = sc.nextInt() - 1;

				// 삭제 (뒤에 있는 값을 앞으로 당김)
				for (int i = index; i < name.length - 1; i++) {
					name[i] = name[i + 1];
				}

				// 마지막 값 비우기
				name[name.length - 1] = null;
				break;

			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("메뉴가 아닙니다.");
			}
		}

		sc.close();
	}

}
