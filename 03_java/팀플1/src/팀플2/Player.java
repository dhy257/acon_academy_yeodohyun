package 팀플2;


public interface Player {

    // 다음 수 선택
    Position getMove(Board board, GameRule rule);

    // 자신의 돌 색 반환
    Piece getPiece();

    // 이름 반환
    String getName();
}