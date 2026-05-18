package day2.lambda.함수형인터페이스만들고_구현해보기;

 

import java.util.function.Consumer;

  @FunctionalInterface
  interface MyConsumer<T>  {	
	void accept(  T str);  //  입력이 있고 반환이 없다.
 }


public class MyConsumerTest { 
	
	public static void main(String[] args) {
		
		//지역내부클래스  (매서드 안에서 선언된 클래스)
		
	  class	MyConsumerImp  implements MyConsumer<String> {
		@Override
		public void accept(String str) {
			 System.out.println( str );			
		}			  
	  }
	 
	 // 1. 
	  MyConsumerImp  obj = new MyConsumerImp();	  
	  obj.accept("hello");	 
	  
	  
	  //2. 익명클래스작성
	  MyConsumer<String> obj2 = new MyConsumer<>() {

		@Override
		public void accept(String str) {			 
			 System.out.println( str );		
		}	  
	  };
	  //3.람다식
	  
	  MyConsumer<String>   obj3 =  str -> System.out.println(str);
	  MyConsumer<Integer>  obj4 =  num -> System.out.println( num*num);
	  
	   	  
	  obj3.accept("문자열");
	  obj4.accept(7);
	 
	  
	  
	  //자바에서 제공하는 함수형인터페이스 
	  
	  Consumer<String>   obj5 =  str -> System.out.println(str);
	  Consumer<Integer>  obj6 =  num -> System.out.println( num*num);
	 
   	  
	  obj5.accept("문자열");
	  obj6.accept(7);
	  
	}

}
