package day3.stream추가;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 기본형스트림을객체스트림으로 {
    public static void main(String[] args) {
    	
    	/*
    	   
    	 */
    	
    	
        //IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

    	int[] arr =  {1,2,3,4,5};    	    	
    	IntStream  intStream = Arrays.stream(arr); 
    	
        // 기본형 스트림을 객체 스트림으로 변환
        Stream<Integer> boxedStream = intStream.boxed();

        // 출력
       // boxedStream.forEach( num  ->  System.out.println( num));
        
        
        //List로 만들기
        List<Integer> list  =boxedStream.collect( Collectors.toList());
        
    }
}
