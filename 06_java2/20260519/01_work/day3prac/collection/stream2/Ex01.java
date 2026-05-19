package day3prac.collection.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 스트림에서 map은 변환 하기

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("a1", "고지연", "1234"));
		list.add(new Acorn("a2", "김민정", "99999"));
		list.add(new Acorn("a3", "이현겸", "6161"));
		list.add(new Acorn("a4", "박세인", "8181"));
		list.add(new Acorn("a5", "여도현", "7575"));

		// Acorn -> AcornDTO 리스트 만들기
		List<AcornDTO> listdto = list.stream().map(acorn -> new AcornDTO(acorn.getId(), acorn.getName()))
				.collect(Collectors.toList());
		System.out.println(listdto);

		// 스트림 아닌 방식
		ArrayList<AcornDTO> acornDTOList = new ArrayList<AcornDTO>();
		for (Acorn acorn : list) {
			AcornDTO dto = new AcornDTO(acorn.getId(), acorn.getName());
			acornDTOList.add(dto);
		}
		System.out.println(acornDTOList);
	}
}
