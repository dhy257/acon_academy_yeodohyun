package 실습_여도현;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("======== 생성자 호출 ========");

		// 1. 업캐스팅: 자식 객체 => 부모 타입
		Coffee[] arr = new Coffee[2];
		arr[0] = new Drip(); // Drip => Coffee (업캐스팅)
		arr[1] = new Espresso(); // Espresso => Coffee (업캐스팅)

		System.out.println("=== 배열 반복 + 다형성 호출 ===");
		for (int i = 0; i < arr.length; i++) {
			Coffee coffee = arr[i];

			// 오버라이딩된 coffee() 호출
//			coffee.coffee();

			// 다운캐스팅은 coffeeDivide에서 처리
			coffeeDivide(coffee);

			System.out.println("------------");
		}

		// 2. 매개변수 다형성 활용 (개별 객체)
		System.out.println("=== coffeeDivide 개별 호출 ===");
		coffeeDivide(new Drip());
		coffeeDivide(new Espresso());

		// 3. 잘못된 다운캐스팅 예제
		System.out.println("=== 잘못된 다운캐스팅 ===");
		Coffee wrongCoffee = new Drip(); // Drip 객체
		try {
			// Drip → Espresso 변환 시도 => 런타임 에러
			Espresso wrongEspresso = (Espresso) wrongCoffee; // 실행 시 ClassCastException
			// wrongEspresso.Extraction();
		} catch (ClassCastException e) {
			System.out.println("에러문구: " + e);
		}
	}
	
/*
//	public static void dripCoffee(Drip coffee) {
//		coffee.coffee();
//		coffee.Brewing();
//	}
//
//	public static void extractCoffee(Espresso coffee) {
//		coffee.coffee();
//		coffee.Extraction();
//	}
*/
	
	// 업캐스팅
	public static void coffeeDivide(Coffee coffee) {
		// 오버라이딩된 coffee() 호출
		coffee.coffee(); // 여기선 Brewing, Extraction 안뜸 : Coffee엔 없음
		// instanceof + 다운캐스팅
		// 다운캐스팅을 함으로써 Brewing, Extraction가 뜸
		if (coffee instanceof Drip) {
			((Drip) coffee).Brewing();
		} else if (coffee instanceof Espresso) {
			((Espresso) coffee).Extraction();
		}
	}

}
