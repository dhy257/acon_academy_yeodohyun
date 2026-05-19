package day3.stream만나기3;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 배열스트림얻어오기 {

	public static void main(String[] args) {
		
		//기본형배열 기본형 스트림으로 얻어오기		
		//IntStream => 기본형스트림
		//Stream<Integer> -> IntStream  (기본형일 경우 성능상 유리함 : 기본형스트림을 사용하는 이유 )
		 
		
		//1. 정수형스트림
		int[] intArray = {1, 2, 3};
		IntStream intStream = Arrays.stream(intArray);
		
				
		
		//2. 실수형스트림
		double[] doubleArray = { 15.2 , 23.2,10.6};
		
		DoubleStream   doubleStream =Arrays.stream(doubleArray);		
	    doubleStream.filter(  su -> su>=15.0).forEach( su ->System.out.println( su));
		
		 
	    
	    //3.객체배열  스트림으로 얻어오기
	    //Stream<type> 
	    String[] stringArray = {"A", "B", "C"};

        Stream<String> strStream =
                Arrays.stream(stringArray);
        
        

        Acorn[] list = {
                new Acorn("id1", "1234", "김민경"),
                new Acorn("id2", "0000", "송주창"),
                new Acorn("id3", "5678", "이정하"),
                new Acorn("id4", "1234", "엄진희"),
                new Acorn("id5", "9999", "김철수")
        };

        Stream<Acorn> list2 =
                Arrays.stream(list);

        long cnt = list2
                .filter(item ->
                        item.getName().charAt(0) == '김')
                .count();

        System.out.println(cnt);

    }
	   

 

}
