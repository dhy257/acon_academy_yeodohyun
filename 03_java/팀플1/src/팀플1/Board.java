package 팀플1;

import java.util.ArrayList;
import java.util.List;

public class Board {
	public static final int SIZE = 8;
	private final Stone[][] grid;

	private static final int[][] DIRECTIONS = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 },
			{ 1, 0 }, { 1, 1 } };

	public Board() {
		grid = new Stone[SIZE][SIZE];
		initialize();
	}

	public void initialize() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				grid[row][col] = Stone.EMPTY;
			}
		}

		grid[3][3] = Stone.WHITE;
		grid[3][4] = Stone.BLACK;
		grid[4][3] = Stone.BLACK;
		grid[4][4] = Stone.WHITE;
	}

	public boolean isInside(int row, int col) {
		return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
	}

	public void printBoard(List<Position> validMoves) {
		System.out.println();
		System.out.print("   ");
		for (int col = 0; col < SIZE; col++) {
			System.out.print(col + " ");
		}
		System.out.println();

		for (int row = 0; row < SIZE; row++) {
			System.out.print(row + "  ");
			for (int col = 0; col < SIZE; col++) {
				Position current = new Position(row, col);

				if (grid[row][col] == Stone.EMPTY && validMoves.contains(current)) {
					System.out.print("* ");
				} else {
					System.out.print(grid[row][col].getSymbol() + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("* : 현재 플레이어가 둘 수 있는 위치");
		System.out.println();
	}

	public boolean isValidMove(Position pos, Stone stone) {
		int row = pos.getRow();
		int col = pos.getCol();

		if (!isInside(row, col))
			return false;
		if (grid[row][col] != Stone.EMPTY)
			return false;

		for (int[] dir : DIRECTIONS) {
			List<Position> flippable = getFlippableStonesInDirection(row, col, stone, dir[0], dir[1]);
			if (!flippable.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public List<Position> getValidMoves(Stone stone) {
		List<Position> validMoves = new ArrayList<>();

		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				Position pos = new Position(row, col);
				if (isValidMove(pos, stone)) {
					validMoves.add(pos);
				}
			}
		}

		return validMoves;
	}

	public boolean hasValidMove(Stone stone) {
		return !getValidMoves(stone).isEmpty();
	}

	public int getFlipCount(Position pos, Stone stone) {
		if (!isValidMove(pos, stone))
			return 0;

		int count = 0;
		for (int[] dir : DIRECTIONS) {
			count += getFlippableStonesInDirection(pos.getRow(), pos.getCol(), stone, dir[0], dir[1]).size();
		}
		return count;
	}

	public boolean placeStone(Position pos, Stone stone) {
		if (!isValidMove(pos, stone)) {
			return false;
		}

		List<Position> allToFlip = new ArrayList<>();

		for (int[] dir : DIRECTIONS) {
			allToFlip.addAll(getFlippableStonesInDirection(pos.getRow(), pos.getCol(), stone, dir[0], dir[1]));
		}

		grid[pos.getRow()][pos.getCol()] = stone;

		for (Position p : allToFlip) {
			grid[p.getRow()][p.getCol()] = stone;
		}

		return true;
	}

	private List<Position> getFlippableStonesInDirection(int row, int col, Stone stone, int dRow, int dCol) {
		List<Position> toFlip = new ArrayList<>();
		int currentRow = row + dRow;
		int currentCol = col + dCol;

		while (isInside(currentRow, currentCol)) {
			Stone currentStone = grid[currentRow][currentCol];

			if (currentStone == stone.getOpponent()) {
				toFlip.add(new Position(currentRow, currentCol));
			} else if (currentStone == stone) {
				return toFlip;
			} else {
				break;
			}

			currentRow += dRow;
			currentCol += dCol;
		}

		return new ArrayList<>();
	}

	public int countStones(Stone stone) {
		int count = 0;
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				if (grid[row][col] == stone) {
					count++;
				}
			}
		}
		return count;
	}

	public boolean isFull() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				if (grid[row][col] == Stone.EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
}