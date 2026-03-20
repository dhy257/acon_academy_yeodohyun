package 계산기인터페이스;

import java.util.Scanner;

public class 계산기프로그램 {

	
	
	Calculator calculator ;
	
	
	//(생성자, 세터를 통해서 계산기 객체가 들어와야 한다 => 주입)
	
	public void setCalculator( Calculator  calculator) {
		this.calculator = calculator;
		
	}
	
	
	
	
	public void run() {
		
		
		
		//
		
		Scanner sc = new Scanner( System.in); 
		
		System.out.println(" 두 수 입력하시오");
		int su1 = sc.nextInt();
		int su2= sc.nextInt();
		
		System.out.println(" 연산자를 입력하세요");
		String temp = sc.next();   // "+" , "-"
		
		char op  =temp.charAt(0);
		
		
		switch(op) {
		case  '+':
		 
			 int result  =calculator.add(su1, su2);
			System.out.println( result);
			break;
		
		case '-':
			 
			 int result2 = calculator.sub(su1, su2);
			System.out.println( result2);
			break;		
		}
		
		
		/*
		if( calculator  instanceof CalculatorImpl  ) {
			((CalculatorImpl)calculator).div(su1, su2);
		}*/
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		계산기프로그램 p = new 계산기프로그램();
		// p.setCalculator( new SMCalculator());
		//p.setCalculator( new LGCalculator());
		 //p.setCalculator( new CalculatorImpl());
		// p.setCalculator( new DWCalculator());
		// p.setCalculator( new GoodCal());	
		 
		
		
		//인터페이스를 구현하는 방법
		// 1. 이름있는 클래스로 작성하기 
		// 2. 익명클래스로 작성하기 
		// 3. 람다식 ( 나중에 배움)
		
		 //p.setCalculator(  new Calculator() {});  //Calculator() {}   이 코드가 익명클래스를 만드는 코드
		 p.setCalculator(  new Calculator() {

			@Override
			public int add(int su1, int su2) {
				// TODO Auto-generated method stub
				System.out.println("wjy");
				return su1+su2;
			}

			@Override
			public int sub(int su1, int su2) {
				// TODO Auto-generated method stub
				return su1-su2;
			}});
		 
		 
		 
		 p.setCalculator( new Calculator() {

			@Override
			public int add(int su1, int su2) {
				// TODO Auto-generated method stub
				return  su1+su2;
			}

			@Override
			public int sub(int su1, int su2) {
				// TODO Auto-generated method stub
				return su1-su2;
			}});
		 
		 p.run();

	}

}
