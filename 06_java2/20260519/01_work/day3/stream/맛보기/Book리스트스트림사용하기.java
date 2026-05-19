package day3.stream.맛보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 
 

public class Book리스트스트림사용하기 {

	public static void main(String[] args) {
		
		ArrayList<Book> list  = new ArrayList<>();
		list.add( new Book("이것이자바다", 25000) );
		list.add( new Book("자바의 정석", 23000) );
		list.add( new Book("신나는 자바책", 26000) );
		list.add( new Book("자바길라잡이", 25000) );
		list.add( new Book("자바책", 21000) );		
		
		 
		 
		 
		 //1. 정렬하고 출력하기
		 System.out.println("1. 정렬하고  출력하기");
		 Stream<Book> stream = list.stream();
		 stream.sorted((o1,o2) ->  o1.getPrice()-o2.getPrice() ).forEach( item  -> System.out.println(item));
		 
		 
		 //2. 가격으로 정렬한 새로운 리스트로 가져오기
		 
		 stream = list.stream();
		 List<Book> sortedList  =  stream.sorted((o1,o2) ->  o1.getPrice()-o2.getPrice() ).collect(Collectors.toList());		 
		
		 //정렬된리스트 출력하기
		 
		 System.out.println("2. 정렬된리스트 출력하기");
		 sortedList.forEach(  item  -> System.out.println( item));
		// sortedList.forEach( System.out::print);
		 
		 
		 //3.책정보에서 책이름만 리스트로 가져오기
		 System.out.println("3. 책 이름 리스트 출력하기");
		 stream = list.stream();
		 List<String>  titleList  =   stream.map( item  -> item.getTitle()).toList();
		 System.out.println( titleList);
		 
		 
		 //4.책정보에서 책가격만 리스트로 만들기	
		 System.out.println("4. 책 가격  리스트 출력하기");
		 stream= list.stream();
		 List<Integer> priceList  = stream.map( item  -> item.getPrice()).collect( Collectors.toList());
		 System.out.println( priceList);
		
		 
		 //  stream.sorted( (o1,o2) -> o1.getPrice() -o2.getPrice()).forEach( t -> System.out.println(t)); 		
 	     //  List<Book>d =stream.sorted( Comparator.<Book, Integer>comparing(  item -> item.getPrice() )).collect( Collectors.toList()); 
		 //  List<Book>d =stream.sorted( Comparator.<Book, Integer>comparing(  item -> item.getPrice() )).toList();		
		 //  System.out.println(d);
		  
		 
		 //책정보에서 책이름만 리스트로 만들기
		 
		// List<String>  titleList  =   stream.map( item  -> item.getTitle()).collect(Collectors.toList());
		// System.out.println( titleList);
		  
		 
	
		 
	}

}
