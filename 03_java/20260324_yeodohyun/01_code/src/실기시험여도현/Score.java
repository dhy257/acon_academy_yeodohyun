package 실기시험여도현;

public class Score {
	String name;
	int kor;
	int eng;
	char grade;

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void calcGrade() {
		int avg = (kor + eng) / 2;

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else
			grade = 'F';
	}

	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + grade;
	}
}
