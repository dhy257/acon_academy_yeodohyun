package day2.lambda.함수형인터페이스;

import java.util.function.Function;

/*
 * 
 * interface Function<T, R>{
 *    R  apply( T);
 * }
 * 
 */
public class FunctionTest {

	public static void main(String[] args) {
		//Function 인터페이스 구현
		
		// 수 -> 두배 반환
		// 람다식으로 구현
		 Function<Integer, Integer> f1 =  su ->  su*2;		 
		 int result1= f1.apply(10);
		 System.out.println( result1);
		 
		 	 
		
		 // 익명클래스로 구현
		 Function<Integer, Integer> f2=   new Function<>() {
			@Override
			public Integer apply(Integer t) {
				 
				return t*2;
			}};
		 
			
		int result2 = f2.apply(1000);
		System.out.println( result2);
		
		
		// 수 -> 수만큼 람다좋아 반환
		
		Function<Integer, String>  f3 =  num  -> {
			  String re="";
			  for( int i=1 ; i<= num  ;i++) {
				  re+="람다좋아 " ; 
			  }			  
			  return re;
		};
				
		
		String result3 =f3.apply(2);
		System.out.println( result3);
		
		
		 
		 
	}

}
