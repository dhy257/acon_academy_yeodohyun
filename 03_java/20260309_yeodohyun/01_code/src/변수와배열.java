
public class 변수와배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 5개
		// int, double, char, boolean: 기본자료형
		// String: 문자열

		// 변수 5개: 변수 5개는 개별적으로 공간에 확보됨, 변수이름으로 접근한다, 반복문 사용 못함
		// 배열(5개): 연속적으로 공간확보, 기준(배열이름)으로 부터 인덱스에 접근한다
		// 인덱스의 의미: 기준(배열이름)으로부터 크기(자료형)만큼 떨어진 위치

		// 문자열 5개 사용
		String name1 = "장윤성";
		String name2 = "엄진희";
		String name3 = "이정하";
		String name4 = "정철진";
		String name5 = "김재민";

		// 변수는 반복문 사용 불가
		// 변수는 접근시 반드시 변수이름으로만 접근 가능
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
//		System.out.println(name4);
//		System.out.println(name5);

		// 배열을 사용하여 이름 출력
		// 배열을 만들 때는 반드시 크기를 알아야 한다
		String[] names = new String[5];
		// String[] names = {"문자열","문자열"....}; // 배열 선언 및 초기화
		// String[] names = new String[]{"문자열","문자열"....};
		names[0] = "장윤성";
		names[1] = "엄진희";
		names[2] = "이정하";
		names[3] = "정철진";
		names[4] = "김재민";

//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);

		// 인덱스(첨자)는 벼수를 사용할 수 있음
		// 배열을 출력한 코드는 반복문 사용 가능

		for (int i = 0; i < 5; i++)
			System.out.println(names[i]);

	}

}
