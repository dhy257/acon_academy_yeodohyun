package day3.stream추가;

public class Acorn {
	
	String name;
	int  kor;
	int eng;
	int math;
	
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Acorn(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	

}
