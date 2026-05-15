package day1.sort.myarrays;

public class Score2  implements MyComparableG<Score2>  {
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
	public Score2(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}
	
	public Score2() {
		 
	}
	
	 
 
	@Override
	public int compareTo(Score2 other) {
		// TODO Auto-generated method stub
		return  this.kor - other.kor;
	}
	 
	 
	  
	 

}
