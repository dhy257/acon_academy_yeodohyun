package 팀플4;

import java.util.List;
import java.util.Random;

public class AIPlayer implements Player {
    private String name;
    private Piece piece;
    private Difficulty difficulty;
    private Random random = new Random();

    public AIPlayer(String name, Piece piece, Difficulty difficulty) {
        this.name = name;
        this.piece = piece;
        this.difficulty = difficulty;
    }

    @Override
    public String getName() {
        return name + "[" + difficulty + "]";
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    @Override
    public Position getMove(Board board, OthelloRuleEngine engine) {
        List<Position> moves = engine.getValidMoves(board, piece);
        if (moves.isEmpty()) return null;

        try { Thread.sleep(800); } catch (InterruptedException e) {}

        // 난이도별 알고리즘 분기
        switch (difficulty) {
            case EASY:
                return moves.get(random.nextInt(moves.size())); // 랜덤
            case NORMAL:
                return getGreedyMove(board, engine, moves);    // 다다익선
            case HARD:
                return getStrategicMove(moves);                 // 가중치 기반
            default:
                return moves.get(0);
        }
    }

    // [NORMAL] 가장 많이 뒤집는 곳 찾기 (탐욕 알고리즘)
    private Position getGreedyMove(Board board, OthelloRuleEngine engine, List<Position> moves) {
        Position bestMove = moves.get(0);
        int maxFlips = -1;

        for (Position pos : moves) {
            int flips = engine.getFlips(board, pos, piece).size();
            if (flips > maxFlips) {
                maxFlips = flips;
                bestMove = pos;
            }
        }
        return bestMove;
    }

    // [HARD] 위치별 가중치 기반 (전략적 판단)
    private Position getStrategicMove(List<Position> moves) {
        int[][] weights = {
            {100, -20, 10,  5,  5, 10, -20, 100},
            {-20, -50, -2, -2, -2, -2, -50, -20},
            { 10,  -2,  5,  2,  2,  5,  -2,  10},
            {  5,  -2,  2,  0,  0,  2,  -2,   5},
            {  5,  -2,  2,  0,  0,  2,  -2,   5},
            { 10,  -2,  5,  2,  2,  5,  -2,  10},
            {-20, -50, -2, -2, -2, -2, -50, -20},
            {100, -20, 10,  5,  5, 10, -20, 100}
        };

        Position bestMove = moves.get(0);
        int maxWeight = Integer.MIN_VALUE;

        for (Position pos : moves) {
            int weight = weights[pos.getRow()][pos.getCol()];
            if (weight > maxWeight) {
                maxWeight = weight;
                bestMove = pos;
            }
        }
        return bestMove;
    }
}