package 팀플3;

public interface Player {
	// 현재 플레이어가 둘 위치를 선택함
	Position getMove(Board board, OthelloRuleEngine engine);

	// 자신의 돌 색을 반환함
	Piece getPiece();

	// 플레이어 이름 반환
	String getName();
}