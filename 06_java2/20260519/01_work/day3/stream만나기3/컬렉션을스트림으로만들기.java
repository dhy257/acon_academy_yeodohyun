package day3.stream만나기3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 컬렉션을스트림으로만들기 {

	public static void main(String[] args) {
		 
		    Set<String> names = new HashSet<>();
		    
	        names.add("apple");
	        names.add("banana");
	        names.add("cherry");
	        names.add("watermelon");  

	        
	        // Set에서 스트림 얻기
	        names.stream()
	            .forEach( s -> System.out.println( s)); // 각 요소를 출력

	      
	        
	        List<String> 대문자이름 = names.stream()
	            .map( s -> s.toUpperCase())    
	            .collect(Collectors.toList());  

	        System.out.println(대문자이름);
		

	}

}
