package day3.stream만나기3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class 컬렉션을스트림으로만들기2 {

	public static void main(String[] args) {
		 
		    //key, value  => 한 쌍으로 데이터 표현
		    Map<String, Integer> scores = new HashMap<>();
	        scores.put("정국", 85);
	        scores.put("뷔", 92);
	        scores.put("진", 78);
	        scores.put("슈가", 90);
	        scores.put("RM", 88);
	        scores.put("제이홉", 95);
	        
	        

	        // 1. entrySet()을 이용해 키와 값을 함께 처리
	        System.out.println("키와 값 출력:");
	        scores.entrySet().stream()
	            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	        // 2. keySet()을 이용해 키만 처리
	        System.out.println("\n키 출력:");
	        scores.keySet().stream()
	            .forEach( key  -> System.out.println( key));

	        // 3. values()를 이용해 값만 처리
	        System.out.println("\n값 출력:");
	        scores.values().stream()
	            .forEach( value -> System.out.println( value));

	        // 4. 특정 조건으로 필터링한 후 새로운 Map으로 수집
	        Map<String, Integer> 성적리스트 = scores.entrySet().stream()
	            .filter(entry -> entry.getValue() >= 90)  // 점수가 90 이상인 경우 필터링
	            .collect(Collectors.toMap( entry -> entry.getKey(), entry -> entry.getValue())); // 다시 Map으로 수집

	        System.out.println("\n점수가 90 이상인 학생들:");
	        성적리스트.forEach((name, score) -> System.out.println(name + ": " + score));
		

	}

}
