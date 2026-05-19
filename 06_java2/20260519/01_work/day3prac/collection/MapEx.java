package day3prac.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		keys.forEach((item) -> {
			System.out.println(item);
		});

	}

}
