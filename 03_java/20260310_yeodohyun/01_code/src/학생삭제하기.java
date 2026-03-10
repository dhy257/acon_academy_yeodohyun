import java.util.Scanner;

public class 학생삭제하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] name = new String[] { "ㅇㅇ", "ㅁㅁ", "ㄴㄴ", "ㄷㄷ", "ㅂㅂ" };

		// 전체 조회
		// 조회
		for (int i = 0; i < name.length; i++) {
			System.out.printf("학생%d이름:%s\n", i + 1, name[i]);

		}

		// 삭제할 index 선택
		int index;
		System.out.println("학생 n 삭제 요청:");
		index = sc.nextInt() - 1;

		// 삭제(이름 대신 x 문자열 저장)
		name[index] = "XX";

		// 조회
		for (int i = 0; i < name.length; i++) {
			if (!name[i].equals("XX")) { // XX가 아니면
				System.out.printf("학생%d이름:%s\n", i + 1, name[i]);
			}
			else {
				System.out.println("삭제된 학생");
			}

		}
		
		

		//
	}

}
