package string;

public class 문자열직접만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'h';
		char b = 'e';
		char c = 'l';
		char d = 'l';
		char e = 'o';

		char[] word = { a, b, c, d, e };

		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
		
		
		printCharArray(word);
		myToString(word);

		String str = "hello^^"; // char[] + 매서드 제공한다

		System.out.println(str); // Object toString => String 클래스내부에서 오버라이드 하고 있다

		char result = str.charAt(5);
		System.out.println(result);

	}

	public static void printCharArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static String myToString(char[] arr) {

		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}

}
