package myarrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] scores = new Score[5];

		scores[0] = new Score("1사람1", 100, 80);
		scores[1] = new Score("2사람2", 70, 85);
		scores[2] = new Score("3사람3", 99, 79);
		scores[3] = new Score("4사람4", 85, 70);
		scores[4] = new Score("5사람5", 80, 89);

		MyArrays.sort(scores, new MyComparatorImp());

		// MyComparator 인터페이스 구현하기
		// 이름있는 클래스 or 익명
		System.out.println("영어점수 오름차순");
		for (Score s : scores) {
			System.out.println(s);
		}

		MyArrays.sort(scores);
		System.out.println("국어점수 오름차순");
		for (Score s : scores) {
			System.out.println(s);
		}
	}

}
