package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparable구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("장윤성", 3, 300));
		list.add( new Student("엄진희", 1, 200));
		list.add( new Student("이정하", 2, 100));
		list.add( new Student("정철진", 2, 150));
		list.add( new Student("김재민", 1, 200));
		list.add( new Student("조아진", 3, 290));
		list.add( new Student("박세인", 3, 180));	
		list.add( new Student("장해든", 4, 280));		
	 
		
		
		// 객체는  Comparable을 구현해야 한다 
		 
		
		Collections.sort( list ); 		
		System.out.println(  list);
		
		
		
	

	}

}



//


 