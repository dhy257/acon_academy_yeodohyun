package 팀플4;

public interface Player {
    Piece getPiece();      // 플레이어의 돌 색상 반환
    String getName();       // 플레이어의 이름 반환
    // 보드 상태와 규칙 엔진을 받아 다음 수를 결정함
    Position getMove(Board board, OthelloRuleEngine engine); 
}