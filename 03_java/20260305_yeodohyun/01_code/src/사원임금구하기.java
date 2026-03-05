

import java.util.Scanner;

public class 사원임금구하기 {

	public static void main(String[] args) {
		
		
		/*
		 * 사원번호, 일한 시간(주급) , 시간당 임금을 읽어서 사원의 급여를 계산하여 인쇄하
는 순서도를 작성하시오. 일한 시간이 40시간을 초과한 경우, 40시간 초과 분에 대
해서는 임금율을 1.5배로 계산한다. 총지급액이 40만원을 초과한 경우에 세금으로
3만원을 공제한다. 
		 *
		 *
		 *
		 *
		 *  1. 출력자료 : 실수령액 :netpay
			2. 입력자료 : 사원번호: no , 일한 시간: hours, 시간당 임금: wages
			3. 처리자료 : 총지급액 : grosspay , 세금:tax
			           기준시간 초과분 일한시간: overtime
			           기준시간 이하의 일한 시간: worktime
			4.S.C(Symbolic constant)
			
			:
			BASETIME : 40(기준 시간)
			OTRATE : 1.5 (초과 임금율) 
			TAX1: 30000 
			TAX2: 0
			
			
			1. 다음의 과정을 반복
				1.1 입력
				1.2 급여를 계산
					1.2.1 기준이하 일한시간과 초과 근무시간 계산
					1.2.2 총지급액 계산
					1.2.3 세금 공제 기준을 초과 판단
					1.2.4 세금을 계산
			    1.3 급여 출력
	       2. 종료
		 */
		
		//정수형 변수  => int 
		//실수형변수  = > double 
		
		int netpay ;
		int no, hours ,wages;
		
		double  gorsspay ;		 
		int  worktime ,overtime, 	tax;
		
		final  int     BASETIME=40;  //상수화
		final  double  OTRATE=1.5;
		final int  TAX1=30000;
		final  int TAX2=0; 
		
		
		
		//반복문 제외하고 코딩
		
		
		
		//반복문에 집어 넣기
		//for( int i=1; i<=3; i++) {
			
		
		
		//}
		
		
		
		//no , 일한 시간: hours, 시간당 임금: wages
		
		Scanner sc = new Scanner (System.in);  //키보드로 입력준비
		
		System.out.println("사번 일한시간 임금을 입력하시오");
		no = sc.nextInt();
		hours =sc.nextInt();
		wages= sc.nextInt();
		
		
		if(hours > BASETIME ) {
			worktime = BASETIME;
			overtime = hours  -BASETIME;
			
		}else {
			worktime  = hours;
			overtime =0;
		}		
		//		
		gorsspay  = worktime  *wages +  overtime*( wages* OTRATE);		
		
		//
		
		if( gorsspay    >  400000) {
			tax=TAX1;   // tax=30000;
			
		}else {
			tax=TAX2;  // tax=0;
		}

		//실수령액
		
		netpay  = (int)  gorsspay -tax;   //     
		
		System.out.println("당신의 실수령액은" + netpay);
		
	}
	

}
