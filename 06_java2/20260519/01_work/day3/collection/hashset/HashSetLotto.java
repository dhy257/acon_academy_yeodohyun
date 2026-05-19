package day3.collection.hashset;
import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		
	 
		
		//자바에서  Set은 기본적으로 순서를 보장하지 않기 때문에, 
		//정렬하려면 Set을 다른 정렬 가능한 컬렉션으로 변환한 후에 정렬해야 함
		//일반적으로 List로 변환한 후에 정렬합니다.

		List<Integer> list = new ArrayList<>(set);	 
		Collections.sort(list);				 
		System.out.println(list);
	}
}
