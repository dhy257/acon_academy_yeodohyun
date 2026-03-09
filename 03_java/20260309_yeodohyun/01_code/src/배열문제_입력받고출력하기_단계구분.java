import java.util.Scanner;

public class 배열문제_입력받고출력하기_단계구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 좋아하는 음식 5개 입력받아 출력
		// 입력
		// 출력의 단계를 구분해서 실행

		Scanner sc = new Scanner(System.in);
		String[] foods = new String[5];
//		foods[0] = "마카롱";
//		System.out.println(foods[0]);
		for (int i = 0; i < foods.length; i++) {
			System.out.printf("음식 %d 입력:",i+1);
			foods[i] = sc.nextLine();
//			System.out.println(foods[i]);
		}
		sc.close();
		System.out.println("음식 5개 출력:");
		for (int i = 0; i < foods.length; i++) {
//			foods[i] = sc.next();
			System.out.println(foods[i]);
		}

	}

}
