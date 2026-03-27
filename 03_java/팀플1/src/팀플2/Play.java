package 팀플2;

import java.util.Scanner;

public class Play {

	public void run() {
		Scanner sc = new Scanner(System.in);

		Board board = new Board();
		GameRule rule = new GameRule();
		BoardPrinter printer = new BoardPrinter();

		Player human;
		Player computer;

		while (true) {
			try {
				System.out.print("색 선택 (1: BLACK / 2: WHITE): ");
				int choice = sc.nextInt();

				if (choice == 1) {
					human = new HumanPlayer("사람", Piece.BLACK, sc);
					computer = new ComputerPlayer("컴퓨터", Piece.WHITE);
					break;
				} else if (choice == 2) {
					human = new HumanPlayer("사람", Piece.WHITE, sc);
					computer = new ComputerPlayer("컴퓨터", Piece.BLACK);
					break;
				} else {
					System.out.println("1 또는 2만 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
			}
		}

		Player currentPlayer =
				(human.getPiece() == Piece.BLACK) ? human : computer;

		while (!rule.isGameOver(board)) {

			// 출력은 printer가 담당
			printer.print(board, rule, currentPlayer.getPiece());

			System.out.println(
					"BLACK(●): " + board.countPiece(Piece.BLACK) +
					" / WHITE(○): " + board.countPiece(Piece.WHITE)
			);
			System.out.println();

			if (rule.hasMove(board, currentPlayer.getPiece())) {
				Position move = currentPlayer.getMove(board, rule);

				if (move != null) {
					rule.applyMove(board, move, currentPlayer.getPiece());
				}
			} else {
				System.out.println(currentPlayer.getName() + "는 둘 수 있는 곳이 없어 패스합니다.");
			}

			currentPlayer = (currentPlayer == human) ? computer : human;
		}

		// 최종 출력
		printer.print(board);

		int black = board.countPiece(Piece.BLACK);
		int white = board.countPiece(Piece.WHITE);

		System.out.println("게임 종료");
		System.out.println("BLACK(●): " + black);
		System.out.println("WHITE(○): " + white);

		if (black > white) {
			System.out.println("BLACK 승리");
		} else if (white > black) {
			System.out.println("WHITE 승리");
		} else {
			System.out.println("무승부");
		}

		sc.close();
	}
}