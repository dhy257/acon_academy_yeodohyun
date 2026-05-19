package day3prac.collection.stream;

public class Acorn {
	

	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", score=" + score + "]";
	}
	public Acorn(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	//
	//
	//
	//
	
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
}
