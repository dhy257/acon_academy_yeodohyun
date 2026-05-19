package day3.stream만나기2;

import java.util.Arrays;
import java.util.List;
 

public class ReducingTest {

	public static void main(String[] args) {
		    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
	        
	        // 초기값을 사용하여 reduce
	        int total = numbers.stream()     //a가 누적변수  , b 요소
	                .reduce(0, (a, b) -> a + b); // 초기값 0을 사용

	        System.out.println("합계(초기값 사용): " + total);		

	}

}
