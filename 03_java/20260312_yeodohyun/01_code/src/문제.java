
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 90, eng = 80, math = 100;
		// call by value
		// 성적출력
		printScore(kor, eng, math);

		int[] likesNumber = { 1, 3, 11 };
		// call by reference
		// 좋아하는 수 출력
		printLikesNumber(likesNumber);
	}

	public static void printScore(int kor, int eng, int math) {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}

	public static void printLikesNumber(int[] likesNumber) {
		for (int i = 0; i < likesNumber.length; i++) {
			System.out.println(likesNumber[i]);
		}
	}

}
