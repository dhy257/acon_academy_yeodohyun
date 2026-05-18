package day2.lambda.함수형인터페이스;

import java.util.function.Consumer;

/*
 * 
 *  interface Consumer<T>{
 *       void accept( T  t) ;
 *  }
 * 
 */
public class ConsumerTest {

	public static void main(String[] args) {
		 
		
		Consumer<String> c =  str -> System.out.println( "진짜" +str);
		c.accept("람다식 좋아요 ^^");
		
		
		
		Consumer<String>c2= new Consumer<>() {
			@Override
			public void accept(String t) {
				 System.out.println( t + "구현은 낯설어요 !  몇번씩 연습해 주세요");
				
			}};		
		
			
		 c2.accept("익명클래스로 ");
		 
		 
		 
		 
		 class B implements Consumer<String>{

			@Override
			public void accept(String t) {
				 System.out.println( t + "인터페이스를 상속하여 이름있는 클래스로 구현할 수 있어요");				
			}
			 
		 }
		 
		 B b = new B();
		 b.accept("이름있는 클래스");
		 
		 
		 Consumer<Integer> c3 =  su  -> {
			 
			 int sum=0;
			 for( int i=1; i<=su; i++) {
				 sum += i;
			 }
			 System.out.println("1~" + su + "까지의 합=" +sum);
			 
		 };
		 
		 c3.accept(5);
		 
		

	}

}
