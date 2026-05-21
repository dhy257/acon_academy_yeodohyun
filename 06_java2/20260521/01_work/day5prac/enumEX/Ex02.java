package day5prac.enumEX;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		day = DAY.MONDAY;

		// 요일 상수로 다루기
		System.out.println(day); // 가독성 올라감
		day = 21000; // 요일정보가 아닌 다른 값이 들어오는 것을 막을 수 없음

		// enum ( 일~토 정보 나타내기 )
		DAYEnum day2 = null;
		day2 = DAYEnum.FRIDAY; // 가독성, 안정성

		for (DAYEnum d : DAYEnum.values()) {
			System.out.println(d.name());
		}
	}

}
