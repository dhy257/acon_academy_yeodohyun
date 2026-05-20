package day4.계산기_느슨한결합;

import java.util.Scanner;

public class Program1 {

	//ACalculator  calculator  = new ACalculator();  // ACalculator  -> BCalculator 변경하게 되면  변경의 포인터가 많이 발생함 
	 BCalculator calculator = new BCalculator();
	
	//Program1    ACalculator   의존관계   (강한의존)
	
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
		//total  = su1 + su2;
		total =calculator.addB(su1, su2);  // ACalculator를 의존한다고 한다 (의존성  dependency) 
		System.out.println ( "계산의 결과 " + total);	
	}
	
	
	
	public static void main(String[] args) {
		
		Program1  program = new Program1();
		program.run();
		 
	}

}
