package day3prac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복되지 않는 데이터를 유지하고 싶을 때
		Set<String> set = new HashSet<>();
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("복숭아");

		// 반복자 Iterator 사용
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		//
		Set<Moving> set2 = new HashSet<>();
		set2.add(new Moving("장주원", "구룡포", 100));
		set2.add(new Moving("장주원", "구룡포", 100));
		set2.add(new Moving("이미현", "경기", 80));
		set2.add(new Moving("김두식", "문산", 90));
		set2.add(new Moving("장주원", "봉평", 88)); // 해시코드도 같고 equals의 값도 true이므로 추가되지 않음

		Iterator<Moving> it2 = set2.iterator();
		while (it2.hasNext()) {
			Moving m = it2.next();
			System.out.println(m);
		}
		
		// equals 오버라이딩
		// hashCode 오버라이딩

	}

}
