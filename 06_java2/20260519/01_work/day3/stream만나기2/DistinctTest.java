package day3.stream만나기2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctTest {

	public static void main(String[] args) {
	 
				ArrayList<String> fruits = new ArrayList<>();
		        fruits.add("사과");
		        fruits.add("바나나");
		        fruits.add("오렌지");
		        fruits.add("딸기");
		        fruits.add("포도");
		        fruits.add("사과");
		        fruits.add("망고");
		        fruits.add("딸기");
		        fruits.add("바나나");

		        
		        System.out.println("과일 목록:");
		        fruits.forEach(System.out::println);
		  
		        
		        // distinct()를 사용하여 중복 제거
	            Stream <String>  list    = fruits.stream();		           
                list.distinct().forEach( s ->System.out.println(s) ); 
                
                
                list    = fruits.stream();		
                List<String> result=  list.collect(Collectors.toList());

                System.out.println("\n중복 제거된 과일 목록:");
                result.forEach(s -> System.out.println(s));

		        // 랜덤으로 선택된 과일 출력
		        Random random = new Random();
		        String randomFruit = result.get(random.nextInt(result.size()));
		        System.out.println("\n랜덤으로 선택된 과일: " + randomFruit);

	}

}
