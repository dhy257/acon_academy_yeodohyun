package day3.stream만나기;

import java.util.Arrays;

public class 스트림으로홀수의합 {

	public static void main(String[] args) {
		 
		
		//int[]형 배열로 부터 스트림을 얻어온 다음 중간연산과 최종연산을 사용하여 합계 구하기
		int[] arr= {1,2,3,4,5};		
		int sum =  Arrays.stream(arr).filter( n -> n%2 ==1).sum();
		 
		
		//
		int total=0;
		for( int num : arr) {
			
			if( num % 2 ==1) {
				total += num;
			}			
		}
		
		
		System.out.println("홀수합" + sum);
		System.out.println("홀수합" + total);
		
	}

}
