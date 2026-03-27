package 팀플2;

public class Board {

	// 보드 크기 (8x8)
	// 불변이니 final사용
	public static final int SIZE = 8;

	// 실제 보드 데이터
	private final Piece[][] grid;

	// 생성자 >> 보드 초기화
	public Board() {
		grid = new Piece[SIZE][SIZE];
		init();
	}

	// 처음 오셀로 세팅
	private void init() {
		// 가로 8칸
		for (int r = 0; r < SIZE; r++) {
			// 세로 8칸
			for (int c = 0; c < SIZE; c++) {
				// 모든 칸 비운 상태
				grid[r][c] = Piece.EMPTY;
			}
		}

		grid[3][3] = Piece.WHITE;
		grid[3][4] = Piece.BLACK;
		grid[4][3] = Piece.BLACK;
		grid[4][4] = Piece.WHITE;
	}

	// 보드 내부 좌표인지 확인(예외 처리용)
	public boolean isInside(Position pos) {
		int r = pos.getRow();
		int c = pos.getCol();
		return r >= 0 && r < SIZE && c >= 0 && c < SIZE;
	}

	// 해당 좌표의 돌 상태 반환
	public Piece getCell(Position pos) {
		return grid[pos.getRow()][pos.getCol()];
	}

	// 해당 좌표의 돌 상태 변경
	public void setCell(Position pos, Piece piece) {
		grid[pos.getRow()][pos.getCol()] = piece;
	}

	// 점수 카운트 용 돌 개수 세기
	public int countPiece(Piece piece) {
		int count = 0;

		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				if (grid[r][c] == piece) {
					count++;
				}
			}
		}
		return count;
	}
}