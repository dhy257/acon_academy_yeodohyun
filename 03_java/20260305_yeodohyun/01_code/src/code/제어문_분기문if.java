package code;

import java.util.Scanner;

public class 제어문_분기문if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 국어성적에 대한 등급구하기
		int kor = 90;
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		char result = ' ';

		if (kor >= 90) {
			result = 'A';
		} else if (kor >= 80) {
			result = 'B';
		} else if (kor >= 70) {
			result = 'C';
		} else {
			result = 'F';
		}

		System.out.println(result);
	}

}
