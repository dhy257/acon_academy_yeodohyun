import java.util.Scanner;

public class 배열실습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		실습문제
//
//		1.화폐매수 구하기  문제
//		: 사원명과  출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
//		  화폐단위는 다음과 같다  50000,10000,5000,1000,500,100, 50,10 
//
//		ex)
//		  361200  - > 오만원: 7   만원:1  , 오천원: 0 , 천원: 1, 오백원: 0 , 백원: 2 , 오십원: 0 , 십원 :0    
//
//		1)사원명과  출장비가 입력되면  화폐매수를 출력하는 프로그램을 작성하시오  (배열 사용 안하는거,  배열사용 하는 거)
//		2) stop 입력될 때 까지  사원명과 출장비가 입력되면 화폐매수를 출력하는 프로그램 작성하시오
//		3) 2과 동일하고 반복이 종료되면 각 화폐별 매수를 출력하는 프로그램을 작성하시오
//		 
//		 
//		2. 일정관리프로그램
//		하루일정은 5개 이내로 한다. 
//		1)  하루일정을 관리하는 프로그램 작성하기     (일차원배열 사용하기)
//		2) 일주일 일정을 관리하는 프로그램 작성하기 (2차원배열 사용하기 )

		Scanner sc = new Scanner(System.in);

        System.out.print("사원명 입력: ");
        String name = sc.next();

        System.out.print("출장비 입력: ");
        int money = sc.nextInt();

        int m50000 = money / 50000;
        money %= 50000;

        int m10000 = money / 10000;
        money %= 10000;

        int m5000 = money / 5000;
        money %= 5000;

        int m1000 = money / 1000;
        money %= 1000;

        int m500 = money / 500;
        money %= 500;

        int m100 = money / 100;
        money %= 100;

        int m50 = money / 50;
        money %= 50;

        int m10 = money / 10;

        System.out.println(name + " 화폐매수");
        System.out.println("오만원: " + m50000);
        System.out.println("만원: " + m10000);
        System.out.println("오천원: " + m5000);
        System.out.println("천원: " + m1000);
        System.out.println("오백원: " + m500);
        System.out.println("백원: " + m100);
        System.out.println("오십원: " + m50);
        System.out.println("십원: " + m10);
		
		
		
		//
	}

}
