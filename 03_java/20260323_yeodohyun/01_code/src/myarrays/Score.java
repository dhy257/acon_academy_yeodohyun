package myarrays;

public class Score implements MyComparable {

	String name;
	int kor;
	int eng;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		Score s = (Score) other;

		return this.kor - s.kor;
	}

}
