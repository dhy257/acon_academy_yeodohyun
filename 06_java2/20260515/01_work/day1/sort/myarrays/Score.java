package day1.sort.myarrays;

public class Score  implements MyComparable {
	int kor;
	int eng;
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
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}
	public Score(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}
	
	public Score() {
		 
	}
	
	 
	@Override
	public int compareTo(Object other) {
		 Score s  = (Score)other;		
		
		 return  this.kor - s.kor;
	}
	 
	 
	  
	 

}
