package day3.stream만나기2;

public class Score {
	
	String name;
	int classNo;
	int kor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public Score(String name, int classNo, int kor) {
		super();
		this.name = name;
		this.classNo = classNo;
		this.kor = kor;
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", classNo=" + classNo + ", kor=" + kor + "]";
	}
	
	
	
}
