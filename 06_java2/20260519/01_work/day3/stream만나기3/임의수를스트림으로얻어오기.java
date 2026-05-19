package day3.stream만나기3;

import java.util.Random;
import java.util.stream.IntStream;

public class 임의수를스트림으로얻어오기 {

	public static void main(String[] args) {
		 
		//IntStream ran =new Random().ints(1,45);  // 1~44사이의 무작위 수  생성 , 무한스트림 생성됨 , limit과 함께 사용함 
		//ran.forEach( n -> System.out.println( n));
		
		
		IntStream ran2 =new Random().ints(1,45).limit(6);   
		ran2.forEach( n -> System.out.println( n));
		
	}

}
