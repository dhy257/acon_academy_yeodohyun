package 선택정렬;

public class Score정렬하기 {

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

		// 정렬하기

		for (int i = 0; i < scores.length - 1; i++) { // 기준
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i].kor > scores[j].kor) {
					Score tmp;
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		System.out.println("국어점수 오름차순으로 정렬 후");
		for (Score s : scores) {
			System.out.println(s);
		}
		
		for (int i = 0; i < scores.length - 1; i++) { // 기준
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i].eng > scores[j].eng) {
					Score tmp;
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		System.out.println("영어점수 오름차순으로 정렬 후");
		for (Score s : scores) {
			System.out.println(s);
		}
	}

}
