package 팀플3;

import java.util.ArrayList;
import java.util.List;

public class OthelloRuleEngine {
	
	 /**
     * [방향 탐색 가이드]
     * * 격자판에서 현재 위치 (row, col)를 기준으로 8방향 좌표.
     * * (r-1, c-1)  (r-1, c)  (r-1, c+1)
     * ↖           ↑           ↗
     * (r, c-1)  ←  [현재위치]  →  (r, c+1)
     * ↙           ↓           ↘
     * (r+1, c-1)  (r+1, c)  (r+1, c+1)
     * * DR (Delta Row)    : 세로축 변화 (-1: 위, 1: 아래, 0: 그대로)
     * DC (Delta Column) : 가로축 변화 (-1: 왼쪽, 1: 오른쪽, 0: 그대로)
     */

    // 인덱스 번호:    0   1   2   3   4   5   6   7
    // 가리키는 방향:  상  하  좌  우  좌상 우상 좌하 우하
	private static final int[] DR = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static final int[] DC = { 0, 0, -1, 1, -1, 1, -1, 1 };

	/**
	 * 특정 위치에 돌을 놓을 수 있는지 확인하는 기능임. 8방향 중 한 곳이라도 뒤집을 돌이 있으면 true임.
	 */
	public boolean canPlace(Board board, Position pos, Piece myPiece) {
		// 판 밖이거나 이미 돌이 있으면 못 놓음
		if (!board.isInside(pos) || board.getCell(pos) != Piece.EMPTY)
			return false;

		for (int i = 0; i < 8; i++) {
			if (checkDirection(board, pos, DR[i], DC[i], myPiece))
				return true;
		}
		return false;
	}

	// 특정 방향으로 전진하며 뒤집을 수 있는지 체크하는 보조 로직임
	private boolean checkDirection(Board board, Position pos, int dr, int dc, Piece myPiece) {
		int nr = pos.getRow() + dr;
		int nc = pos.getCol() + dc;
		boolean hasOpponent = false;

		// 상대방 돌이 연속되는 동안 계속 전진함
		while (board.isInside(new Position(nr, nc)) && board.getCell(new Position(nr, nc)) == myPiece.opponent()) {
			nr += dr;
			nc += dc;
			hasOpponent = true;
		}
		// 전진 끝에 내 돌이 있으면 뒤집기 가능함
		return hasOpponent && board.isInside(new Position(nr, nc)) && board.getCell(new Position(nr, nc)) == myPiece;
	}

	/**
	 * 돌을 실제로 놓고, 뒤집힐 돌들을 찾아 전부 색깔을 바꿔줌.
	 */
	public void placePiece(Board board, Position pos, Piece myPiece) {
		board.setCell(pos, myPiece); // 클릭한 자리에 돌 놓음
		List<Position> flips = getFlips(board, pos, myPiece); // 뒤집힐 명단 가져옴
		for (Position p : flips) {
			board.setCell(p, myPiece); // 명단대로 색깔 바꿈
		}
	}

	/**
	 * 8방향을 모두 훑어서 뒤집힐 돌들의 좌표 리스트를 생성함.
	 */
	public List<Position> getFlips(Board board, Position pos, Piece myPiece) {
		List<Position> allFlips = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			allFlips.addAll(getFlipsInDirection(board, pos, DR[i], DC[i], myPiece));
		}
		return allFlips;
	}

	// 한 방향에 대해 뒤집힐 좌표들을 수집함
	private List<Position> getFlipsInDirection(Board board, Position pos, int dr, int dc, Piece myPiece) {
		List<Position> temp = new ArrayList<>();
		int nr = pos.getRow() + dr;
		int nc = pos.getCol() + dc;

		while (board.isInside(new Position(nr, nc)) && board.getCell(new Position(nr, nc)) == myPiece.opponent()) {
			temp.add(new Position(nr, nc));
			nr += dr;
			nc += dc;
		}
		if (board.isInside(new Position(nr, nc)) && board.getCell(new Position(nr, nc)) == myPiece) {
			return temp;
		}
		return new ArrayList<>(); // 내 돌로 끝나지 않으면 뒤집지 못하므로 빈 리스트 반환함
	}

	// 현재 플레이어가 보드 어디든 한 군데라도 놓을 자리가 있는지 확인함
	public boolean hasAnyValidMove(Board board, Piece piece) {
		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				if (canPlace(board, new Position(r, c), piece))
					return true;
			}
		}
		return false;
	}
}