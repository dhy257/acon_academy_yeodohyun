package day3.stream만나기3;

import java.util.stream.IntStream;

public class 특정범위의스트림만들기 {

	public static void main(String[] args) {
		 
		
		IntStream intStream = IntStream.range(1, 5);		
		intStream.forEach( s -> System.out.print(s));
		

		System.out.println();
		
		IntStream intStream2 = IntStream.rangeClosed(1, 5);		
		intStream2.forEach( s -> System.out.print(s));

	}

}
