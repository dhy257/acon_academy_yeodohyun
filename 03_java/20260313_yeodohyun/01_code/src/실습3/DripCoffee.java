package 실습3;

import java.util.Scanner;

public class DripCoffee {

	// 원두, 원두 양, 분쇄도
	String bean;
	int beanAmount;
	int grindSize;

	// 드리퍼, 필터
	String dripper;
	String filter;

	// 물온도
	int waterTemp;

	// 총 사용 물 양, 총 푸어 시간
	int totalWater = 0;
	int totalTime = 0;

	// 푸어를 계속하기 위한 배열(최대20), 푸어 카운트
	int[] pours = new int[20];
	int pourCount = 0;

	Scanner sc = new Scanner(System.in);

	// 1. 콩 선택
	public void selectBean() {
		System.out.print("Select bean: ");
//		this.bean = sc.nextLine();
		bean = sc.nextLine();
	}

	// 2. 콩 양 선택
	public void selectBeanAmount() {
		System.out.print("Bean amount(g): ");
		beanAmount = sc.nextInt();
	}

	// 3. 분쇄도 결정
	public void selectGrindSize() {
		System.out.print("Grind size (0~2000): ");
		grindSize = sc.nextInt();
	}

	// 4. 드리퍼 결정
	public void selectDripper() {
		sc.nextLine();
		System.out.print("Select dripper: ");
		dripper = sc.nextLine();
	}

	// 5. 필터 결정
	public void selectFilter() {
		System.out.print("Select filter: ");
		filter = sc.nextLine();
	}

	// 6. 물온도
	public void selectWaterTemp() {
		System.out.print("Water temperature: ");
		waterTemp = sc.nextInt();
	}

	// 7. 드립 시작
	public void startDrip() {

		System.out.println("=====start drip=====");
		// 반복
		while (true) {
			System.out.println();

			// 푸어 물 양 조정
			System.out.print(pourCount + " Time Pour water(g): ");
			int water = sc.nextInt();

			// 푸어 시간 조정
			System.out.print("Pour time(sec): ");
			int time = sc.nextInt();

			// 총 푸어 양에 합하기
			pours[pourCount] = water;
			pourCount++;

			// 총 물 양, 시간 합하기
			totalWater += water;
			totalTime += time;

			// 푸어를 계속할지 묻기
			System.out.print("Continue pour? (1:yes 0:no): ");
			int stop = sc.nextInt();

			// 0 입력하면 탈출
			if (stop == 0)
				break;
		}
	}

	// 8. 가수할지 묻기
	public void bypassWater() {

		System.out.print("Add extra water? (1:yes 0:no): ");
		int choice = sc.nextInt();

		// 가수하면 총 물 양에 추가
		if (choice == 1) {
			System.out.print("Extra water(g): ");
			int extra = sc.nextInt();
			totalWater += extra;
		}
	}

	// 10. 최종출력
	public void printResult() {

		System.out.println("\n===== DRIP RESULT =====");

		System.out.println("Bean: " + bean);
		System.out.println(beanAmount + "g");
		System.out.println("Dripper: " + dripper);
		System.out.println("Filter: " + filter);
		System.out.println(waterTemp + "℃");
		System.out.println((totalTime / 60) + " min");

		// 레시피 출력
		for (int i = 0; i < pourCount; i++) {
			System.out.print(pours[i]);
			// 맨처음은 : 안쓸거라는 거임
			if (i != pourCount - 1)
				System.out.print(":");
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		DripCoffee coffee = new DripCoffee();
//
//		coffee.selectBean();
//		coffee.selectBeanAmount();
//		coffee.selectGrindSize();
//		coffee.selectDripper();
//		coffee.selectFilter();
//		coffee.selectWaterTemp();
//
//		coffee.startDrip();
//		coffee.bypassWater();
//
//		coffee.printResult();
//	}

}
