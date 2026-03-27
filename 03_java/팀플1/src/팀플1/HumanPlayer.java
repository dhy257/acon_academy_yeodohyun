package 팀플1;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, Stone stone) {
		super(name, stone);
	}

	@Override
	public Position chooseMove(Board board, Scanner scanner) {
		List<Position> validMoves = board.getValidMoves(getStone());

		while (true) {
			System.out.println(getName() + "의 턴입니다. 돌: " + getStone().getSymbol());
			System.out.println("가능한 위치:");

			for (int i = 0; i < validMoves.size(); i++) {
				System.out.println((i + 1) + ". " + validMoves.get(i));
			}

			System.out.print("번호를 선택하세요: ");
			String input = scanner.nextLine().trim();

			if (input.isEmpty()) {
				System.out.println("입력이 비어 있습니다. 다시 입력하세요.");
				continue;
			}

			try {
				int choice = Integer.parseInt(input);

				if (choice < 1 || choice > validMoves.size()) {
					System.out.println("범위를 벗어난 번호입니다. 다시 입력하세요.");
					continue;
				}

				return validMoves.get(choice - 1);

			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해야 합니다.");
			}
		}
	}
}