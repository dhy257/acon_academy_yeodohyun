package 팀플4;

import java.util.Stack;

public class UndoManager {
    private final Stack<Board> boardHistory = new Stack<>();
    private final Stack<Player> playerHistory = new Stack<>();

    public void save(Board board, Player currentPlayer) {
        boardHistory.push(new Board(board));
        playerHistory.push(currentPlayer);
    }

    public boolean canUndo() {
        return boardHistory.size() >= 3 && playerHistory.size() >= 3;
    }

    public UndoResult undoTurn() {
        // 현재 턴 저장본 제거
        boardHistory.pop();
        playerHistory.pop();

        // 상대 턴 저장본 제거
        boardHistory.pop();
        playerHistory.pop();

        Board restoredBoard = boardHistory.pop();
        Player restoredPlayer = playerHistory.pop();

        return new UndoResult(restoredBoard, restoredPlayer);
    }

    public void clear() {
        boardHistory.clear();
        playerHistory.clear();
    }
}