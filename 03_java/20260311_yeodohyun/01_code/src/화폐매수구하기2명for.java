import java.util.Scanner;

public class 화폐매수구하기2명for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8개를 가진 1차원 배열 2개
		Scanner sc = new Scanner(System.in);
		int money;
		int[][] 화폐매수배열 = new int[2][8];
		int[] 화폐단위 = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int i = 0; i < 화폐매수배열.length; i++) {
			// 반복 한사람 => 화폐매수 8개 구하기
			System.out.println("돈입력:");
			money = sc.nextInt();
			for (int j = 0; j < 화폐단위.length; j++) {
				화폐매수배열[i][j] = money / 화폐단위[j];
				money %= 화폐단위[j];
				System.out.printf("%d = %d\n",화폐단위[i],(화폐매수배열[i][j]));
			}
			System.out.println();
		}
	}

}
