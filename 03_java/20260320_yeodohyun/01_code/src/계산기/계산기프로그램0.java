package 계산기;

import java.util.Scanner;

import 실습.Calculator;
import 실습.LGCalculator;

public class 계산기프로그램0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("두 수 입력");

		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

//		LGCalculator cal = new LGCalculator();
		SMCalculator cal = new SMCalculator();
//		int result = cal.addLG(su1, su2);
		int result = cal.addSM(su1, su2);
		System.out.println(result);
	}

}
