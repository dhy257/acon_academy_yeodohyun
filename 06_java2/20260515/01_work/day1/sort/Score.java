package day1.sort;

public class Score  implements Comparable<Score>{
	
	String name;
	int kor;
	
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}

	 

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

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return  this.kor - o.kor;
	}	
	
	
	
	

}
