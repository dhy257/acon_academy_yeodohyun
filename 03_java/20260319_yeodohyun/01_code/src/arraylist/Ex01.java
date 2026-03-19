package arraylist;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체배열 대신에 ArrayList 사용하기

		// 순서가 있다
		// 중복된 데이터 저장 가능
		// 배열과 같은구조라고 생각하면됨

		ArrayList list = new ArrayList();
		list.add(new Score("김민경", 100, 100)); // Object 로 저장
		list.add(new Score("송주창", 90, 90));
		list.add(new Score("정철진", 80, 90));
		list.add(new Score("김재민", 90, 100));

		for (int i = 0; i < list.size(); i++) {
			Object item = list.get(i); // Object로 꺼내짐
			System.out.println(item); // 다형성
			
			// Score 객체의 고유 기능 사용하려면 다운캐스팅 필요
			Score itemScore = (Score) item; // 원래 Score라 문제없음
			itemScore.printInfo();
		}
	}

}
