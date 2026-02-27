import java.util.Scanner;

public class 문제1양동이 {
	public static void main(String[] args) {
		int bigPail = 0; // 5리터 양동이
		int smallPail = 0; // 3리터 양동이

		Scanner sc = new Scanner(System.in);

		System.out.println("=== 4리터 만들기 게임 ===");
		System.out.println("5리터와 3리터 양동이를 사용해 정확히 4리터를 제출하세요.");

		while (true) {
			System.out.println("\n----------------------------");
			System.out.printf("현재 상태: 큰 양동이(5L): %dL | 작은 양동이(3L): %dL\n", bigPail, smallPail);
			System.out.println("1. 큰 채우기 | 2. 작은 채우기 | 3. 큰 비우기 | 4. 작은 비우기");
			System.out.println("5. 큰 -> 작은 옮기기 | 6. 작은 -> 큰 옮기기 | 7. 제출하기");
			System.out.print("선택: ");

			String choice = sc.next();

			switch (choice) {
			case "1":
				bigPail = 5;
				break;
			case "2":
				smallPail = 3;
				break;
			case "3":
				bigPail = 0;
				break;
			case "4":
				smallPail = 0;
				break;
			case "5": // 큰 -> 작은
				int transferToSmall = Math.min(bigPail, 3 - smallPail);
				bigPail -= transferToSmall;
				smallPail += transferToSmall;
				break;
			case "6": // 작은 -> 큰
				int transferToBig = Math.min(smallPail, 5 - bigPail);
				smallPail -= transferToBig;
				bigPail += transferToBig;
				break;
			case "7":
				System.out.print("어느 양동이를 제출하시겠습니까? (5 또는 3 입력): ");
				int amount = sc.nextInt();
				int selectedValue = (amount == 5) ? bigPail : (amount == 3) ? smallPail : 0;

				if (selectedValue == 4) {
					System.out.println("축하합니다! 4리터 제출 완료. 미션 성공!");
					sc.close();
					// while 종료
					return;
				} else {
					System.out.println("제출 실패! 현재 " + selectedValue + "리터입니다. 다시 시도하세요.");
				}
				break;
			default:
				System.out.println("1~7 사이의 번호를 입력해주세요.");
			}
		}
	}
}