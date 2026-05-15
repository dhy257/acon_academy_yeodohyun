package day1.generic클래스;

public class Score {	
	String name;
	int kor;
	int eng;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
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
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	 

}
