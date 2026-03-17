
public class Student2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s = new Student2("홍길동", 100, 90);

		System.out.println(s.toString());
		System.out.println(s.getName());
		System.out.println(s.getKor());
		System.out.println(s.getEng());
		System.out.println(s.getAvg());
		System.out.println(s.getGrade());
		
		// 국어점수 변경
		s.setKor(70);
		s.setEng(98);
		System.out.println(s.toString());
		
		s.calcAvg();
		s.calcGrade();
		System.out.println(s.toString());
	}

}
