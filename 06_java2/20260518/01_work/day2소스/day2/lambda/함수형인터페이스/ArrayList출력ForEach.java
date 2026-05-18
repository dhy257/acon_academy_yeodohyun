package day2.lambda.함수형인터페이스;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList출력ForEach {

	public static void main(String[] args) {
		 
		
		
		
		ArrayList<String> list =new ArrayList<>();		
		list.add("서울");
		list.add("대전");		
		list.add("부산"); 
		
		
		
		/*
		 *  소비하다 ( 매개변수 한개 : 0  , 반환 x ) 
		 *  @FunctionalInterface
		 *  interface Consumer<T>{		    
		 *     void accept( T t);		  
		 *  }
		 * 
		 * 
		 */
		
		System.out.println( "출력1");
		// 인터페이스를 람다식을 구현할 수 있다		
		list.forEach(  item   ->  System.out.println( item) );
		
		
		
		System.out.println( "출력2");
		
		
		list.forEach( new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println( t); 
				
			}});
		
		
		
		
		//이름있는 클래스 작성하고 사용하기
		
		class A implements Consumer<String>{

			@Override
			public void accept(String t) {
				 System.out.println( t); 
			}
			
		}
		
		System.out.println("출력3");
		list.forEach( new A());
				
		

	}

}
