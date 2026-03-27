package 팀플1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer extends Player {
	private final Random random = new Random();

	public ComputerPlayer(String name, Stone stone) {
		super(name, stone);
	}

	@Override
	public Position chooseMove(Board board, Scanner scanner) {
		List<Position> validMoves = board.getValidMoves(getStone());

		// 1. 코너 우선
		Position cornerMove = findCornerMove(validMoves);
		if (cornerMove != null) {
			System.out.println(getName() + "가 코너 위치를 선택했습니다: " + cornerMove);
			return cornerMove;
		}

		// 2. 코너가 없으면 가장 많이 뒤집는 위치 선택
		Position bestMove = null;
		int maxFlip = -1;

		for (Position pos : validMoves) {
			int flipCount = board.getFlipCount(pos, getStone());

			if (flipCount > maxFlip) {
				maxFlip = flipCount;
				bestMove = pos;
			}
		}

		// 3. 혹시 모를 예외 상황 대비
		if (bestMove == null && !validMoves.isEmpty()) {
			bestMove = validMoves.get(random.nextInt(validMoves.size()));
		}

		System.out.println(getName() + "가 선택한 위치: " + bestMove);
		return bestMove;
	}

	private Position findCornerMove(List<Position> validMoves) {
		Position[] corners = { new Position(0, 0), new Position(0, 7), new Position(7, 0), new Position(7, 7) };

		for (Position corner : corners) {
			if (validMoves.contains(corner)) {
				return corner;
			}
		}

		return null;
	}
}