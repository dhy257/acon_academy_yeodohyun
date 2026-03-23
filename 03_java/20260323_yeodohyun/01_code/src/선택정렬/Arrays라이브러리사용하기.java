package 선택정렬;

import java.util.Arrays;

public class Arrays라이브러리사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score[] scores = new Score[5];

		scores[0] = new Score("1사람1", 100, 80);
		scores[1] = new Score("2사람2", 70, 85);
		scores[2] = new Score("3사람3", 99, 79);
		scores[3] = new Score("4사람4", 85, 70);
		scores[4] = new Score("5사람5", 80, 89);

		Arrays.sort(scores); 
		// java.lang.ClassCastException
		// class 선택정렬.Score cannot be cast to class java.lang.Comparable
		// Score와 Comparable 사이가 상속관계가 아니다 라는 뜻
		// Score는 아무것도 상속 안받음
		
		
		// 객체의 요소가 Comparable을 구현해야한다.
		// 즉 정렬의 기준을 책임져야 함

		for (Score s : scores) {
			System.out.println(s);
		}
	}

}
