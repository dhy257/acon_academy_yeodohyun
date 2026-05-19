package day3.stream.중간연산및최종연산;

import java.util.*;
import java.util.stream.*;


//정렬에서 같을 때 다른 정렬조건으로 정렬하기 

class StreamEx1 {
	public static void main(String[] args) {
	     Stream<Student> studentStream = Stream.of(
							new Student("이자바", 3, 300),
							new Student("김자바", 1, 200),
							new Student("안자바", 2, 100),
							new Student("박자바", 2, 150),
							new Student("소자바", 1, 200),
							new Student("나자바", 3, 290),
							new Student("감자바", 3, 180)
						);
	     
	     
	     
	     
	     //정렬하기 - 같을 때 다른 기준으로 정렬하기  
	    
	     
	    
	        studentStream.sorted((student1, student2) -> {
	    	    // 먼저 반별로 정렬
	    	    int banComparison = student1.getBan()- student2.getBan();	    	    
	    	    // 반별로 정렬한 결과가 같다면 총점이 높은 순으로 내림차순정렬
	    	    return (banComparison == 0) ?  student2.getTotalScore() - student1.getTotalScore()  : banComparison;
	    	})
	    	.forEach( s -> System.out.println(s)); 
	       
	       
	     
	     
	     //  Comparator인터페이스에 이미 구현된 매서드( static과  default 매서드가 제공된다 ) 
		 
	    
	     
	     /*
	         studentStream.sorted(Comparator.<Student, Integer>comparing( item -> item.getBan() )
	    		 .thenComparing(Comparator.naturalOrder())
	    		 ).forEach( item -> System.out.println( item) );
	        
	     */
	 
	    /*
	     studentStream.sorted(Comparator.<Student, Integer>comparing( item -> item.getBan() )
	    		 .thenComparing( Comparator.<Student, String>comparing( item -> item.getName() ))
	    		 ).forEach(item -> System.out.println( item) );
	    */
	     
	     
	     
	     // 람다식을 더 줄여서 표현한  매서드 참조 // 눈으로만 보기 
	     // 람다식까지 구현후 매서드 참조로 변경 해
	     // 매서드 참조는 감각적으로 사용해도 됨
	     /*
	     studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
			    	  .thenComparing(Comparator.naturalOrder()))    // 기본 정렬
					  .forEach(System.out::println);
	      */
	      
	}
}


