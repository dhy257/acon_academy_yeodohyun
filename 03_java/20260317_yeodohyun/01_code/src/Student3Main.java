
public class Student3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 s1 = new Student3("홍길동1", 100, 90);
		Student3 s2 = new Student3("홍길동2", 99, 98);
		Student3 s3 = new Student3("홍길동3", 97, 100);

		s1.calcGrade();
		s2.calcGrade();
		s3.calcGrade();

//		System.out.println(s1.toString());
//		System.out.println(s1.getName());
//		System.out.println(s1.getKor());
//		System.out.println(s1.getEng());
//		System.out.println(s1.getAvg());
//		System.out.println(s1.getGrade());
//		//
//		System.out.println(s2.toString());
//		System.out.println(s2.getName());
//		System.out.println(s2.getKor());
//		System.out.println(s2.getEng());
//		System.out.println(s2.getAvg());
//		System.out.println(s2.getGrade());
//		//
//		System.out.println(s3.toString());
//		System.out.println(s3.getName());
//		System.out.println(s3.getKor());
//		System.out.println(s3.getEng());
//		System.out.println(s3.getAvg());
//		System.out.println(s3.getGrade());

		Student3[] list = new Student3[3];
		list[0] = new Student3("1홍길동1", 100, 90);
		list[1] = new Student3("2홍길동2", 99, 98);
		list[2] = new Student3("3홍길동3", 97, 100);
		for (int i = 0; i < list.length; i++) {
			list[i].calcGrade();
		}
		System.out.println("배열출력");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
		}
	}

}
