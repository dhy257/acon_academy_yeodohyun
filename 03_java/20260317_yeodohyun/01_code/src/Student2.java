
public class Student2 {
	// 속성
	String name;
	int kor;
	int eng;
	double avg;
	char grade;

	// 생성자 => 변수(객체)의 초기화 담당
	// 기본생성자
	public Student2() {

	}

	public Student2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// toString(): 현재 객체의 정보를 하나의 문자열로 제공
	public String toString() {
		return this.name + " " + this.kor + " " + this.eng + " " + this.avg + " " + this.grade;
	}

	// getter(속성 값 반환): 작성법: get속성명 get+ 속성명 첫글자대문자 규칙 >> getName, getKor, getEng...
	// setter(속성 값 변경): 작성법: set속성명 set+ 속성명 첫글자대문자 규칙 >> setName, setKor, setEng...

	public String getName() {
		return this.name;
	}

	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public double getAvg() {
		return this.avg;
	}

	public char getGrade() {
		return this.grade;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setGrade(char grade) {
		this.grade = grade;
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