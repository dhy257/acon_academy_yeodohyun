package 선택정렬;

import java.util.Arrays;

public class Arrays라이브러리사용하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score[] scores = new Score[5];

		scores[0] = new Score("1사람1", 100, 80);
		scores[1] = new Score("2사람2", 70, 85);
		scores[2] = new Score("3사람3", 99, 79);
		scores[3] = new Score("4사람4", 85, 70);
		scores[4] = new Score("5사람5", 80, 89);

		for (Score s : scores) {
			System.out.println(s);
		}

		// Comperator c => 인터페이스
		Arrays.sort(scores, new ComparatorImp());
	}

}
