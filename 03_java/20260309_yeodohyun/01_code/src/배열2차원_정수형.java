
public class 배열2차원_정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 15;
		int c = 19;
		int d = 27;
		int e = 30;
		int f = 33;

		int[] lotto = { 10, 15, 19, 27, 30, 33 };
//		System.out.println("3월7일");
//		for (int i = 0; i < lotto.length; i++)
//			System.out.print(lotto[i] + " ");

		// 배열의 요소가 1차원 배열
		int[][] lotto2Month = {
				//
				{ 1, 7, 9, 17, 27, 38 }, // 0행
				{ 23, 26, 27, 35, 38, 40 }, // 1행
				{ 5, 8, 25, 31, 41, 44 }, // 2행
				{ 5, 11, 25, 27, 36, 38 }, // 3행
		};
		
		for (int i = 0; i < lotto2Month.length; i++) {
			System.out.println("\n2월" + (i + 1) + "주");
			for (int j = 0; j < lotto2Month[i].length; j++) {
				System.out.print(lotto2Month[i][j]+ " ");
			}
		}

		//

	}

}
