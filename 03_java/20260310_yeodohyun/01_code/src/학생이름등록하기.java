import java.util.Scanner;

public class 학생이름등록하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 5명 저장할 배열 준비
		String[] name = new String[5];
//		int index = 0; // 배열 인덱스 보기 용(안써도됨)

		// 등록
		for (int i = 0; i < name.length; i++) {
			System.out.printf("학생%d이름 입력:", i + 1);
			name[i] = sc.nextLine();
//			index++;
		}

		// 조회
		for (int i = 0; i < name.length; i++) {
//			for (int i = 0; i < index; i++) {
			System.out.printf("학생%d이름:%s\n", i + 1, name[i]);

		}

		//
	}

}
