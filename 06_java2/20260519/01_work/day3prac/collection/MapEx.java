package day3prac.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();

		map.put("카카오", "카카오 비밀번호");
		map.put("네이버", "네이버 비밀번호");
		map.put("구글", "구글 비밀번호");

		String 비밀번호1 = map.get("카카오");
		System.out.println(비밀번호1);

		// 키만
		Set<String> keys = map.keySet();

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		// forEach 사용하기
		keys.forEach((item) -> {
			System.out.println(item);
		});

		// 값만 가져오기 오류

		/*
		 * Set<String> values = (Set<String>) map.values(); values.forEach((item) -> {
		 * 
		 * System.out.println(item); }); Java의 HashMap에서 key(키)는 중복될 수 없기 때문에
		 * map.keySet()은 Set 구조를 반환합니다.
		 * 
		 * 하지만 value(값)는 중복이 가능합니다. 중복을 허용해야 하기 때문에 map.values()는 Set이 아니라 Collection
		 * 타입(구체적으로는 내부 클래스인 HashMap$Values)을 반환합니다.
		 * 
		 * Collection은 Set처럼 데이터의 고유성(중복 방지)을 보장하지 않으므로, Collection 타입을 Set으로 강제
		 * 형변환(Casting)하려고 하면 컴퓨터가 안전하지 않다고 판단해 에러를 던지는 것입니다. 방법 1: 데이터 타입을 Collection으로
		 * 변경 방법 2: Set으로 새로 생성 (중복 제거가 필요한 경우) 방법 3: 한 줄로 바로 출력 (가장 간결함)
		 */

		// 값만 가져오기
		Collection<String> values = map.values();

		values.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});

		// 키, 값 => Entry 세트로 다루기
		// entrySet()

		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ":" + value);
		}

		map.forEach((key, value) -> {
			System.out.println(key + "::" + value);
		});

	}
}
