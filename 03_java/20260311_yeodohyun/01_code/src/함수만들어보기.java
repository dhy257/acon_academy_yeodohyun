import java.util.Random;
import java.util.Scanner;

public class 함수만들어보기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 강화 레벨 초기화
		int level = 0;
		int MAX = 10;

		// 10강까지 반복
		while (level < MAX) {

			System.out.println("현재 강화 단계 : +" + level);
			System.out.print("강화 하시겠습니까? (y/n) : ");
			String answer = sc.next();

			if (answer.equals("y")) {
				level = upgradeItem(level);
			} else {
				System.out.println("강화를 종료합니다.");
				break;
			}

			System.out.println();
		}

		if (level == MAX) {
			System.out.println("MAX 강화 완료!");
		}

		sc.close();
	}

	// 기능 : 아이템 강화
	// 입력 : 현재 강화 단계 level
	// 반환 : 강화 결과 단계
	public static int upgradeItem(int level) {

		// 강화 성공 확률 100퍼에서 10씩 줄어듬
		int successRate = 100 - (level * 10);

		// 1~100까지 랜덤 수
		Random r = new Random();
		int chance = r.nextInt(100) + 1;

		System.out.println("강화 시도 (현재 +" + level + ")");
		System.out.println("성공 확률 : " + successRate + "%");
		System.out.println("랜덤 값 : " + chance);

		// 강화확률안에 랜덤수가 들어오면
		// 90퍼 면 1~90안에 들어와야함
		if (chance <= successRate) {
			System.out.println("강화 성공!");
			level++;
		} else {
			System.out.println("강화 실패...");
		}

		return level;
	}
}