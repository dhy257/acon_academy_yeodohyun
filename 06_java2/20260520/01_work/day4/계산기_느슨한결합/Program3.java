package day4.계산기_느슨한결합;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Program3 {

	//Program과 Calculator의 느슨한 결합을 위해서 인터페이스를 활요함 
	//특정클래스가 아닌 인터페이스에 의존하도록 개발한다. 
	
	//의존성 (라이브러리)
	Calculator calculator ;
			
	
	//의존성 주입  Injection
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run() {	
		Scanner sc = new Scanner( System.in);			
		System.out.println( " 두 수 입력하세요");		
		int su1, su2;		
		System.out.print("첫번째 수");
		su1= sc.nextInt();		
		System.out.print("두번째 수");
		su2= sc.nextInt();		
		int total =calculator.add(su1, su2);
		System.out.println( total);		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties  properties = new  Properties();		
		//설정정보 읽어오기
		
		properties.load ( new FileReader("src/day4/계산기실습/config.txt"));
		String calculator  =properties.getProperty("calculator");
		System.out.println( calculator);
		
		
		//클래스의 정보를 가진 클래스 
		Class clazz  = Class.forName(calculator);  //클래스정보로드하기
		Calculator cal = (Calculator) clazz.newInstance();  // 계산기 객체생성하기
		 
		Program3  p  = new Program3();		
		p.setCalculator( cal );	  // new C()  , new D()	 //계산기 주입하기
		p.run();		
	}

}
