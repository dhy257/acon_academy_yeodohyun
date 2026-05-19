package day3.stream만나기;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BookTest {

	public static void main(String[] args) {
		 
		
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("웃긴책",2000));
		list.add(new Book("진짜 웃긴책",5000));
		list.add(new Book("진짜 진짜 웃긴책",1000));
		list.add(new Book("무서운책",7000));
		
		
		//1)스트림 얻어오기
		Stream<Book>  stream = list.stream();
		
		
		stream.filter( book -> book.getPrice()>=5000).forEach( item -> System.out.println( item.getName()));
		
		System.out.println("정렬==>");
		//2) 사용이 끝난 스트림은 다시 얻어와야한다
		//stream = list.stream();	
		//stream.sorted( (o1,o2)-> o1.getPrice()-o2.getPrice()).forEach(  item -> System.out.println( item.getName()));
		 
		
		
	}

}
