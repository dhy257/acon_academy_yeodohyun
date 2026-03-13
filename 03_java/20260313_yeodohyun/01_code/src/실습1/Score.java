package 실습1;

public class Score {

	String name;
	int kor;
	int eng;
	int avg;

	// 입력
	public void inputScore(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor + eng) / 2; // 평균 계산
	}

	// 출력
	public void printScore() {
		System.out.println("학생이름: " + this.name);
		System.out.println("국어: " + this.kor);
		System.out.println("영어: " + this.eng);
		System.out.println("평균: " + this.avg);
	}

}
