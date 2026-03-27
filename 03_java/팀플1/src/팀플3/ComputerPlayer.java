package 팀플3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
	private final String name;
	private final Piece piece;
	private final Random random = new Random();

	public ComputerPlayer(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
	}

	@Override
	public Position getMove(Board board, OthelloRuleEngine engine) {
		List<Position> moves = new ArrayList<>();

		// 둘 수 있는 모든 위치 수집
		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);
				if (engine.canPlace(board, pos, piece)) {
					moves.add(pos);
				}
			}
		}

		if (moves.isEmpty()) {
			return null;
		}

		Position selected = moves.get(random.nextInt(moves.size()));
		System.out.println(name + " 선택: " + selected.getRow() + " " + selected.getCol());
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