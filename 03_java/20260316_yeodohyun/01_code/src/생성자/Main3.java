package 생성자;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자를 통해 변수(객체)의 값의 초기화 담당
		AcornStudent2 s = new AcornStudent2(); // 기본 생성자
		s.정보출력하기();
		AcornStudent2 s2 = new AcornStudent2("사람이름1",500,30,50,100);
		s2.정보출력하기();
		AcornStudent2 s3 = new AcornStudent2("사람이름2",500);
		s3.정보출력하기();
	}

}
