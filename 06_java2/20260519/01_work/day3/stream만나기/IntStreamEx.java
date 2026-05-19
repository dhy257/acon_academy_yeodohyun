package day3.stream만나기;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		
		
		// 기본형스트림
		// 기본형 배열이나 숫자를 스트림으로 처리할 때 박싱(Boxing) 비용을 줄이기 위해 자바에서 특별히 기본형 스트림을 제공 
		/*
		
		기본형 스트림이 제공하는  메서드	 
		sum()	전체 합계
		average()	평균값 (OptionalDouble)
		max()	최대값 (OptionalInt, OptionalLong, OptionalDouble)
		min()	최소값 (OptionalInt 등)
		count()	요소 개수
		summaryStatistics()	합계, 평균, 최대, 최소, 개수 모두 반환 (IntSummaryStatistics)
		 */
		//IntStream => 기본형스트림
		//Stream<Integer> -> IntStream  (기본형일 경우 성능상 유리함 : 기본형스트림을 사용하는 이유 )
 
		
		 // 정수 배열로부터 IntStream 생성
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(numbers);        
        //Stream<Integer> stream1 = Arrays.stream(numbers).boxed();
        

        // 범위를 지정하여 IntStream 생성
        IntStream stream2 = IntStream.range(1, 6); // 1부터 5까지의 범위

        // 기타 메소드를 이용한 IntStream 생성
        IntStream stream3 = IntStream.of(1, 2, 3, 4, 5); // 명시적으로 값 전달

	
        stream1.forEach( item  -> System.out.println( item));        
        stream2.filter( item -> item> 2 ).forEach( item -> System.out.println( item));
        
	
        
	
	}

}
