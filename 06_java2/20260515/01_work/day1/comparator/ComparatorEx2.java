package day1.comparator;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class ComparatorEx2 {
	
	public static void main(String[] args) {
		
		
		//스트림을 사용하여 정렬하고 출력하기 구경하기
	
	     Stream<Student> list = Stream.of(
							new Student("이자바", 3, 300),
							new Student("김자바", 1, 200),
							new Student("안자바", 2, 100),
							new Student("박자바", 2, 150),
							new Student("소자바", 1, 200),
							new Student("나자바", 3, 290),
							new Student("감자바", 3, 180)
						);
	     
	     
	    
	     // 1) 객체의  기본정렬 사용하기  - Comparable
	     // list.sorted().forEach( student ->   System.out.println( student));	   
	     
	     // 2) 반별 오름차순   -Comparator인터페이스 사용하기 
	     // list.sorted( ( o1, o2) ->  o1.getBan() - o2.getBan()).forEach( student -> System.out.println( student));
	    
	      
	      // 3) -Comparator 인터페이스 comparing  사용하기 (기본이  오름차순)  
	   //   list.sorted(Comparator.<Student, Integer>comparing( s ->  s.getBan() )).forEach( s ->System.out.println(s));
	      
	      // 4) -Comparator 인터페이스 comparing  사용하기 - 내림차순하고 싶다면
	         // list.sorted(Comparator.<Student, Integer>comparing( s ->  s.getBan() ).reversed()).forEach( s ->System.out.println(s));
	      
	 	
	   /*
	     list.sorted( Comparator.comparing( new Function() {
			@Override
			public Object apply(Object t) {				 
				Student s = (Student) t;
				return s.getBan();
			}})).forEach( new Consumer() {
				@Override
				public void accept(Object t) {
					System.out.println( t);
					
				}}); 
	     */
	     
	     
	     //반으로 정렬하기
	     
	     list.sorted( Comparator.<Student, Integer>comparing(  new Function<>() {

			@Override
			public Integer apply(Student t) {
				 
				return t.getBan();
			}})).forEach(  s-> System.out.println(s)); ;
	     
	     
	       
	     
	     }
	     
		  
	}
	

 

 
