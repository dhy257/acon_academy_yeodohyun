package 팀플2;

import java.util.Scanner;

/**
 * 사람 플레이어
 */
public class HumanPlayer implements Player {

    private final String name;
    private final Piece piece;
    private final Scanner scanner;

    public HumanPlayer(String name, Piece piece, Scanner scanner) {
        this.name = name;
        this.piece = piece;
        this.scanner = scanner;
    }

    @Override
    public Position getMove(Board board, GameRule rule) {
        while (true) {
            try {
                System.out.println(name + " 차례 (" + piece + ")");
                System.out.print("행 열 입력 (예: 2 3): ");

                int row = scanner.nextInt();
                int col = scanner.nextInt();

                Position pos = new Position(row, col);

                // 규칙에 맞는 수인지 검사
                if (rule.isValidMove(board, pos, piece)) {
                    return pos;
                } else {
                    System.out.println("❌ 둘 수 없는 위치입니다.");
                }

            } catch (Exception e) {
                System.out.println("❌ 숫자를 입력하세요.");
                scanner.nextLine(); // 입력 버퍼 비우기
            }
        }
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