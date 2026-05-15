package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparator객체구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student2> list  = new ArrayList<>();
		
	
		
		list.add( new Student2("장윤성", 3, 300));
		list.add( new Student2("엄진희", 1, 200));
		list.add( new Student2("이정하", 2, 100));
		list.add( new Student2("정철진", 2, 150));
		list.add( new Student2("김재민", 1, 200));
		list.add( new Student2("조아진", 3, 290));
		list.add( new Student2("박세인", 3, 180));	
		list.add( new Student2("장해든", 4, 280));		
		
		
		Collections.sort( list,  new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return  o1.getBan()  - o2.getBan();
	     }});

		 
		
		System.out.println(  list); 
		
		
		//Collections.sort( list, (o1,o2)-> o1.getBan()-o2.getBan());  람다식
	 
		
	

	}

}



//


 