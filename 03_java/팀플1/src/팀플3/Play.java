package 팀플3;

import java.util.Scanner;

public class Play {

	public void run() {
		Scanner sc = new Scanner(System.in);

		Board board = new Board();
		OthelloRuleEngine engine = new OthelloRuleEngine();
		BoardPrinter printer = new BoardPrinter();

		Player human;
		Player computer;

		// 사람 플레이어 색 선택
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

		// 흑이 선공
		Player currentPlayer = (human.getPiece() == Piece.BLACK) ? human : computer;

		// 양쪽 플레이어(흑, 백) 모두 더 이상 둘 수 있는 자리가 없을 때 게임이 끝남
		// hasAnyValidMove는 해당 색의 플레이어가 현재 보드에서 둘 수 있는 자리가
		// 하나라도 있으면 true, 없으면 false를 반환함
		// 따라서 둘 중 한 명이라도 둘 수 있으면 게임을 계속 진행해야 하므로 || 사용
		while (engine.hasAnyValidMove(board, Piece.BLACK) || engine.hasAnyValidMove(board, Piece.WHITE)) {

			// 현재 차례인 플레이어 기준으로
			// 보드 상태와 착수 가능한 위치(*)를 함께 출력함
			printer.printBoard(board, engine, currentPlayer.getPiece());

			// 현재 보드의 점수(흑돌 개수, 백돌 개수)를 출력함
			System.out.println(
					"BLACK(●): " + board.countPiece(Piece.BLACK) + " / WHITE(○): " + board.countPiece(Piece.WHITE));
			System.out.println();

			// 현재 차례인 플레이어가 둘 수 있는 자리가 있는지 확인함
			// 있으면 그 플레이어(사람 또는 컴퓨터)에게 다음 위치를 선택하게 함
			if (engine.hasAnyValidMove(board, currentPlayer.getPiece())) {
				Position move = currentPlayer.getMove(board, engine);

				// getMove() 결과가 null이 아니면 실제로 돌을 놓고
				// 뒤집을 수 있는 상대 돌까지 함께 뒤집음
				if (move != null) {
					engine.placePiece(board, move, currentPlayer.getPiece());
				}
			} else {
				// 현재 차례 플레이어가 둘 수 있는 자리가 하나도 없으면 패스함
				// 오셀로 규칙상 둘 곳이 없을 때는 턴을 넘겨야 함
				System.out.println(currentPlayer.getName() + "는 둘 수 있는 곳이 없어 패스합니다.");
			}

			// 한 턴이 끝났으므로 현재 플레이어를 반대편 플레이어로 교체함
			// 사람이었으면 컴퓨터 차례, 컴퓨터였으면 사람 차례가 됨
			currentPlayer = (currentPlayer == human) ? computer : human;
		}

		// 최종 보드 출력
		printer.printBoard(board);

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