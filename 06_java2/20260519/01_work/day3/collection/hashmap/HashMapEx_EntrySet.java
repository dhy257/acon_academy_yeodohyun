package day3.collection.hashmap;
import java.util.*;

class HashMapEx_EntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("구글",  1234);
		map.put("naver", 5678);
		map.put("aws", 1001);
	 
		
		
		 
		
		
		/*class HashMap {		
		 *  Object[] key 
		 *  Object[] value
		 */
		
		
		//=> 아래와 같이  key와 value가 하나의 Entry 클래스로 되어 있음 
		 /*class HashMap{  
		  *    Entry table[];
		  *    
		  *    class Entry {         //innerClass  ( Entry는 HashMap과 깊은 관련 !!)
		  *       Object key ;
		  *       Object value;		    
		  *    }		   
		  } */

		 
		//map의 모든 키-값 쌍을 포함하는 Set을 얻기 위해 entrySet() 메소드를 사용   Entry객체로 만들어줌 
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("사이트 : "+ e.getKey() + ", 비번 : " + e.getValue());
		} 		
		
		//  map 요소 출력하기
		map.forEach( ( key,value) -> System.out.println( "사이트:" + key + " ,  비번:" + value));
		
		
		
		
		for(   Map.Entry<String, Integer> item   : map.entrySet()) {
			
			String key =item.getKey();
			Integer value  =item.getValue();
			
			System.out.println("사이트 : "+ key + ", 비번 : " + value);
		}

	 
	}
}
