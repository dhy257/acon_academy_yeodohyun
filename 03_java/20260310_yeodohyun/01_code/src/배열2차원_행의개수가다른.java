
public class 배열2차원_행의개수가다른 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3*3 차원배열
		int[][] arr = new int[][] {
				//
				{ 1, 2, 3 }, //
				{ 4, 5, 6 }, //
				{ 7, 8, 9 },//
		};
		arr[0][0] = 11;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		//

		// 행의 개수가 다른 2차원 배열 만들기
		// 3행, 각 행의 열 수가 다르게 하기
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3]; // 0행은 3열(첫번째 행)
		arr2[1] = new int[5]; // 1행은 5열(두번째 행)
		arr2[2] = new int[2]; // 2행은 2열(세번째 행)

		// 0행
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		// 1행
		arr2[1][0] = 8;
		arr2[1][1] = 9;
		arr2[1][2] = 10;
		arr2[1][3] = 11;
		arr2[1][4] = 12;
		// 2행
		arr2[2][0] = 13;
		arr2[2][1] = 13;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
