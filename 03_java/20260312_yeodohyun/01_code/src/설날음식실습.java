
public class 설날음식실습 {

	public static void main(String[] args) {

		// 만두만들기
		String 음식1 = 만두만들기();

		// 떡국만들기
		String 음식2 = 떡국만들기(음식1);

		// 전만들기
		String 음식3 = 전만들기();

		// 갈비찜 만들기
		String 음식4 = 갈비찜만들기();

		// 상차리기
		/*
		 * System.out.println("설날 상차리기"); System.out.println( 음식1 + 음식2 +음식3 +음식4);
		 */

		상차리기(음식1, 음식2, 음식3, 음식4); // 함수호출시 값을 전달 (인수)

	}

	public static void 상차리기(String a, String b, String c, String d) { // 매개변수로 전달 받음
		System.out.println("******설날 상차리기*****");
		System.out.println(a); //
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	// 만두만들기
	public static String 만두만들기() {

		// 함수에서 만들어지는 변수를 지역변수라고 한다
		// 함수 지역내에서만 사용이 가능하다

		String 음식1; //
		System.out.println("만두만들기1");
		System.out.println("만두만들기2");
		System.out.println("만두만들기3");
		System.out.println("만두만들기4");

		음식1 = "김치만두";

		return 음식1;
	}

	// 떡국만들기
	public static String 떡국만들기(String 음식1) {

		String 음식2;
		System.out.println("떡국 만들기1");
		System.out.println(음식1 + "넣는다");

		음식2 = "떡국";

		return 음식2;

	}

	public static String 전만들기() {
		String 음식3;
		System.out.println("전 만들기1");
		System.out.println("전 만들기2");
		System.out.println("전 만들기3");
		System.out.println("전 만들기4");
		음식3 = "산적";

		return 음식3;
	}

	public static String 갈비찜만들기() {
		String 음식4;
		System.out.println("갈비찜 만들기1");
		System.out.println("갈비찜 만들기2");
		System.out.println("갈비찜 만들기3");
		System.out.println("갈비찜 만들기4");
		System.out.println("갈비찜 만들기5");

		음식4 = "소갈비찜";
		return 음식4;
	}

}
