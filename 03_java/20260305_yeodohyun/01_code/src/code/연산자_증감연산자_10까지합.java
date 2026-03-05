package code;

public class 연산자_증감연산자_10까지합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while 구하기1~10
		// 1 2 3 4 5 6 7 8 9 10 순번
		// 1 2 3 4 5 6 7 8 9 10 수
		
		// 처리: n: 항이자 반복제어변수
		// 출력: 항의 합계: sum
		int n=0;
		int sum=0;
		
		while(n<10) {
			n+=1;
			sum+=n;
		}
		System.out.println(sum);
		
	}

}
