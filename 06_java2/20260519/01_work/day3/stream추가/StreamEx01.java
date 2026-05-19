package  day3.stream추가;

import java.util.*;
import java.util.stream.*;

class StreamEx01 {
	public static void main(String[] args) {
		String[] strArr = {
			"Inheritance", "Java", "Lambda", "stream",
			"OptionalDouble", "IntStream", "count", "sum"
		};

		Stream.of(strArr).forEach( item  -> System.out.println( item));
		boolean result = Stream.of(strArr).noneMatch(s->s.length()==0);
		
		
		System.out.println( result);		
		Optional<String> sWord = Stream.of(strArr)
							           .filter(s->s.charAt(0)=='s').findFirst();

		
		System.out.println("result="+result);
		System.out.println("sWord="+ sWord.get());
		

		/*
		 * 
		 * @FunctionalInterface
			public interface IntBinaryOperator {			   
			     * 두 개의 int 값을 받아서 연산을 수행하고 결과를 반환합니다.			     *
			     * @param left  첫 번째 int 값
			     * @param right 두 번째 int 값
			     * @return 연산 결과			      
			    int applyAsInt(int left, int right);
			}			
		*/
		
		

		//1)  Stream<String[]>을 IntStream으로 변환		
		IntStream intStream1 = Stream.of(strArr).mapToInt(s -> s.length());
		//IntStream intStream1 = Stream.of(strArr).mapToInt(str -> str.length());
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
	 

		
		//2) reduce 사용하기 
		int count = intStream1.reduce(0, (a,b) -> a + 1);   // a 변수에 1값을 누적한다
		int sum   = intStream2.reduce(0, (a,b) -> a + b);   // a 변수에 b(즉 스트림의 요소값)을 누적한다

	 
 
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		
	}
	 
}
