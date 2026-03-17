package 변수종류_초기화;

public class 클래스변수활용 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acorn acorn = new Acorn("딸기","1234","나해수"); // "우주연", 0=>1
		Acorn acorn2 = new Acorn("포도","9090","정해든"); // "우주연", 0=>1
		Acorn acorn3 = new Acorn("사과","3434","고지연"); // "우주연", 0=>1
		
		/*
		 * 인스턴스변수로 추가된다면? => 각 객체마다 생성됨 => 내가 원하는 객체의 수를 카운트 하지 못함
		 * teacher
		 * cnt
		 * */
		
		// teacher, cnt 는 클래스에서 한 개를 만들어 사용해야 한다.
		
		// 에이콘 학생의 teacher정보 유지하고 싶다!
		// 에이콘 객체의 수를 카운트 하고 싶다면
	}
}
