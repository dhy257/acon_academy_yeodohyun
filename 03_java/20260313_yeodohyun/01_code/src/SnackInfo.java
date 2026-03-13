
public class SnackInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 스낵정보 출력하기
		Snack s = new Snack();
		
//		s.name = "맛동산";
//		s.company="해태";
//		s.calories="500";
//		s.gram=200;
		
		inputSnackInfo(s,"맛동산","해태","500",200);
		printSnackInfo(s);
		
		
	}
	
	// 입력
	public static void inputSnackInfo(Snack s, String name, String company, String calories, int gram) {
		s.name = name;
		s.company=company;
		s.calories=calories;
		s.gram=gram;
	}
	
	// 출력
	public static void printSnackInfo(Snack s) {
		System.out.println(s.name);
		System.out.println(s.company);
		System.out.println(s.calories);
		System.out.println(s.gram);
	}

}
