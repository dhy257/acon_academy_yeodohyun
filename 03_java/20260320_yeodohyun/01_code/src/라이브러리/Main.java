package 라이브러리;

public class Main {
	public static void main(String[] args) {
		MyUtil여도현 util = new MyUtil여도현();

		// 1
		util.star();

		// 2
		util.printChar("★");

		// 3
		util.printCode(() -> {
			System.out.println("코드 실행!");
		});
	}
}