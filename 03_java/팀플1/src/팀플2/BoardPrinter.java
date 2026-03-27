package 팀플2;

public class BoardPrinter {

	// 가능한 위치까지 포함해서 출력
	public void print(Board board, GameRule rule, Piece current) {
		System.out.println();
		System.out.println("● : BLACK   ○ : WHITE   * : 가능한 위치");

		// 열 번호 표시
		System.out.print("  ");
		for (int c = 0; c < Board.SIZE; c++) {
			System.out.print(c + " ");
		}
		System.out.println();

		// 보드 출력
		// 행 번호 표시
		for (int r = 0; r < Board.SIZE; r++) {
			System.out.print(r + " ");
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);

				// 빈 칸 && 둘 수 있는지 판별 => 둘 수 있으면 *
				if (board.getCell(pos) == Piece.EMPTY && rule.isValidMove(board, pos, current)) {
					System.out.print("* ");
				} else {
					System.out.print(board.getCell(pos).getSymbol() + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	// 최종 결과용 기본 보드 출력
	public void print(Board board) {
		System.out.println();
		System.out.println("● : BLACK   ○ : WHITE");

		// 열 번호 표시
		System.out.print("  ");
		for (int c = 0; c < Board.SIZE; c++) {
			System.out.print(c + " ");
		}
		System.out.println();

		// 보드 출력
		// 행 번호 표시
		for (int r = 0; r < Board.SIZE; r++) {
			System.out.print(r + " ");
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);
				System.out.print(board.getCell(pos).getSymbol() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}