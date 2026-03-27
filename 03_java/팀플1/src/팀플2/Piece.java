
package 팀플2;

/**
 * 오셀로 돌의 상태를 정의하는 열거형
 */
public enum Piece {
	EMPTY("."), 
	BLACK("●"), 
	WHITE("○");

	private final String symbol;

	Piece(String symbol) {
		this.symbol = symbol;
	}

	// 출력용 심볼 반환
	public String getSymbol() {
		return symbol;
	}

	// 반대 돌 반환
	public Piece opponent() {
		if (this == BLACK) return WHITE;
		if (this == WHITE) return BLACK;
		return EMPTY;
	}
}