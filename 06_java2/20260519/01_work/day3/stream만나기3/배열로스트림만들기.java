package day3.stream만나기3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 배열로스트림만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays.stream(): 객체 배열과 기본형 배열 모두에 사용 가능.
		//Stream.of(): 객체 배열에만 사용 가능.
		
		
		int[] intArray = {1, 2, 3};
		IntStream intStream = Arrays.stream(intArray);
		 
		
		
		String[] stringArray = {"A", "B", "C"};
		Stream<String>  stream = Arrays.stream(stringArray);
		//Stream<String> stream2 = Stream.of(stringArray);

	}

}
