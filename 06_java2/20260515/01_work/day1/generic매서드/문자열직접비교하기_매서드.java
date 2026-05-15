package day1.generic매서드;

public class 문자열직접비교하기_매서드 {

	public static void main(String[] args) {

		char[] fruit = { 'o', 'r', 'a', 'n', 'g', 'e' };
		char[] fruit2 = { 'o', 'r', 'a', 'k', 'g', 'e' };

		// 두 개의 문자열이 같은가?

		extracted(fruit, fruit2);

	}

	private static boolean extracted(char[] fruit, char[] fruit2) {

		if (fruit.length != fruit2.length) {
			return false;
		}
		
		//같으면
		boolean r = true;
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != fruit2[i]) {
				r = false;
				break;
			}
		}

		//

		System.out.println(r);
		return r;
	}

}
