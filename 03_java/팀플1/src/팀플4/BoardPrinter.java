package 팀플4;

public class BoardPrinter {

	// 현재 플레이어가 둘 수 있는 곳을 '*'로 표시하여 보드를 출력함
	public void printBoard(Board board, OthelloRuleEngine engine, Piece current) {
		System.out.println("\n● : BLACK   ○ : WHITE   * : 가능한 위치");
		System.out.print("  ");
		for (int c = 0; c < Board.SIZE; c++)
			System.out.print(c + " ");
		System.out.println();

		for (int r = 0; r < Board.SIZE; r++) {
			System.out.print(r + " ");
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);

				// 빈칸인데 착수 가능한 곳이면 '*' 출력, 아니면 돌의 심볼 출력함
				if (board.getCell(pos) == Piece.EMPTY && engine.canPlace(board, pos, current)) {
					System.out.print("* ");
				} else {
					System.out.print(board.getCell(pos).getSymbol() + " ");
				}
			}
			System.out.println();
		}
	}

	// 가능한 위치 표시 없이 현재 보드 상태만 출력함
	public void printBoard(Board board) {
		System.out.println("\n● : BLACK   ○ : WHITE");
		System.out.print("  ");
		for (int c = 0; c < Board.SIZE; c++)
			System.out.print(c + " ");
		System.out.println();

		for (int r = 0; r < Board.SIZE; r++) {
			System.out.print(r + " ");
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);
				System.out.print(board.getCell(pos).getSymbol() + " ");
			}
			System.out.println();
		}
	}
}