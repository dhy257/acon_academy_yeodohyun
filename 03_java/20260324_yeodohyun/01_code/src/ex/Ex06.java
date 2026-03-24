package ex;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int su = 0;
		while (true) {
			try {
				System.out.println("숫자입력");
				su = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("숫자입력해야함!");
				sc.nextLine();
			}
		}
		System.out.println("당신 입력한 숫자: " + su);
	}
}
