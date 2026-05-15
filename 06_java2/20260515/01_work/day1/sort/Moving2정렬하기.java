package day1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * 
 * interface Comparator{		  
 *    int compare( Object o1, Object o2  );
 * }
 * 
 * interface Comparator<T>{
 *    int compare( T  o1, T o2);
 * }
 * 
 */



public class Moving2정렬하기 {

	public static void main(String[] args) {
		 
		ArrayList<Moving2> list2 = new ArrayList<>();
		list2.add(new Moving2("장주원","구룡포",100));
		list2.add(new Moving2("이미현","경기",80));
		list2.add(new Moving2("김두식","문산",90));
		list2.add(new Moving2("전영석","봉평",88));
		 		
		 
		 
		
		//0. 클래스에 정의된 정렬방법으로 정렬 
		
		
		System.out.println(" 클래스에 정의된 정렬방법으로 정렬 ");
		Collections.sort(list2);		
		for( Moving2   m : list2) {
			System.out.println( m);
		}
		 
		
	
		//1. 이름있는 클래스로 구현
		Collections.sort(list2, new Moving2ComparatorImp ());	
		
		System.out.println(" 파워순으로 오름차순 ");
		for( Moving2   m : list2) {
			System.out.println( m);
		}
		
		
		// 2. 익명클래스 	
		// 인터페이스를 상속해서 클래스를 만들어야 한다
		// 이름이 있는 클래스 또는 이름이 없는 클래스로 만들 수 있다.
		
		//Collections.sort( list2,  new  Comparator<Moving2>() {} );
		Collections.sort( list2 , new Comparator<Moving2>() {

			@Override
			public int compare(Moving2 o1, Moving2 o2) {
				 
				return o1.power-o2.power;
			}});
		
		
		
		
		
           	// 주의!!! 인터페이스 객체화하는 코드가 아님
            // Comparator라는 인터페이스를 익명으로 클래스를 정의하는 코드이다.
            // Comparator() {}   => 익명으로 클래스를 정의하는 코드
		Collections.sort(list2, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 
				Moving2  m1=  (Moving2 )o1;
				Moving2  m2 = (Moving2) o2;			
				
				return m1.power - m2.power;
			}});
		
		
		
		//정렬된 후 		
		for( Moving2  m : list2) {
			System.out.println( m);
		}
		
		
	
		
		//3.람다식 경험하기 ( 함수형인터페이스인 경우 람다식을 사용가능하다)		
		Collections.sort(list2,  ( o1, o2 ) -> o1.power -o2.power ) ;		
		
		for( Moving2 m : list2) {
			System.out.println( m);
		}
		
		
		
	}

}
