package day3prac.collection.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("a1", "고지연", "1234"));
		list.add(new Acorn("a2", "김민정", "99999"));
		list.add(new Acorn("a3", "이현겸", "6161"));
		list.add(new Acorn("a4", "박세인", "8181"));
		list.add(new Acorn("a5", "여도현", "7575"));

		// ArrayList<Acorn> -> List<String> 변환 후 출력
		list.stream().map(item -> item.getName()).forEach(str -> System.out.println(str));

		// ArrayList<Acorn> -> List<String> 변환
		List<String> listName = list.stream().map(item -> item.getName()).toList();
		System.out.println(listName);
		
		// 비번빼오기
		List<String> listpw =list.stream().map(item -> item.getPw()).collect(Collectors.toList());
		System.out.println(listpw);
	}

}
