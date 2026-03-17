
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s; // Student type의 변수(객체)의 정보를 저장할 참조형변수 선언
		s = new Student("홍길동", 100, 90); //

//		Student s2 = new Student();

		System.out.println(s.toString());
//		System.out.println(s2.toString());

//		s.avg = (s.eng + s.kor) / 2.0; // 객지가 아님
		s.calcAvg();
		s.calcGrade();
		
		System.out.println(s.toString());
	}

}
