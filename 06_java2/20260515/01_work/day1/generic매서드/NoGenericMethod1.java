package day1.generic매서드;

public class NoGenericMethod1 {

	public static int 선택하기int(int a, int b) {
		return Math.random() > 0.5 ? a : b;
	}

	public static boolean 선택하기boolean(boolean a, boolean b) {
		return Math.random() > 0.5 ? a : b;
	}

	public static String 선택하기String(String a, String b) {
		return Math.random() > 0.5 ? a : b;
	}

	public static double 선택하기double(double a, double b) {
		return Math.random() > 0.5 ? a : b;
	}

	// 위의 4개를 하나의 매서드로 만들 수 있다 !!
	// 제네릭 매서드 너무 어렵게 생각하지 말자 !!

	public static <T> T 선택하기(T a, T b) { // 0~1미만의 임의의 실수를 반환함
		return Math.random() > 0.5 ? a : b;
	}

	public <T> T 선택하기2(T a, T b) { // 0~1미만의 임의의 실수를 반환함
		return Math.random() > 0.5 ? a : b;
	}

	public static void main(String[] args) {

		int randNum = 선택하기int(7, 9);
		boolean resultBool = 선택하기boolean(true, false);
		String resultStr = 선택하기String("아메리카노", "라떼");
		double resultDbl = 선택하기double(45.12, 50.90);

		System.out.println(randNum);
		System.out.println(resultBool);
		System.out.println(resultStr);
		System.out.println(resultDbl);

		System.out.println("=====================>재네릭매서드");
		String resultg1 = NoGenericMethod1.선택하기("짜장", "짬뽕");
		int resultg2 = NoGenericMethod1.선택하기(7, 9);
		boolean resultg3 = NoGenericMethod1.선택하기(true, false);
		double resultg4 = NoGenericMethod1.선택하기(45.12, 50.90);

		System.out.println(resultg1);
		System.out.println(resultg2);
		System.out.println(resultg3);
		System.out.println(resultg4);

		resultg1 = NoGenericMethod1.<String>선택하기("짜장", "짬뽕");
		resultg2 = NoGenericMethod1.<Integer>선택하기(7, 9);
		resultg3 = NoGenericMethod1.<Boolean>선택하기(true, false);
		resultg4 = NoGenericMethod1.<Double>선택하기(45.12, 50.90);

		System.out.println(resultg1);
		System.out.println(resultg2);
		System.out.println(resultg3);
		System.out.println(resultg4);
		System.out.println("=====================>재네릭매서드   ");

		NoGenericMethod1 m = new NoGenericMethod1();

		resultg1 = m.<String>선택하기2("짜장", "짬뽕");
		resultg2 = m.<Integer>선택하기2(7, 9);
		resultg3 = m.<Boolean>선택하기2(true, false);
		resultg4 = m.<Double>선택하기2(45.12, 50.90);

		System.out.println(resultg1);
		System.out.println(resultg2);
		System.out.println(resultg3);
		System.out.println(resultg4);

	}
}
