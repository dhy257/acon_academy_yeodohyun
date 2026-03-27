package 팀플4;

/**
 * 보드 위의 특정 칸 주소(좌표)를 나타내는 클래스임. 
 * 데이터 오염을 막기 위해 한 번 정해진 좌표는 바꿀 수 없음(final).
 */
public class Position {
	private final int row;
	private final int col;

	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
}