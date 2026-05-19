package day3.stream.맛보기;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 객체스트림을기본형스트림으로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream =
		        Stream.of(70,95,89,88,95); 

		
		//객체스트림을 기본형스트림으로 변형하기
		IntStream intStream =  stream.mapToInt(x -> x.intValue());
		//IntStream intStream =  stream.mapToInt(x -> x);
		//IntStream intStream =  stream.mapToInt(Integer::intValue);
		
		
		
		IntSummaryStatistics  result   = intStream.summaryStatistics();   //기본형스트림에만 제공된다 summaryStatistics 
		System.out.println(result);
		
		
	}

}
