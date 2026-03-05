package code;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력되는 숫자가 0이면 더한 값을 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		int input;
		int total=0;
		while(true) {
			input = sc.nextInt();
			if(input==0) break;
			total+=input;
		}
		System.out.println(total);
	}

}
