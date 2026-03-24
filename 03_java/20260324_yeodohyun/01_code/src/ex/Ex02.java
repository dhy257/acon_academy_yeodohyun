package ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력");
		int input = sc.nextInt();
		// java.util.InputMismatchException
		// 숫자 외에 입력시 예외가 발생하고 프로그램은 정상 종료 x

		System.out.println("당신이 입력한 숫자=" + input);
	}

}
