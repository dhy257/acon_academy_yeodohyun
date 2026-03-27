package 팀플4;

public class Board {
	public static final int SIZE = 8; // 보드 크기는 8로 고정임
	private final Piece[][] grid; // 실제 돌들이 놓이는 2차원 배열임

	public Board() {
		grid = new Piece[SIZE][SIZE];
		init(); // 생성 시 초기 배치 진행함
	}

	public Board(Board other) {
	    this.grid = new Piece[SIZE][SIZE];
	    for (int r = 0; r < SIZE; r++) {
	        this.grid[r] = other.grid[r].clone();
	    }
	}
	
	// 게임 시작 시 중앙에 4개의 돌을 교차로 배치함
	private void init() {
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				grid[r][c] = Piece.EMPTY;
			}
		}
		grid[3][3] = Piece.WHITE;
		grid[3][4] = Piece.BLACK;
		grid[4][3] = Piece.BLACK;
		grid[4][4] = Piece.WHITE;
	}

	
	// 전달받은 좌표가 0~7 범위 내에 있는지 검사함
	public boolean isInside(Position pos) {
		int r = pos.getRow();
		int c = pos.getCol();
		return r >= 0 && r < SIZE && c >= 0 && c < SIZE;
	}

	// 특정 위치의 돌 상태를 가져옴
	public Piece getCell(Position pos) {
		return grid[pos.getRow()][pos.getCol()];
	}

	// 특정 위치에 돌을 놓거나 변경함
	public void setCell(Position pos, Piece piece) {
		grid[pos.getRow()][pos.getCol()] = piece;
	}

	// 특정 색깔의 돌이 판 위에 몇 개 있는지 세어줌 (점수 계산용)
	public int countPiece(Piece piece) {
		int count = 0;
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				if (grid[r][c] == piece)
					count++;
			}
		}
		return count;
	}

}