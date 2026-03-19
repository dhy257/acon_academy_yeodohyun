package toString;

//학생성적정보를 만들어내기 위한 틀 작성  (객체를 만들기 위한 틀)
//속성+매서드  => 객체
//매서드      => 객체

//                extends Object 
public class Score {
	String name;
	int kor;
	int eng;
	double avg;

	// 별도로 기본생성자
	public Score() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public Score(String name, int kor, int eng) { // 자식의 생성자는 무조건 부모의 생성자가 호출된다.
		// super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;

		//
		calc();

	}

	private void calc() {
		int total = kor + eng;
		this.avg = total / 2.0;
	}

	@Override
	public String toString() {

		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}

	// toString() 오버라이드

}
