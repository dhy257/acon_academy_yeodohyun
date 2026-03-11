import java.util.Scanner;

public class 짝수만배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 출력: 짝수만 담긴 배열: 짝수배열(10)
		// 입력: 어떤수 num
		// 처리: 반복제어 i
		// 짝수배열의 index: index 필요

		int[] su = new int[10];
		int num;
		int index = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= su.length; i++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				su[index] = num;
				index++;
			}
		}

		//
	}

}
