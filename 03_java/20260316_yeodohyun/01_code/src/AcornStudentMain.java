
public class AcornStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AcornStudent s1 = new AcornStudent();
		AcornStudent s2 = new AcornStudent();
		AcornStudent s3 = new AcornStudent();

		// 입력
		s1.입력하기("사람1", 1000, 10, 50, 200);
		s2.입력하기("사람2", 2000, 20, 0, 0);
		s3.입력하기("여도현", 1000, 10, 30, 150);
		// 출력
		s1.정보출력하기();
		s2.정보출력하기();

		s1.밥먹기(); // 에너지+100
		s2.밥먹기(); // 에너지+100

		s1.정보출력하기();
		s2.정보출력하기();

//		s.자바능력 = 3999; // private이기때문에 접근 불가( 정해진 방법인 매서드로만 가능)

		s1.배열공부하기(); // 자바능력 += 20;에너지 -= 5;
		s2.배열공부하기(); // 자바능력 += 20;에너지 -= 5;

		s1.정보출력하기();
		s2.정보출력하기();

		//

	}

}
