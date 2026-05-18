package day2.lambda.함수형인터페이스;

import java.util.function.Supplier;

/*
 *  interface Supplier<T>{
 *     T get( );
 *  }
 * 
 * 
 */

public class SupplierTest {

	public static void main(String[] args) {
		// int  -> Integer 
		// double -> Double
		
		Supplier<Integer> s1 =  () -> (int) (Math.random()*5);
		int result =s1.get();
		System.out.println( result);
		
		
		Supplier<String> s2 = ( ) -> {
			int  randomNumer =(int)  (Math.random()*2) ;  //0 or 1
			if( randomNumer ==0) {
				return "좋다 ";
			}else {
				return "더 좋다";
			}	 
		};
		
		String result2=s2.get();
		System.out.println( result2);
		
		
		Supplier<Integer> s3 = new Supplier<>() {

			@Override
			public Integer get() {				 
				return (int) (Math.random()*5);
			}};		
		
		int result3 = s3.get();
		System.out.println( result3);
		
		
		
		
		//20억 받고 싶죠?
		Supplier<Integer>  s4 = () ->  200000000;
		
		int  result4=s4.get();
		System.out.println( result4 );
		
		
		

	}

}
