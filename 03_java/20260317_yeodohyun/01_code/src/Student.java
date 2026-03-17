
public class Student {
	// 속성
	String name;
	int kor;
	int eng;
	double avg;
	char grade;

	// 매서드
	// 입력 => 생성자
	// 객체의 정보를 제공 => String toString()

	// 생성자를 클래스내에서 만들면 기본생성자(매개변수 없는 생성자)는 제공되지 않는다.
	// 필요하면 기본생성자 만들어야 함
	// 기본생성자
	public Student() {

	}

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public String toString() {
		return this.name + " " + this.kor + " " + this.eng + " " + this.avg + " " + this.grade;
	}

	// 매서드를 통해서 학생성적 정보를 다뤄야 함
	// 평균 구하기
	public void calcAvg() {
		int total = this.kor + this.eng;
		this.avg = total / 2.0;
	}

	// 학점 구하기
	public void calcGrade() {
		if (this.avg >= 90) {
			this.grade = 'A';
		} else if (this.avg >= 80) {
			this.grade = 'B';
		} else if (this.avg >= 70) {
			this.grade = 'C';
		} else {
			this.grade = 'F';
		}
	}
}
