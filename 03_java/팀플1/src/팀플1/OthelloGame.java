package 팀플1;

import java.util.List;
import java.util.Scanner;

public class OthelloGame {
	private final Board board;
	private Player blackPlayer;
	private Player whitePlayer;
	private Player currentPlayer;
	private final Scanner scanner;

	public OthelloGame() {
		this.board = new Board();
		this.scanner = new Scanner(System.in);
	}

	public void start() {
		setupPlayers();

		System.out.println();
		System.out.println("===== 오셀로 게임 시작 =====");
		System.out.println(blackPlayer.getName() + " : BLACK(●)");
		System.out.println(whitePlayer.getName() + " : WHITE(○)");

		while (!isGameOver()) {
			List<Position> validMoves = board.getValidMoves(currentPlayer.getStone());

			board.printBoard(validMoves);
			printScore();

			if (validMoves.isEmpty()) {
				System.out.println(currentPlayer.getName() + "은(는) 둘 수 있는 위치가 없습니다. 턴을 넘깁니다.");
				switchTurn();
				continue;
			}

			Position move = currentPlayer.chooseMove(board, scanner);
			board.placeStone(move, currentPlayer.getStone());

			switchTurn();
		}

		board.printBoard(List.of());
		printScore();
		declareWinner();
	}

	private void setupPlayers() {
		System.out.println("===== 게임 모드 선택 =====");
		System.out.println("1. 사람 vs 사람");
		System.out.println("2. 사람 vs 컴퓨터");

		while (true) {
			System.out.print("선택: ");
			String input = scanner.nextLine().trim();

			if ("1".equals(input)) {
				blackPlayer = new HumanPlayer("Player1", Stone.BLACK);
				whitePlayer = new HumanPlayer("Player2", Stone.WHITE);
				break;
			} else if ("2".equals(input)) {
				blackPlayer = new HumanPlayer("Player", Stone.BLACK);
				whitePlayer = new ComputerPlayer("Computer", Stone.WHITE);
				break;
			} else {
				System.out.println("1 또는 2만 입력하세요.");
			}
		}

		currentPlayer = blackPlayer;
	}

	private void switchTurn() {
		if (currentPlayer == blackPlayer) {
			currentPlayer = whitePlayer;
		} else {
			currentPlayer = blackPlayer;
		}
	}

	private boolean isGameOver() {
		return board.isFull() || (!board.hasValidMove(Stone.BLACK) && !board.hasValidMove(Stone.WHITE));
	}

	private void printScore() {
		int blackCount = board.countStones(Stone.BLACK);
		int whiteCount = board.countStones(Stone.WHITE);

		System.out.println("현재 점수");
		System.out.println("BLACK(●) : " + blackCount);
		System.out.println("WHITE(○) : " + whiteCount);
		System.out.println();
	}

	private void declareWinner() {
		int blackCount = board.countStones(Stone.BLACK);
		int whiteCount = board.countStones(Stone.WHITE);

		System.out.println("===== 게임 종료 =====");
		System.out.println("최종 결과");
		System.out.println(blackPlayer.getName() + " (BLACK): " + blackCount);
		System.out.println(whitePlayer.getName() + " (WHITE): " + whiteCount);

		if (blackCount > whiteCount) {
			System.out.println("승자: " + blackPlayer.getName());
		} else if (whiteCount > blackCount) {
			System.out.println("승자: " + whitePlayer.getName());
		} else {
			System.out.println("무승부입니다.");
		}
	}
}