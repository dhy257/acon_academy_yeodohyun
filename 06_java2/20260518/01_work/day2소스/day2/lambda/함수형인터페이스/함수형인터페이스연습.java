package day2.lambda.함수형인터페이스;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * 
 *  interface Runnable{
 *    void run();
 *  }   
 *  
 *  interface Consumer<T>{
 *  	 void accpet( T t);
 *  } 
 * 
 *  interface Supplier<T>{
 *       T get();
 *  }  
 *  
 *  interface Predicate<T> {
 *       Boolean test( T t);
 *  }
 *  
 *  interface Function<T, R> {
 *       R apply( T t);
 *  }
 * 
 * 
 */

public class 함수형인터페이스연습 {

	
	public static void main(String[] args) {
		 
		//1.Runnable
		Runnable r  =   () ->{ System.out.println(" lamda ^^");  };
		Runnable r2  =  () ->  System.out.println(" lamda ^^");  
		
		
		r.run();
		r2.run();
		
		//2.Consumer<Interger>
		
		Consumer<Integer>  c  = ( amount ) -> {
			
			System.out.println( amount);
			System.out.println("빵사기");	
			
			
		};
		
		c.accept(30000);
		
		
		//인터페이스를 익명으로 클래스를 정의하고 객체를 생성하는 코드 
		Consumer<Integer> c2 = new Consumer<>() {
			@Override
			public void accept(Integer t) {    // () -> {};
				
				 System.out.println( t);
				 System.out.println( "빵사기 30000"); 
				
			}};
		
		c2.accept(30000);	
		
		//3.  Supplier     ()-> {return }
		
		
		Supplier<String>  s = () ->{ return "스파게티"; };
		Supplier<String>  s2 = () ->   "스파게티";  ;		
		Supplier<Integer> s3= () -> (int) Math.random()* 10;  //0~9
		Supplier<Integer> s4 =() ->  2000000000;
		
		
		
		int  rtn  =s3.get();
		String rtn2 = s.get();
		
		System.out.println( rtn);
		System.out.println( rtn2);
		
		
		
		
		
		//Predicate (  (입력)  -> {return true })
		
		Predicate<String> p = ( str) -> {return str.equals("스파게티"); };		
		Predicate<String> p2 = ( str) ->  str.equals("스파게티") ;
		
		boolean rtn3 =p2.test("스파게티");		
		System.out.println( rtn3);
		
		
		
		//Function (  (입력)  ->  { return  값 } 
		  //매개변수, 반환타입
		Function<Integer, Integer> f =  ( num) ->{   return num*2 ;};
		Function<Integer, Integer> f2 =  ( num) ->  num*2  ;
				
		int rtn4 =f2.apply(3000);
		System.out.println( rtn4);
		
		
		 
		
		
		
		

	}

}
