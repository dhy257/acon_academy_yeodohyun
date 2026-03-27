package 팀플2;

import java.util.ArrayList;
import java.util.List;


public class GameRule {

    private static final int[] DR = {-1,-1,-1,0,0,1,1,1};
    private static final int[] DC = {-1,0,1,-1,1,-1,0,1};

    public boolean isValidMove(Board board, Position pos, Piece piece) {
        if (pos == null) return false;

        if (!board.isInside(pos)) return false;
        if (board.getCell(pos) != Piece.EMPTY) return false;

        for (int d = 0; d < 8; d++) {
            if (!getFlips(board, pos, piece, DR[d], DC[d]).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public List<Position> getValidMoves(Board board, Piece piece) {
        List<Position> list = new ArrayList<>();

        for (int r = 0; r < Board.SIZE; r++) {
            for (int c = 0; c < Board.SIZE; c++) {
                Position pos = new Position(r, c);
                if (isValidMove(board, pos, piece)) {
                    list.add(pos);
                }
            }
        }
        return list;
    }

    public boolean hasMove(Board board, Piece piece) {
        return !getValidMoves(board, piece).isEmpty();
    }

    public boolean isGameOver(Board board) {
        return !hasMove(board, Piece.BLACK) &&
               !hasMove(board, Piece.WHITE);
    }

    public void applyMove(Board board, Position pos, Piece piece) {
        if (!isValidMove(board, pos, piece)) return;

        board.setCell(pos, piece);

        for (int d = 0; d < 8; d++) {
            List<Position> flips = getFlips(board, pos, piece, DR[d], DC[d]);

            for (Position p : flips) {
                board.setCell(p, piece);
            }
        }
    }

    private List<Position> getFlips(Board board, Position start,
                                    Piece piece, int dr, int dc) {

        List<Position> flips = new ArrayList<>();

        int nr = start.getRow() + dr;
        int nc = start.getCol() + dc;

        Position next = new Position(nr, nc);

        while (board.isInside(next) &&
               board.getCell(next) == piece.opponent()) {

            flips.add(next);

            nr += dr;
            nc += dc;
            next = new Position(nr, nc);
        }

        if (!board.isInside(next)) return new ArrayList<>();

        if (board.getCell(next) != piece) return new ArrayList<>();

        return flips;
    }
}