package myarrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 80);
		scores[1] = new Score("송주창", 70, 85);
		scores[2] = new Score("손영석", 99, 79);
		scores[3] = new Score("나해수", 85, 70);
		scores[4] = new Score("김건희", 88, 89);

		MyArrays.sort(scores, new MyComparatorImp());

		// MyComparator 인터페이스 구현하기
		// 이름있는 클래스
		// 익명클래스

		System.out.println("\n  정렬후"); // 영어점수 오름차순
		for (Score s : scores) {
			System.out.println(s.toString());
		}

		MyArrays.sort(scores); // 국어점순 오름차순

		System.out.println("\n  정렬후");
		for (Score s : scores) {
			System.out.println(s.toString());
		}
	}

}
