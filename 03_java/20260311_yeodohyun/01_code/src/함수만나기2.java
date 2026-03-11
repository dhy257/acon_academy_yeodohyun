import java.util.Arrays;

public class 함수만나기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };

		cafe_names();
		String[] result = cafe_names2();
		System.out.println(Arrays.toString(result));
		result = cafe_names3(2);
		System.out.println(Arrays.toString(result));
	}

	// 기능: 카페이름정보 출력하기
	// 입력: 매개변수
	// 반환:
	public static void cafe_names() {
//		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };
		String[] cafe = cafe_names2();
		for (int i = 0; i < cafe.length; i++) {
			System.out.println(cafe[i]);
		}
	}

	// 기능: 카페이름정보 제공하기
	// 입력: 매개변수 x
	// 반환: 카페이름배열
	public static String[] cafe_names2() {
		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };

		return cafe;
	}

	// 기능: 카페이름정보 여러개 제공하기
	// 입력: 매개변수 / 원하는 갯수
	// 반환: 카페이름배열
	public static String[] cafe_names3(int cnt) {
		String[] cafe = cafe_names2();
		String[] result = new String[cnt];

		for (int i = 0; i < cnt; i++) {
			result[i] = cafe[i];
		}

		return result;

	}

}
