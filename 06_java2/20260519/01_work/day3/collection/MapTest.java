package day3.collection;
 
import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
 
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		//map 
		//key, value 형태로 데이터를 저장하는 자료구조이다.  
		
		Map<String, String > map = new HashMap<>();		
		map.put( "key1", "내용1");
		map.put( "key2", "내용2");
		map.put( "key3", "내용3");
			
		
		String  valueKey  = map.get("key1");
		System.out.println( valueKey);
		
		
		//키만
 		Set <String> keys = map.keySet();		
 		keys.forEach( item -> System.out.println( item));
		 
 		
 		//
 		map.values().forEach( item    -> System.out.println( item));
 	 
 	 
 		
		//map데이터 전체 순회하기		
		// Entry클래스는  map 요소 하나를 객체화 할 수 있는 클래스 
		for (  Map.Entry<String, String> entry : map.entrySet()) {			
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }		
		
		
		//ForEach 사용하기		
		map.forEach( ( key, value) ->  System.out.println( key  +  value));

	}

}
