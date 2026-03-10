import java.util.Scanner;

public class 학생변경하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] name = new String[] { "ㅇㅇ", "ㅁㅁ" };
//		// 등록
//		for (int i = 0; i < name.length; i++) {
//			System.out.printf("학생%d이름 입력:", i + 1);
//			name[i] = sc.nextLine();
//		}
//		
		// 조회
		for (int i = 0; i < name.length; i++) {
			System.out.printf("학생%d이름:%s\n", i + 1, name[i]);

		}

		// 변경
		for (int i = 0; i < name.length; i++) {
			System.out.printf("학생%d이름 변경:", i + 1);
			name[i] = sc.nextLine();
		}

		// 조회
		for (int i = 0; i < name.length; i++) {
			System.out.printf("학생%d이름:%s\n", i + 1, name[i]);

		}

	}

}
