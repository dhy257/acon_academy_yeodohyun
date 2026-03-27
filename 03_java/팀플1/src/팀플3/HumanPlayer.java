package 팀플3;

import java.util.Scanner;

public class HumanPlayer implements Player {
	private final String name;
	private final Piece piece;
	private final Scanner sc;

	public HumanPlayer(String name, Piece piece, Scanner sc) {
		this.name = name;
		this.piece = piece;
		this.sc = sc;
	}

	@Override
	public Position getMove(Board board, OthelloRuleEngine engine) {
		while (true) {
			try {
				System.out.println(name + " 차례 (" + piece + ")");
				System.out.print("행 열 입력 (예: 2 3): ");

				int row = sc.nextInt();
				int col = sc.nextInt();

				Position pos = new Position(row, col);

				// 둘 수 있는 자리면 반환함
				if (engine.canPlace(board, pos, piece)) {
					return pos;
				}

				System.out.println("둘 수 없는 위치입니다. 다시 입력하세요.");
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine(); // 잘못된 입력 비움
			}
		}
	}

	@Override
	public Piece getPiece() {
		return piece;
	}

	@Override
	public String getName() {
		return name;
	}
}