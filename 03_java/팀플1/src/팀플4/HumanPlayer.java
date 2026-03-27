package 팀플4;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private Piece piece;
    private Scanner sc;

    // Play 클래스에서 넘겨주는 인자(이름, 색상, 스캐너)를 받도록 수정
    public HumanPlayer(String name, Piece piece, Scanner sc) {
        this.name = name;
        this.piece = piece;
        this.sc = sc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    @Override
    public Position getMove(Board board, OthelloRuleEngine engine) {
        while (true) {
            System.out.println(name + "(" + piece.getSymbol() + ")님, 좌표 입력 (행 열) / u: 되돌리기 / r: 다시하기");

            String input = sc.nextLine();

            // 🔥 Undo 처리
            if (input.equals("u")) {
                return new Position(-1, -1);
            }
            
            if (input.equals("r")) {
                return new Position(-2, -2); // 다시하기 신호
            }

            String[] parts = input.split(" ");

            // 입력 형식 검사
            if (parts.length != 2) {
                System.out.println("입력 형식: 행 열 (예: 2 3)");
                continue;
            }

            int r, c;
            try {
                r = Integer.parseInt(parts[0]);
                c = Integer.parseInt(parts[1]);
            } catch (Exception e) {
                System.out.println("숫자를 입력하세요.");
                continue;
            }

            Position pos = new Position(r, c);

            // 1. 보드 범위 확인
            if (!board.isInside(pos)) {
                System.out.println("보드 범위를 벗어났습니다. (0~7 사이 입력)");
                continue;
            }

            // 2. 유효한 자리인지 확인
            if (!engine.canPlace(board, pos, piece)) {
                System.out.println("그곳에는 돌을 놓을 수 없습니다. 다시 선택하세요.");
                continue;
            }

            return pos;
        }
    }
}