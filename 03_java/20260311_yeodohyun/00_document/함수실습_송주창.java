package javaprj.day07;

import java.util.Scanner;



public class 함수실습_송주창 {

	public static int calc(int num1, int num2, char op) {
		int result = 0;
		if(op == '+') {
			result = num1 + num2;
		}else if(op == '-') {
			result = num1 - num2;
		}else if(op == '*') {
			result = num1 * num2;
		}else if(op == '/') {
			result = num1 / num2;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int x = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int y = sc.nextInt();
		
		System.out.println("기호를 입력하세요.(+, -, *, /)");
		char op = sc.next().charAt(0);
		
		int result = calc(x, y, op);
		System.out.println("계산 결과는 " + result);
		
		
	}

}
