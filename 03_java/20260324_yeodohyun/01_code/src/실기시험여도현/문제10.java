package 실기시험여도현;

public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s1 = new Score("이학생", 90, 90);
		Score s2 = new Score("김학생", 80, 82);
		Score s3 = new Score("전학생", 60, 70);
		s1.calcGrade();
		s2.calcGrade();
		s3.calcGrade();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
