
public class 스낵정보만들고출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Snack snack = new Snack();

		// 값 넣기
//		snack.name="맛동산";
//		snack.company="해태";
//		snack.calories="510";
//		snack.gram=2000;
		input(snack); // call by reference
		// 출력
//		System.out.println(snack.name);
//		System.out.println(snack.company);
//		System.out.println(snack.calories);
//		System.out.println(snack.gram);

		print(snack);
	}

	public static void input(Snack snack) {
		snack.name = "맛동산";
		snack.company = "해태";
		snack.calories = "510";
		snack.gram = 2000;
	}

	public static void print(Snack snack) {
		System.out.println(snack.name);
		System.out.println(snack.company);
		System.out.println(snack.calories);
		System.out.println(snack.gram);
	}

}
