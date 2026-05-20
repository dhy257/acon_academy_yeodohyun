package day4prac.계산기프로그램;

import java.util.Scanner;

public class 계산기프로그램4 {

	// Calculator calculator = new 다이소계산기();
	Calculator calculator;

	// 계산기가 외부에서 주입 Injection 될 수 있도록 한다 => 느슨한 결합
	// Setter 또는 매개변수가 있는 생성자 사용

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run() {
		System.out.println("두 수 입력해 ");
		Scanner sc = new Scanner(System.in);

		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int result = calculator.add(su1, su2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기프로그램4 p = new 계산기프로그램4();
		p.setCalculator(new 다이소계산기());
		p.run();
	}

}
