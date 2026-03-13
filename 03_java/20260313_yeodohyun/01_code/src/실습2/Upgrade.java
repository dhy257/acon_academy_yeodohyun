package 실습2;

import java.util.Random;
import java.util.Scanner;

public class Upgrade {

	public static void main(String[] args) {
		startGame();
	}

	// 게임 시작
	public static void startGame() {

		Scanner sc = new Scanner(System.in);

		Item item = initItem();

		gameLoop(sc, item);

		if (item.getLevel() == item.getMaxLevel()) {
			System.out.println("MAX 강화 완료!");
		}

		sc.close();
	}

	// 아이템 초기화
	public static Item initItem() {

		Item item = new Item("전설의 검", 0, 10);

		return item;
	}

	// 게임 반복
	public static void gameLoop(Scanner sc, Item item) {

		while (item.getLevel() < item.getMaxLevel()) {

			System.out.println("현재 강화 단계 : +" + item.getLevel());

			if (!askUpgrade(sc)) {
				System.out.println("강화를 종료합니다.");
				break;
			}

			upgradeItem(item);

			System.out.println();
		}
	}

	// 강화 여부 질문
	public static boolean askUpgrade(Scanner sc) {

		System.out.print("강화 하시겠습니까? (y 입력) : ");
		String answer = sc.next();

		return answer.equals("y");
	}

	// 강화 로직
	public static void upgradeItem(Item item) {

		int successRate = 100 - (item.getLevel() * 10);

		Random r = new Random();
		int chance = r.nextInt(100) + 1;

		System.out.println(item.getName() + " 강화 시도 (현재 +" + item.getLevel() + ")");
		System.out.println("성공 확률 : " + successRate + "%");
		System.out.println("랜덤 값 : " + chance);

		if (chance <= successRate) {
			System.out.println("강화 성공!");
			item.levelUp();
		} else {
			System.out.println("강화 실패...");
		}
	}
}
