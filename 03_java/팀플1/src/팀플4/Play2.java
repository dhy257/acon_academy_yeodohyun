package 팀플4;

import java.util.Scanner;

public class Play2 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            GameTimer timer = new GameTimer();
            timer.start();

            Board board = new Board();
            OthelloRuleEngine engine = new OthelloRuleEngine();
            BoardPrinter printer = new BoardPrinter();
            UndoManager undoManager = new UndoManager();

            Player player1;
            Player player2;

            // 1. 초기 설정
            Difficulty diff = Difficulty.EASY;
            int mode = 1;   // 1: 사람 vs AI, 2: 사람 vs 사람
            int choice = 1; // 1: BLACK, 2: WHITE

            while (true) {
                try {
                    System.out.print("게임 모드 선택 (1: 사람 vs AI / 2: 사람 vs 사람): ");
                    mode = sc.nextInt();

                    if (mode == 1) {
                        System.out.print("색 선택 (1: BLACK / 2: WHITE): ");
                        choice = sc.nextInt();

                        System.out.print("AI 난이도 (1:쉬움, 2:중간, 3:어려움): ");
                        int dChoice = sc.nextInt();

                        if (dChoice == 2) {
                            diff = Difficulty.NORMAL;
                        } else if (dChoice == 3) {
                            diff = Difficulty.HARD;
                        }

                        if (choice != 1 && choice != 2) {
                            System.out.println("색 선택은 1 또는 2만 입력하세요.");
                            continue;
                        }
                    } else if (mode == 2) {
                        // 사람 vs 사람이면 여기서는 통과
                    } else {
                        System.out.println("게임 모드는 1 또는 2만 입력하세요.");
                        continue;
                    }

                    sc.nextLine(); // 버퍼 비우기
                    break;
                } catch (Exception e) {
                    System.out.println("숫자를 올바르게 입력하세요.");
                    sc.nextLine();
                }
            }

            // 2. 플레이어 생성
            if (mode == 1) {
                // 사람 vs AI
                if (choice == 1) {
                    player1 = new HumanPlayer("사람", Piece.BLACK, sc);
                    player2 = new AIPlayer("컴퓨터", Piece.WHITE, diff);
                } else {
                    player1 = new AIPlayer("컴퓨터", Piece.BLACK, diff);
                    player2 = new HumanPlayer("사람", Piece.WHITE, sc);
                }
            } else {
                // 사람 vs 사람
                int pChoice = 1;

                while (true) {
                    try {
                        System.out.print("플레이어1 색 선택 (1: BLACK / 2: WHITE): ");
                        pChoice = sc.nextInt();

                        if (pChoice != 1 && pChoice != 2) {
                            System.out.println("1 또는 2만 입력하세요.");
                            continue;
                        }

                        sc.nextLine(); // 버퍼 비우기
                        break;
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

            Player currentPlayer = (player1.getPiece() == Piece.BLACK) ? player1 : player2;
            boolean restartRequested = false;

            // 3. 메인 게임 루프
            while (engine.hasAnyValidMove(board, Piece.BLACK) || engine.hasAnyValidMove(board, Piece.WHITE)) {
                undoManager.save(board, currentPlayer);

                System.out.println("\n[현재 경기 시간: " + timer.getFormattedElapsedTime() + "]");
                printer.printBoard(board, engine, currentPlayer.getPiece());

                System.out.println("현재 점수 - BLACK(●): " + board.countPiece(Piece.BLACK)
                        + " / WHITE(○): " + board.countPiece(Piece.WHITE));
                System.out.println("턴: " + currentPlayer.getName());

                // 현재 플레이어가 둘 곳이 있는지 확인
                if (engine.hasAnyValidMove(board, currentPlayer.getPiece())) {
                    Position move = currentPlayer.getMove(board, engine);

                    // 무르기(Undo)
                    if (move != null && move.getRow() == -1 && move.getCol() == -1) {
                        if (undoManager.canUndo()) {
                            UndoResult result = undoManager.undoTurn();
                            board = result.getBoard();
                            currentPlayer = result.getCurrentPlayer();
                            System.out.println("사용자가 수를 두기 전 상태로 되돌렸습니다.");
                        } else {
                            System.out.println("더 이상 되돌릴 수 없습니다.");
                        }
                        continue;
                    }

                    // 다시하기(Reset)
                    if (move != null && move.getRow() == -2 && move.getCol() == -2) {
                        restartRequested = true;
                        break;
                    }

                    // 일반 착수
                    if (move != null) {
                        engine.placePiece(board, move, currentPlayer.getPiece());
                    }
                } else {
                    System.out.println("\n⚠️ [" + currentPlayer.getName() + "]님은 둘 곳이 없어 패스합니다.");
                    System.out.println("상대방에게 턴이 넘어갑니다.");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                // 턴 교체
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }

            if (restartRequested) {
                continue;
            }

            // 4. 경기 종료
            printer.printBoard(board);
            int black = board.countPiece(Piece.BLACK);
            int white = board.countPiece(Piece.WHITE);

            System.out.println("\n=== 게임 결과 ===");
            System.out.println("최종 플레이 시간: " + timer.getFormattedElapsedTime());
            System.out.println("BLACK: " + black + " vs WHITE: " + white);

            if (black > white) {
                System.out.println("BLACK 승리!");
            } else if (white > black) {
                System.out.println("WHITE 승리!");
            } else {
                System.out.println("무승부입니다.");
            }

            System.out.print("\n새 게임을 하시겠습니까? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        sc.close();
    }
}