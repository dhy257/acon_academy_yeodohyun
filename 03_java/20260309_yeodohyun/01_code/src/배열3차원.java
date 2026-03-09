
public class 배열3차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] 배열2차원 = {

				{
						//
						{ "*1", "*2", "*3" }, //
						{ "*4", "*5", "*6" }, //
						{ "*7", "*8", "*9" },//
				},

				{
						//
						{ "@1", "@2", "@3" }, //
						{ "@4", "*@5", "@6" }, //
						{ "@7", "@8", "@9" },//
				} };

//		System.out.println(배열2차원[0][0][0]);

		for (int i = 0; i < 배열2차원.length; i++) {
			for (int j = 0; j < 배열2차원[i].length; j++) {
				for (int k = 0; k < 배열2차원[i][j].length; k++) {
					System.out.print(배열2차원[i][j][k]);
				}
				System.out.println();
			}
		}

	}

}
