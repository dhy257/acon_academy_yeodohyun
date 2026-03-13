
public class Student2 {
	String name;
	int kor;
	int eng;
	int avg;

	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	}

	private void calc() {
		int total = this.kor + this.eng;
		this.avg = total / 2;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.avg);
	}
}
