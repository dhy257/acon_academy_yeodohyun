package 팀플2;

import java.util.List;
import java.util.Random;

/**
 * 컴퓨터 플레이어
 */
public class ComputerPlayer implements Player {

    private final String name;
    private final Piece piece;
    private final Random random = new Random();

    public ComputerPlayer(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    @Override
    public Position getMove(Board board, GameRule rule) {

        // 가능한 수 목록 가져오기
        List<Position> moves = rule.getValidMoves(board, piece);

        if (moves.isEmpty()) {
            return null;
        }

        // 랜덤 선택
        Position selected = moves.get(random.nextInt(moves.size()));

        System.out.println(name + " 선택: " +
                selected.getRow() + " " + selected.getCol());

        return selected;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    @Override
    public String getName() {
        return name;
    }
}