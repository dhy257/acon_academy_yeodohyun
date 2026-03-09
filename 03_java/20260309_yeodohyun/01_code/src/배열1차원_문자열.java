
public class 배열1차원_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] movie = new String[5];
		movie[0] = "기생충";
		movie[1] = "추격자";
		movie[2] = "왕과 사는 남자";
		movie[3] = "왕의 남자";
		movie[4] = "살인의 추억";

//		movie[5]="새로운 영화"; // 배열은 반드시 선언한 만큼 사용해야함
		// 에러: 배열의 범위 벗어나면 안됨

		System.out.println(movie[0]);

		// 배열명[인덱스]
		String[] strs = new String[] { "기생충", "추격자", "왕과 사는 남자", "왕의 남자", "살인의 추억" };

		String[] strs2 = { "기생충", "추격자", "왕과 사는 남자", "왕의 남자", "살인의 추억" };

	}

}
