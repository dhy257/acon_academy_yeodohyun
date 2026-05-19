package day3.stream만나기3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import java.util.stream.Stream;

public class 스트림생성하기예제 {

	public static void main(String[] args) {
		 
		
		//컬렉션 스트림으로
	    ArrayList<String> names = new ArrayList<>();
        names.add("딸기");
        names.add("포도");
        names.add("감");
        names.add("사과");
        
        // 스트림 생성  
	    Stream <String>  streamName=  names.stream() ;
		 
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 스트림 생성  
        Stream <Integer> streamNumber = numbers.stream() ;

	   
		//배열을 스트림으로
		Stream<String> strStream = Stream.of("a","b","c");
		Stream<String> strStream2=  Stream.of( new String[] {"a","b","c"});
		Stream<String> strStream3  = Arrays.stream(new String[] {"a","b","c"} );
		
		
		
	}

}
