package day3prac.collection.stream3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("고지연", 89));
		list.add(new Acorn("김민정", 99));
		list.add(new Acorn("이현겸", 61));
		list.add(new Acorn("박세인", 81));
		list.add(new Acorn("여도현", 75));

		// 1. 80이상인 학생 출력하기
		list.stream().filter(item -> item.getScore() >= 80).forEach(item -> System.out.println(item));
		// 2. 80이상인 인원수 구하기
		long cnt = list.stream().filter(item -> item.getScore() >= 80).count();
		System.out.println(cnt);
		// 3. 80이상인 학생만 리스트로 만들기
		List<Acorn> list2 = list.stream().filter(item -> item.getScore() >= 80).toList();
		System.out.println(list2);
		// 4. Acorn리스트에서 이름리스트로 변환하기
		List<String> list3 = list.stream().map(item -> item.getName()).toList();
		System.out.println(list3);
		// 5. 성적순으로 정렬하고 출력하기
		System.out.println("성적순");
		list.stream().sorted((t1, t2) -> t1.getScore() - t2.getScore()).forEach(item -> System.out.println(item));

		list.stream().sorted(Comparator.<Acorn, Integer>comparing(item -> item.getScore()))
				.forEach(item -> System.out.println(item));

		// 이름순
		System.out.println("이름순");
		list.stream().sorted(Comparator.<Acorn, String>comparing(item -> item.getName()))
				.forEach(item -> System.out.println(item));
		// 6. 키(이름), 값(성적)
		System.out.println("키, 값");
		Map<String, Acorn> map = list.stream().collect(Collectors.toMap(item -> item.getName(), item -> item));
		System.out.println("여도현 찾기");
		Acorn a = map.get("여도현");
		System.out.println(a);
		System.out.println(map);
	}

}
