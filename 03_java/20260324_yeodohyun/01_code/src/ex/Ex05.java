package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		try {
			System.out.println("숫자입력");
			input = sc.nextInt();
			// java.util.InputMismatchException
			// 숫자 외에 입력시 예외가 발생하고 프로그램은 정상 종료 x
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("당신이 입력한 숫자=" + input);
	}

}
