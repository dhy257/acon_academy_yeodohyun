package day3.stream만나기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림이란 {
	
	public static void main(String[] args) {
		
		
		//다양한 데이터소스를 표준화된 방법으로 다루겠다		
		//Collections, 배열
		
		
		//List,SET
		//Map은 사용방법이 달랐다.
		
		//JDK1.8 스트림 문법이 제공
		//다양한 데이터 소스를 표준화된 방법으로 다루게 되었음
		//List, Set, Map, 배열을  => Stream얻어올 수 있다.
		//Stream을 얻고 나면 똑같은 방식으로 다룰 수 있게 된다.
		

		// String[], ArrayList를  스트림으로 다루면 같은 방식으로 다룰 수 있다
	 
		
		//배열을 정렬하기   Arrays.sort사용
		//Collection 정렬하기  Collections.sort사용
		// 각 각 다른방식으로 정렬을 사용해야 한다 !!
		
		String[] arr =new String[] { "one", "two", "three"};		
		Arrays.sort(arr);
		
		System.out.println( "String[] 배열 출력");
		for( String s: arr) {
			System.out.println(s);
		}
		
		ArrayList<String > list= new ArrayList<>();		
		list.add("one");
		list.add("two");
		list.add("three");
		Collections.sort( list);
		
		System.out.println( "ArrayList 출력");
		for( String s: list) {
			System.out.println( s);
		}
		
		//////////////////////////////////////////////////////////////
		//스트림을 얻어오면 배열과 Collection을 같은 방식으로 다룰 수 있다
		
		//배열을 스트림으로 		
		Stream<String>  stream1 = Arrays.stream(arr);		
		//ArrayList 스트림으로
		Stream<String>  stream2= list.stream();
		 
		stream1.sorted().forEach( s->System.out.println( s));
		stream2.sorted().forEach( s-> System.out.println( s));
		
		
	}

}
