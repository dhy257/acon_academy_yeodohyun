package day3.stream만나기;

import java.util.ArrayList;
import java.util.stream.Stream;

public class 중간연산_최종연산 {

	public static void main(String[] args) {
		 
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("hello");		
		list.add("bye");
		list.add("hello");
		
		
		
		
		//중간연산, 최종연산
		//중간연산 :  filter, limit, distinct 사용해보기
		//최종연산 :  count , forEach 사용해 보기
		
		Stream<String> stream1= list.stream();
		 
		stream1.filter( str -> str.equals("hello")).forEach( s-> System.out.println( s));
		//
		 stream1= list.stream();	
		long result  =stream1.filter( str -> str.equals("hello")).count();
		System.out.println( result);
		
		stream1 = list.stream();
		stream1.filter( str ->str.equals("hello")).limit(2).forEach(s->System.out.println(s));
		

	}

}
