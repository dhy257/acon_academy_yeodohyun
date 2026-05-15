package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparator_Comparing사용하기 {

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
		
		Collections.sort( list,  Comparator.<Student, String>comparing( s->  s.getName() ));
		
		
		 
		
		// Comparator  인터페이스에 있는  Comparing매서드를 사용하기 : static 매서드
		
		 Collections.sort(list,  Comparator.comparing(  s -> s.getBan()));		 
		//반으로 오름차순
		System.out.println( list );
		 
		
		//이름으로 오름차순		
		Collections.sort(  list, Comparator.comparing( s->s.getName()));		
		System.out.println(  list);
		
		
		//제네릭매서드 호출할 때  type을 명시해 준다 		
		Collections.sort(  list, Comparator.<Student , String>comparing( s->s.getName() ).reversed());	
		//매서드참조 사용
		Collections.sort(  list, Comparator.comparing( Student::getName ).reversed());	
		System.out.println(  list);
		
		
	 

	}

}



//




class Student2   {
	String name;
	int ban;
	int totalScore;

	Student2(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	    return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

}
