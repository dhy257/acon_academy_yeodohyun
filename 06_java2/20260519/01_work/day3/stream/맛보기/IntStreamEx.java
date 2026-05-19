package day3.stream.맛보기;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		
		//IntStream => 기본형스트림
		//Stream<Integer> -> 객체스트림   
		
		//(기본형일 경우 성능상 유리함 : 기본형스트림을 사용하는 이유 )
		//기본형스트림을 객체스트림으로 변경할 수 있다 
		//Stream<Integer> stream1 = Arrays.stream(numbers).boxed();
		
 
		
		// 정수 배열로부터 IntStream 생성
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(numbers);
        
        
       
        
        // 범위를 지정하여 IntStream 생성
        IntStream stream2 = IntStream.range(1, 6); // 1부터 5까지의 범위

        // 기타 메소드를 이용한 IntStream 생성
        IntStream stream3 = IntStream.of(1, 2, 3, 4, 5); // 명시적으로 값 전달
 
        
        Random random = new Random();
  
	
        stream1.forEach( item  -> System.out.println( item));        
        stream2.filter( item -> item> 2 ).forEach( item -> System.out.println( item));
        
        
        

        IntStream stream =
                random.ints(5, 1, 101);
                // 5개 생성
                // 1 이상 101 미만

        stream.forEach(System.out::println);    
        
	
        
	
	}

}
