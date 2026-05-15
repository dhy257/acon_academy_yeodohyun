package day1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * 
 *  interface Comparable{
 *     int compareTo( Object other) ;
 *  }
 *  
 *  interface Comparable<T>{
 *     int compareTo( T other) ;
 *  }
 * 
 * 
 */


public class Moving정렬하기 {

	public static void main(String[] args) {
		 
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원","구룡포",100));
		list.add(new Moving("이미현","경기",80));
		list.add(new Moving("김두식","문산",90));
		list.add(new Moving("전영석","봉평",88));
		 
		
		//정렬		
		Collections.sort(list);
		
		
		
		for( Moving m  : list) {
			System.out.println( m);
		}
		
		 
		
		
	
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 
				
				Moving m1 = (Moving)o1;
				Moving m2  = (Moving) o2;
				return m1.power  - m2.power;
			}});
		
		
		
		//정렬 후 출력하기
		System.out.println(  "파워 순으로  오름 정렬하기 ");
		for( Moving m  : list) {
			System.out.println( m);
		}
		
		
		
		
		
		//code 순으로 정렬하기
		Collections.sort(list,  new MovingComparatorImp());
		

		
		System.out.println(  "코드 순으로 정렬하기 ");
		for( Moving m  : list) {
			System.out.println( m);
		}
		
		
		
		
		
		
		
	}

}
