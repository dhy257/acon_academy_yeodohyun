package 팀플4;

public class UndoResult {
    private final Board board;
    private final Player currentPlayer;

    public UndoResult(Board board, Player currentPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}