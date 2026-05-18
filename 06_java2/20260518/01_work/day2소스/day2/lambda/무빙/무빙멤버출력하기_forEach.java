package day2.lambda.무빙;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 무빙멤버출력하기_forEach {

	public static void main(String[] args) {
		 
		ArrayList<String>  list = new ArrayList<>();
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장주원");
		list.add( "장희수");
		list.add( "이강훈");
		
		/*
		장주원  
		이미현 
		김두식
		전계도
		프랭크
		김봉석
		장희수
		이강훈
		*/
		
		//지역내부클래스 
		class  A  implements Consumer<String>{

			@Override
			public void accept(String t) {
				 System.out.println(  t  +"^^");
			} 
		}
		
		list.forEach(  new A() );
		
		
		
		list.forEach(  new Consumer<String>() {

			@Override
			public void accept(String t) {
				 System.out.println(  t  +" ^^!!!!!");
				
			}});
		
		
		
		//람다식   함수 ->간단한 식으로 표현하는것 
		//함수형 인터페이스를 구현할 때만 사용가능
		list.forEach(  (t)  -> System.out.println( t+ " 이것이 람다식"));
		
		

	}

}
