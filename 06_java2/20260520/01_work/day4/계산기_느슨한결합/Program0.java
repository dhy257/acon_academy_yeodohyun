package day4.계산기_느슨한결합;

import java.util.Scanner;

// 사용자가 수를 입력하면 계산 해 주는 프로그램 


public class Program0 {
	
	
	//실행
	public void run() {
		Scanner sc = new Scanner( System.in);			
		System.out.println( " 두 수 입력하세요");		
		int su1, su2;		
		System.out.print("첫번째 수");
		su1= sc.nextInt();		
		System.out.print("두번째 수");
		su2= sc.nextInt();		
		//계산 
		int total;
		total  = su1 + su2;		
		System.out.println ( "계산의 결과 " + total);	
	}
	 
	
	
	//main
	public static void main(String[] args) {		
		
		 Program0  p = new Program0();
		 p.run(); 
	}

}
