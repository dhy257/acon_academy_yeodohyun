package 팀플4;

/**
 * 오셀로 돌의 상태를 정의하는 열거형임.
 * 출력용 심볼을 내장하여 보드 출력 시 편리하게 사용함.
 */
public enum Piece {
    EMPTY("."), BLACK("●"), WHITE("○");

    private final String symbol; // 콘솔 출력용 모양 (●, ○, .)

    // 생성자: 각 열거형 상수에 맞는 심볼을 할당함
    Piece(String symbol) {
        this.symbol = symbol;
    }

    // 외부에서 돌의 모양을 가져올 때 사용함
    public String getSymbol() {
        return symbol;
    }

    // 현재 돌의 반대 색상을 반환함 (상대방 확인용)
    public Piece opponent() {
        if (this == BLACK) return WHITE;
        if (this == WHITE) return BLACK;
        return EMPTY; // 빈칸의 상대는 없음
    }
}