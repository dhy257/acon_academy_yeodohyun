import java.util.Scanner;

public class 함수만나기 {

	public static int[] m화폐매수구하기(int money) {
		int[] result = new int[8];

		int a = money / 50000; // 오만원권
		money = money % 50000; // 잔액
		result[0] = a;

		int b = money / 10000; // 만원권
		money = money % 10000; // 잔액
		result[1] = b;

		int c = money / 5000;
		money = money % 5000;
		result[2] = c;

		int d = money / 1000;
		money = money % 1000;
		result[3] = d;

		int e = money / 500;
		money = money % 500;
		result[4] = e;

		int f = money / 100;
		money = money % 100;
		result[5] = f;

		int g = money / 50;
		money = money % 50;
		result[6] = g;

		int h = money / 10;
		money = money % 10;
		result[7] = h;

//		System.out.println("오만원 = " + a);
//		System.out.println("만원 = " + b);
//		System.out.println("오천원 = " + c);
//		System.out.println("천원 = " + d);
//		System.out.println("오백원 = " + e);
//		System.out.println("백원 = " + f);
//		System.out.println("오십원 = " + g);
//		System.out.println("십원 = " + h);

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 함수명(기능명) 화폐매수구하기
		// 입력(함수외부와 매개자역할): 돈 => 매개변수
		// 반환: 화폐매수배열(8)

		/*
		 * 한 사람의 출장비 -> 5 7 3 2 1 1 0 0
		 * 
		 * 입력:돈 출력:화폐매수배열(8) 처리 : 반복제어변수 i 준비 :화폐단위배열(8)
		 * 
		 * 
		 */

		/*
		 * 입력: 돈(출장비) : money 출력: 오만원매수:a , 만원매수:b , 오천원:c , 천원:d, 오백원:e, 백원:f, 오십원 :g ,
		 * 10원 : h
		 * 
		 */

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;

		money = sc.nextInt();
		sc.close();
		int[] result = m화폐매수구하기(money);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

}
