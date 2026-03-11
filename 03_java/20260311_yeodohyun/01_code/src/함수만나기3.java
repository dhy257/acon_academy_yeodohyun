import java.util.Arrays;
import java.util.Scanner;

public class 함수만나기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		word1();
//		System.out.println("몇 주 단어?");
//		String[] weekWord = word3(sc.nextInt());
		String[] weekWord = word3_1(sc);
		System.out.println(Arrays.toString(weekWord));

		sc.close();
	}

	// 기능: 한 달 단어 출력
	// 입력: x
	// 반환: x
	public static void word1() {
		String[][] word = word2();
//		System.out.println(Arrays.toString(word));
		for (int i = 0; i < word.length; i++) {
			System.out.println(i + 1);
			for (int j = 0; j < word[i].length; j++) {
				System.out.print(word[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 기능: 한 달 단어 제공
	// 입력: x
	// 반환: 단어 2차원 배열
	public static String[][] word2() {
		String[][] word = {
				//
				{ "apple", "book", "cat", "dog", "egg" }, //
				{ "fish", "game", "home", "ice", "juice" }, //
				{ "key", "lion", "moon", "name", "orange" }, //
				{ "pen", "queen", "rain", "sun", "tree" }//
		};

		return word;
	}

	// 기능: 한 달 단어 출력
	// 입력: 원하는 주: week int
	// 반환: 단어 1차원 배열
	public static String[] word3(int week) {
		String[][] word = word2();

		// 범위 체크
		if (week < 1 || week > word.length) {
			System.out.printf("1~%d주 사이만 가능합니다.\n", word.length);
			return null;
		}

		String[] word_week = word[week - 1]; // 1주 => index 0
		return word_week;
	}

	// 범위 반복 구현
	public static String[] word3_1(Scanner sc) {
		String[][] word = word2();
		int week;

		while (true) {
			System.out.print("몇 주 단어? ");
			week = sc.nextInt();

			if (week >= 1 && week <= word.length) {
				break;
			}

			System.out.printf("1~%d주 사이만 가능합니다.\n", word.length);
		}

		return word[week - 1];
	}

}
