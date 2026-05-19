package day3.stream.중간연산및최종연산;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class filterEx {

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
		 
	 //	stream1.filter( str -> str.equals("hello")).forEach( s-> System.out.println( s));
		 
		stream1.filter( new Predicate<Object>() {

			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return t.equals("hello");
			}}).forEach( System.out::println);

	}

}
