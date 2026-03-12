package 실습_여도현;

import java.util.Random;
import java.util.Scanner;

public class Upgrade {
	
	// 1. startGame - 게임시작, 각종초기세팅
	// 2. initItem - 아이템 초기화
	// 3. gaemLoop - 게임반복(MAX아니면 반복)
	// 4. askUpgrade - 강화할지 묻기(y만 return)
	// 5. upgradeItem - 강화

	public static void main(String[] args) {
		// 게임시작
		// jar 사용시 Upgrade.main(args); 만 사용해도됨
		startGame();
	}

	// 1. 게임 시작
	public static void startGame() {

		// 입력
		Scanner sc = new Scanner(System.in);

		// 아이템 초기화
		Item item = initItem();

		// 반복 시작
		gameLoop(sc, item);

		// MAX일때 출력
		if (item.level == item.maxLevel) {
			System.out.println("MAX 강화 완료!");
		}

		sc.close();
	}

	// 2. 아이템 초기화
	public static Item initItem() {

		// 객체 할당(Item.java)
		Item item = new Item();

		// 값 초기화
		item.name = "전설의 검";
		item.level = 0;
		item.maxLevel = 10;

		return item;
	}

	// 3. 게임 반복
	public static void gameLoop(Scanner sc, Item item) {

		// MAX아니면 반복
		while (item.level < item.maxLevel) {

			System.out.println("현재 강화 단계 : +" + item.level);

			// 강화 y 말고 싸그리 아웃
			if (!askUpgrade(sc)) {
				System.out.println("강화를 종료합니다.");
				break;
			}

			// y면 업그레이드
			upgradeItem(item);

			System.out.println();
		}
	}

	// 강화 여부 질문
	public static boolean askUpgrade(Scanner sc) {

		System.out.print("강화 하시겠습니까? (원하면 y, 아니면 아무 키나 눌러주세요.) : ");
		String answer = sc.next();

		// y만 반환함
		return answer.equals("y");
	}

	// 강화 로직
	public static void upgradeItem(Item item) {

		// 강화 확률은 100에서 10씩 줄어듬
		int successRate = 100 - (item.level * 10);

		// 1~100
		Random r = new Random();
		int chance = r.nextInt(100) + 1;

		System.out.println(item.name + " 강화 시도 (현재 +" + item.level + ")");
		System.out.println("성공 확률 : " + successRate + "%");
		System.out.println("랜덤 값 : " + chance);

		// 강화확률안에 랜덤수가 들어오면
		// 90퍼 면 1~90안에 들어와야함
		if (chance <= successRate) {
			System.out.println("강화 성공!");
			item.level++;
		} else {
			System.out.println("강화 실패...");
		}
	}
}