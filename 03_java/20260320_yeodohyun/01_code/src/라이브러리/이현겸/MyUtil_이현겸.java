package 라이브러리.이현겸;

import java.util.Scanner;

public class MyUtil_이현겸 {

	Scanner sc = new Scanner(System.in);
	
	public void 별세개출력하기() {
		for(int i = 0; i < 3; i++) {
			System.out.print("*");
		}
	}
	
	public void 원하는문자세번출력하기(char arr) {
		for(int i = 0; i < 3; i++) {
			System.out.println(arr);
		}
	}
	
	public void 코드세번실행하기(원하는코드 method) {
		for(int i = 0; i < 3; i++) {
			System.out.println("원하는 단 입력");
			int dan = sc.nextInt();
			method.구구단(dan);
		}
	}
	
}
