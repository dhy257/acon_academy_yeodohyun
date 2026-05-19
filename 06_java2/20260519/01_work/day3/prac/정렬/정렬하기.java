package day3.prac.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day2.lambda.무빙.Moving;

public class 정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ArrayList<Moving> list = new ArrayList<>();
	 	
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두신", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));
		
		
		
		
		//배열 -> Arrays.sort( arr)  , Arrays.sort( arr, Comparator c );
		//Collections.sort( list ),  Collections.sort( list, Comparator c);
		
			
		
		//Collections.sort(list );  => Moving이 Comparable 을 구현해야 한다 
		
		
		
		Collections.sort(list,  new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 
				Moving m1 =(Moving) o1;
				Moving m2 =(Moving) o2;
				
				return  m1.getPower() - m2.getPower();
			}});
		
		
		
		//list.forEach( ( item)->{ System.out.println( item) ;});
		list.forEach(   item ->  System.out.println( item)  );
		
		
		//
		Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				 
				return  o2.getPower() - o1.getPower();
			}} );
		
		
		 list.forEach(   item  -> 
			System.out.println( item)  
		 );
		
		 
		 
		 // 
		 
		 Collections.sort( list, Comparator.<Moving, String>comparing( (item)->{ return item.getName(); }));
		 
		 list.forEach(   item  -> 
			System.out.println( item)  
		 );
		 
		 
		 
		 
		// Collections.sort(list, Comparator.<Moving , String>comparing( ( item)->{ return item.getAlias() ;}));
		 
		 Collections.sort(list, Comparator.<Moving , String>comparing(   item -> item.getAlias()  ));
		 
		 
		 list.forEach(   item  -> 
			System.out.println( item)  
		 );
		 
		 
		 
		 
		
	}

}
