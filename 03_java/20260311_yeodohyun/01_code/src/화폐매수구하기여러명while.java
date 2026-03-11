import java.util.Scanner;

public class 화폐매수구하기여러명while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int index = 0;
		int money;
		int[][] m화폐매수배열 = new int[3][8];
		int[] m화폐단위 = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		while (true) {
			System.out.println("돈입력:");
			money = sc.nextInt();
			if (money == 0) {
				break;
			}
			// 화폐매수구하기
			else {
				for (int i = 0; i < m화폐매수배열.length; i++) {
					// 반복 한사람 => 화폐매수 8개 구하기
					for (int j = 0; j < m화폐단위.length; j++) {
						m화폐매수배열[i][j] = money / m화폐단위[j];
						money %= m화폐단위[j];
						System.out.printf("%d = %d\n", m화폐단위[i], (m화폐매수배열[i][j]));
					}
					System.out.println();
				}

			}
		}
		sc.close();

	}

}
