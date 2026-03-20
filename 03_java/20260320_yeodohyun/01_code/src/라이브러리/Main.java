package 라이브러리;

import 라이브러리.예제.MyUtil_김태준;
import 라이브러리.이현겸.MyUtil_이현겸;
import 라이브러리.이현겸.원하는코드;

public class Main {
	public static void main(String[] args) {
		MyUtil여도현 util = new MyUtil여도현();

		// 1
		util.star();

		// 2
		util.printChar("ddd");

		// 3
//		util.printCode(() -> {
//			System.out.println("코드 실행!");
//		});
		util.printCode(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		});

		MyUtil_이현겸 a = new MyUtil_이현겸();
		a.별세개출력하기();
		a.원하는문자세번출력하기('a');
		a.코드세번실행하기(new 원하는코드());

		MyUtil_김태준 b = new MyUtil_김태준();
		b.a();
	}
}