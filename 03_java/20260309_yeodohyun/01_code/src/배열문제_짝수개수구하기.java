import java.util.Scanner;

public class 배열문제_짝수개수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 5개의 숫자를 입력받아서(배열사용)
		// 숫자 중 짝수의 개수 구하는 코드

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
//		foods[0] = "마카롱";
//		System.out.println(foods[0]);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("번호 %d 입력:", i + 1);
			nums[i] = sc.nextInt();
//			System.out.println(foods[i]);
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("짝수 %d 출력:", cnt + 1);
				System.out.println(nums[i]);
				cnt++;
			}

		}
		System.out.printf("짝수 개수: %d", cnt);

	}

}
