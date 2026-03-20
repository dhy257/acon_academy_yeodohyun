package 라이브러리;

public class Teacher라이브러리사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyUtilTeacher lib = new MyUtilTeacher();

		lib.별출력하기();
		lib.print("**");

		lib.runThreeTimes(new 여도현Imp());
		// TeacherCodeRun라는 인터페이스를 구현한 익명클래스를 작성하는 코드
		lib.runThreeTimes(new TeacherCodeRun() {

			@Override
			public void codeRun() {
				// TODO Auto-generated method stub
				// 원하는 코드 입력
			}
		});
	}

}
