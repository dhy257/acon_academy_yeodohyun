package day3.stream.중간연산및최종연산;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class StreamEx0 {
	
	public static void main(String[] args) {
		
	     Stream<Student> a = Stream.of(
							new Student("이자바", 3, 300),
							new Student("김자바", 1, 200),
							new Student("안자바", 2, 100),
							new Student("박자바", 2, 150),
							new Student("소자바", 1, 200),
							new Student("나자바", 3, 290),
							new Student("감자바", 3, 180)
						);
	     
	    
	     //1) 객체의  기본정렬   - Comparable구현해야함 
	     // a.sorted().forEach( student ->   System.out.println( student));		     
	     
	     
	     //2) Comparotr 구현  반별 오름차순
	     // a.sorted( ( o1, o2) ->  o1.getBan() - o2.getBan()).forEach( student -> System.out.println( student));
	    
	     /* 익명으로 구현
	      a.sorted(  new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {			 
				return o1.getBan()- o2.getBan();
			}});	 
	      */
	     
	     
	     //3) Comparator의 comparing 사용하기 (감각적으로 사용하기)
	      
	 //    a.sorted(Comparator.comparing( s ->  s.getBan() )).forEach( s ->System.out.println(s));
		 
	    //  a.sorted(Comparator.<Student , Integer>comparing( s ->  s.getBan() ))
	     // .forEach( s ->System.out.println(s));
	     
	     
	     
	      
	      System.out.println(" 익명객체로 구현하고 사용하기");
	      a.sorted(Comparator.<Student, Integer>comparing( new Function<Student, Integer>(){

			@Override
			public Integer apply(Student t) {
				// TODO Auto-generated method stub
				return t.ban;
			}})).forEach( new Consumer<Student> () {

				@Override
				public void accept(Student t) {
					 System.out.println( t);
					
				}});;
	    
		} 
	}
	

 

 
