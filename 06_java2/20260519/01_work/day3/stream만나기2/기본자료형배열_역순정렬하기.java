package day3.stream만나기2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class 기본자료형배열_역순정렬하기 {

	public static void main(String[] args) {
		int[] arr0= {34,5,35,35,3};		
		IntStream  intst  =Arrays.stream(arr0);
		intst.boxed().sorted( Comparator.reverseOrder()).forEach( t -> System.out.println( t));
		
		
		//1. 오름차순 정렬 후 뒤에서 출력
		int[] arr = {34,5,35,35,3};

		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.println(arr[i]);
		}

		 

		//2. Integer 배열 사용

		//Collections.reverseOrder() 사용 가능.

		Integer[] arr2 = {34,5,35,35,3};

		Arrays.sort(arr2, Comparator.reverseOrder());

		System.out.println(Arrays.toString(arr));

		 

		//3. stream 스타일로 조금 깔끔하게
		int[] arr3 = {34,5,35,35,3};
		Arrays.stream(arr3)
		      .boxed()
		      .sorted((a, b) -> b - a)
		      .forEach(System.out::println);

	}

}
