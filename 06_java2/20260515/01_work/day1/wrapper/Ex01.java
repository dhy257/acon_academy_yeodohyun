package day1.wrapper;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		 
		
		//기본자료형, 원시자료형 (8)
		
		char  ch ='A';
		int   su=100;   // byte, short , int , long
		double  su2= 10.23;  //float, double
		boolean  flag = true; 
		
		
		
		//Object로 다뤄지기 위해 기본형값들을 객체로 바꿔서 사용한다
		ArrayList list = new ArrayList();
		list.add( new Score());
		list.add( ch);   // 성공이유 ?  ch  -> 객체로 자동 변환이 이루어지기 때문에 //자동으로 객체로 만들어줌  auto boxing 
		list.add(su);
		list.add(flag);
		list.add(su2);
		
		
		
		//원시자료형은 자료형에 맞는 각 각의  Wrapper 클래스 
		//int  => Integer   ( 혼용해서 사용해도 괜찮다 ) 
		//char  => Character
		//boolean   => Boolean 
		//double  => Double 
		
		
		// 123  = > 객체변수 
		//Integer 정수형객체  =  new Integer(123);  
		Integer 정수형객체 =  Integer.valueOf(123);  // 권장
		
		
		int 정수형변수 =10;		
		int result  = 정수형변수 + 정수형객체;
		System.out.println( result  );
		
		
		Integer result2 = 정수형변수 + 정수형객체;    //  auto  unboxing; 
		System.out.println( result2);
		
		Integer result3 = 정수형변수  + 정수형객체.intValue();  //명시적 언박싱
		System.out.println( result3);
		
		
		// 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		

	}

}
