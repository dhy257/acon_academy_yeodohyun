package day1prac.제네릭클래스;

import java.util.ArrayList;

public class ArrayList노제네릭버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add(new Score("홍길동", 99, 100));
		list.add(new Score("김길동", 100, 99));
//		list.add("hello");

		for (int i = 0; i < list.size(); i++) {
			Object item = list.get(i);

			Score scoreItem = (Score) item;
			System.out.println(scoreItem.getName());
		}
		
		// 제네릭클래스
		// 컴파일타임에 타입체크 해줌
		// 다운캐스팅을 해줌 => 불편함 해소
		
		
		
		
	}

}
