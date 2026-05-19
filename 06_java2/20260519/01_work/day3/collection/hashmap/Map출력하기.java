package day3.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map출력하기 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김자바",  90);
		map.put("김자바", 100);   
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		 
		//1. keySet()을 사용한 방법
		
		System.out.println( "1==>>");  
		for (String key : map.keySet()) {
		    System.out.println(key + " : " + map.get(key));
		}
		
		//2.entrySet()을 사용한 방법
		
		System.out.println( "2==>>");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		//3.forEach()  
		map.forEach( (key,value) -> System.out.println( key + value));
		
		
		// 4.
		map.entrySet().stream()
	    .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		
		
		//5. 
	 
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Map.Entry<String, Integer> entry = iterator.next();
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		 
		 

		
	}

}
