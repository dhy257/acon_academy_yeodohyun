package day1prac.제네릭클래스;

public class Score {
	String name;
	int kor;
	int eng;

	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public Score(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + "]";
	}

}
