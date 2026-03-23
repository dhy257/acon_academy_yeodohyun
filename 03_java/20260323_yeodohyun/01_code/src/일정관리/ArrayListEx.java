package 일정관리;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일정을 저장할 수 있는 변수를 만들어 보세요
		Day day;
		day = new Day(); // 생성자 호출
		
		// 일정조회
		System.out.println(day);
//		System.out.println(day.toString());
		
		// 일정변경
		day.setName("자바 인터페이스");
		day.setTime("오후 8시 30분");
		
		// 일정조회
//		System.out.println(day);
		System.out.println(day.toString());
		
		// 일정 여러개
		ArrayList<Day> days = new ArrayList<Day>();
		
		// 등록
		Day day0323 = new Day("myArrays 연습","오후 8시");
		days.add(day0323);
		
		// 조회
		for(int i=0;i<days.size();i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		
		// 변경
		
		
		// 삭제
		
		
		
	}

}
