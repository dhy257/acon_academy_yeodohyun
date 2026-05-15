package day1.comparator;

import java.util.*;
import java.util.stream.*;

class ComparatorEx1 {
	public static void main(String[] args) {
		
		
		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("이자바", 3, 300));
		list.add( new Student("김자바", 1, 200));
		list.add( new Student("홍자바", 2, 100));
		list.add( new Student("최자바", 2, 150));
		list.add( new Student("황자바", 1, 200));
		list.add( new Student("문자바", 3, 180));
		list.add( new Student("이자바", 3, 380));
	 
		 
		//스트림얻어오고 정렬하기
		
		Stream<Student> studentStream =  list.stream();
		 
	     
	    
	     //  Comparator인터페이스에 이미 구현된 매서드(default 매서드가 제공된다 ) 
	     //  Comparator인터페이스에 디폴트매서드 사용해보기
	     
	    //  
		
		// 1) comparing Static매서드 사용하기
		  //studentStream.sorted(Comparator.<Student, Integer>comparing(Student::getBan))
		  //.forEach(item -> System.out.println( item));;
		
		  
		  //2) 같은경우에 기본정렬 적용하기 
		 /*
	       studentStream.sorted(Comparator.<Student, Integer>comparing( s -> s.getBan()) // 반별 정렬
    	  .thenComparing(Comparator.naturalOrder()))      // 기본 정렬   // 객체가 정렬의 기준을 가지고 있어야함 
                                                                     // Comparable을 구현해야 함
		  .forEach( s-> System.out.println(s));
		  */         
	     
	     
	     
	   // 3) 직접구현
	    
	        studentStream.sorted((student1, student2) -> {
	    	    // 먼저 반별로 정렬
	    	    int banComparison = student1.getBan()- student2.getBan();	    	    
	    	    // 반별로 정렬한 결과가 같다면 총점이 높은 순으로 내림차순정렬
	    	    return (banComparison == 0) ?  student2.getTotalScore() - student1.getTotalScore()  : banComparison;
	    	})
	    	.forEach( s -> System.out.println(s)); 
	       
	      
	        studentStream =  list.stream(); 
	        System.out.println(" 반별로 정렬 같은 반인 경우  토탈점수 내림차순 정렬");
		     //반별로 정렬  같은반인경우 이름 순으로 정렬
	        studentStream.sorted( Comparator.<Student, Integer>comparing( item ->item.getBan() )
	        		.thenComparing( Comparator.<Student, Integer>comparing( item-> item.getTotalScore()).reversed()))
	        .forEach(item ->System.out.println( item));
	       


	        studentStream =  list.stream(); 
	        System.out.println(" 반별로 정렬 같은 반인 경우  토탈점수 정렬");
		     //반별로 정렬  같은반인경우 이름 순으로 정렬
	        studentStream.sorted( Comparator.<Student, Integer>comparing( item ->item.getBan() )
	        		.thenComparing( Comparator.<Student, Integer>comparing( item-> item.getTotalScore()) ))
	        .forEach(item ->System.out.println( item));
	       
	        
	        //
     
	        studentStream =  list.stream(); 
	        System.out.println(" 반별로 정렬 같은 반인 경우  토탈점수 내림차순 정렬");
		     //반별로 정렬  같은반인경우 이름 순으로 정렬
	        studentStream.sorted( Comparator.<Student, Integer>comparing( item ->item.getBan() )
	        		.thenComparing( Comparator.<Student, Integer>comparing( item-> item.getTotalScore()).reversed()))
	        .forEach(item ->System.out.println( item));
	       
	        
	        
	        
	     
	     
	     
	}
}



