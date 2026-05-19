package day3.stream만나기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class 스트림맛보기 {

	public static void main(String[] args) {
		String[] stringArray = {"딸기", "포도", "사과"};			 
		Stream<String> stream2    = Arrays.stream(stringArray);
		 
		//정렬하고 출력하기 !!		
		stream2.sorted().forEach( s -> System.out.println( s));
	   
		ArrayList<String> stringList = new ArrayList<>();
        stringList.add("딸기");
        stringList.add("포도");
        stringList.add("사과");
       
      
        //정렬하고 출력하기 !!
       Stream<String> stream = stringList.stream();
       
        stream.sorted().forEach(s -> System.out.println(s));

	}

}
