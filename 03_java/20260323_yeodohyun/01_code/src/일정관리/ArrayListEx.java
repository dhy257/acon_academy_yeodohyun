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
		// 순서, 중복 허용
		// 가변길이배열처럼 사용
		// add, get(index), remove
		ArrayList<Day> days = new ArrayList<Day>();
		
		// 등록
		Day day1 = new Day("myArrays 연습","오후 8시");
		days.add(day1);
		Day day2 = new Day("운동","오후 9시");
		days.add(day2);
		
		// 조회
		for(int i=0;i<days.size();i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		
		// 변경
		Day updateDay = days.get(1);
		updateDay.setName("변경된 운동");
		updateDay.setTime("오후 9시 30분");
		
		// 조회
		for(int i=0;i<days.size();i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		// 삭제
		days.remove(1);
		
		// 조회
		for(int i=0;i<days.size();i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		
	}

}
