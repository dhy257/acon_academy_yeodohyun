package 팀플4;

import java.util.Scanner;
import java.util.Stack;

public class Play {
	// 화면을 지우는 메서드 (콘솔 UX 향상)
    private void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }

    // 시간 포맷팅 메서드
    private String getFormattedTime(long startTime) {
        long duration = (System.currentTimeMillis() - startTime) / 1000;
        return (duration / 60) + "분 " + (duration % 60) + "초";
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long startTime = System.currentTimeMillis();
            Board board = new Board();
            OthelloRuleEngine engine = new OthelloRuleEngine();
            BoardPrinter printer = new BoardPrinter();

            Player player1 = null;
            Player player2 = null;
            Stack<Board> history = new Stack<>();
            Stack<Player> playerHistory = new Stack<>();

            // --- 1. 초기 설정 구간 ---
            int mode = 1;
            while (true) {
                try {
                    System.out.print("게임 모드 선택 (1: 사람 vs AI / 2: 사람 vs 사람): ");
                    mode = sc.nextInt();
                    if (mode == 1 || mode == 2) break;
                    System.out.println("1 또는 2만 입력하세요.");
                } catch (Exception e) {
                    System.out.println("숫자를 입력하세요.");
                    sc.nextLine();
                }
            }

            if (mode == 1) {
                // [사람 vs AI 모드 설정]
                System.out.print("색 선택 (1: BLACK / 2: WHITE): ");
                int choice = sc.nextInt();
                System.out.print("AI 난이도 (1:쉬움, 2:중간, 3:어려움): ");
                int dChoice = sc.nextInt();
                sc.nextLine();

                Difficulty diff = (dChoice == 2) ? Difficulty.NORMAL : (dChoice == 3 ? Difficulty.HARD : Difficulty.EASY);
                
                if (choice == 1) {
                    player1 = new HumanPlayer("사람", Piece.BLACK, sc);
                    player2 = new AIPlayer("컴퓨터", Piece.WHITE, diff);
                } else {
                    player1 = new AIPlayer("컴퓨터", Piece.BLACK, diff);
                    player2 = new HumanPlayer("사람", Piece.WHITE, sc);
                }
            } else {
                // 🔥 [팀원분 수정 코드 반영: 사람 vs 사람 모드 설정]
                int pChoice = 1;
                while (true) {
                    try {
                        System.out.print("플레이어1 색 선택 (1: BLACK / 2: WHITE): ");
                        pChoice = sc.nextInt();
                        if (pChoice == 1 || pChoice == 2) {
                            sc.nextLine(); 
                            break;
                        }
                        System.out.println("1 또는 2만 입력하세요.");
                    } catch (Exception e) {
                        System.out.println("숫자를 올바르게 입력하세요.");
                        sc.nextLine();
                    }
                }

                if (pChoice == 1) {
                    player1 = new HumanPlayer("플레이어1", Piece.BLACK, sc);
                    player2 = new HumanPlayer("플레이어2", Piece.WHITE, sc);
                } else {
                    player1 = new HumanPlayer("플레이어1", Piece.WHITE, sc);
                    player2 = new HumanPlayer("플레이어2", Piece.BLACK, sc);
                }
            }

            // --- 2. 게임 진행 구간 ---
            Player currentPlayer = (player1.getPiece() == Piece.BLACK) ? player1 : player2;
            boolean restartRequested = false;

            while (engine.hasAnyValidMove(board, Piece.BLACK) || engine.hasAnyValidMove(board, Piece.WHITE)) {
                clearConsole();
                history.push(new Board(board));
                playerHistory.push(currentPlayer);

                System.out.println("\n[진행 시간: " + getFormattedTime(startTime) + "]");
                printer.printBoard(board, engine, currentPlayer.getPiece());
                System.out.println("점수 - BLACK(●): " + board.countPiece(Piece.BLACK) + " / WHITE(○): " + board.countPiece(Piece.WHITE));
                System.out.println("턴: " + currentPlayer.getName() + " (" + currentPlayer.getPiece().getSymbol() + ")");

                if (engine.hasAnyValidMove(board, currentPlayer.getPiece())) {
                    Position move = currentPlayer.getMove(board, engine);

                    // 무르기(Undo)
                    if (move != null && move.getRow() == -1 && move.getCol() == -1) {
                        history.pop(); playerHistory.pop();
                        if (history.size() >= 2) {
                            history.pop(); playerHistory.pop();
                            board = history.pop();
                            currentPlayer = playerHistory.pop();
                            System.out.println("기록을 되돌렸습니다.");
                        } else {
                            System.out.println("되돌릴 기록이 없습니다.");
                            history.push(new Board(board)); playerHistory.push(currentPlayer);
                        }
                        continue;
                    }

                    // 다시하기(Reset)
                    if (move != null && move.getRow() == -2 && move.getCol() == -2) {
                        restartRequested = true;
                        break;
                    }

                    if (move != null) engine.placePiece(board, move, currentPlayer.getPiece());
                } else {
                    System.out.println("\n⚠️ " + currentPlayer.getName() + "님 패스!");
                    try { Thread.sleep(1200); } catch (InterruptedException e) {}
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }

            if (restartRequested) continue;

            // --- 3. 게임 종료 구간 ---
            clearConsole();
            printer.printBoard(board);
            showResult(board, getFormattedTime(startTime));

            System.out.print("\n새 게임을 하시겠습니까? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) break;
        }
        sc.close();
    }

    private void showResult(Board board, String time) {
        int black = board.countPiece(Piece.BLACK);
        int white = board.countPiece(Piece.WHITE);
        System.out.println("\n=== 최종 결과 ===");
        System.out.println("플레이 시간: " + time);
        System.out.println("BLACK: " + black + " vs WHITE: " + white);
        if (black > white) System.out.println("BLACK 승리! 🎉");
        else if (white > black) System.out.println("WHITE 승리! 🎉");
        else System.out.println("무승부! 🤝");
    }
}