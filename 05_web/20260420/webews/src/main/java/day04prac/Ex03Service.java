package day04prac;

public class Ex03Service {
	// 학생성적 가져오기
	public Score getScore() {
		
		Score score = new Score("홍길동", 100, 90, 100);
		return score;
	}
	
	public static void main(String[] args) {
		Ex03Service e = new Ex03Service();
		Score s = e.getScore();
		
		System.out.println(e.toString());
		
		System.out.println(s.getEng());
	}
}
