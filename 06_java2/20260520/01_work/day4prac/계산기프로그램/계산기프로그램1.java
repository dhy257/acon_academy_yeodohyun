package day4prac.계산기프로그램;

import java.util.Scanner;

public class 계산기프로그램1 {

	// 의존성
	LG계산기 calculator = new LG계산기();

	public void run() {
		System.out.println("두 수 계산함 입력하셈");
		Scanner sc = new Scanner(System.in);

		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int result = calculator.addLG(su1, su2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기프로그램1 p = new 계산기프로그램1();
		p.run();
	}

}
