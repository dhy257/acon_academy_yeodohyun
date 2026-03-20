package 라이브러리;

public class MyUtil여도현 {

	public void star() {
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void printChar(String str) {
		for (int i = 0; i < 3; i++) {
			System.out.println(str);
		}
		System.out.println();
	}

	public void printCode(Runnable r) {
		for (int i = 0; i < 3; i++) {
			r.run();
		}
	}
}
