package 팀플4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class OthelloGUI extends JFrame {
	private Board board;
	private OthelloRuleEngine engine;
	private Piece humanPiece;
	private Piece aiPiece;
	private Piece currentTurn;
	private JButton[][] buttons = new JButton[Board.SIZE][Board.SIZE];
	private JLabel statusLabel;

	public OthelloGUI() {
		// 1. 로직 및 데이터 초기화
		board = new Board();
		engine = new OthelloRuleEngine();
		humanPiece = Piece.BLACK; // 기본적으로 사용자를 흑돌로 설정
		aiPiece = Piece.WHITE;
		currentTurn = Piece.BLACK; // 오셀로는 흑돌 선공

		// 2. UI 설정
		setTitle("Java Othello Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// 상단 상태 표시줄
		statusLabel = new JLabel("게임 시작: 당신의 차례 (BLACK)");
		statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		statusLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(statusLabel, BorderLayout.NORTH);

		// 중앙 게임판 (8x8 그리드)
		JPanel boardPanel = new JPanel(new GridLayout(Board.SIZE, Board.SIZE));
		boardPanel.setBackground(new Color(34, 139, 34)); // 오셀로 특유의 초록색 판

		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				buttons[r][c] = new JButton();
				buttons[r][c].setPreferredSize(new Dimension(60, 60));
				buttons[r][c].setOpaque(true);
				buttons[r][c].setBorder(BorderFactory.createLineBorder(Color.BLACK));

				final int row = r;
				final int col = c;

				// 마우스 클릭 이벤트 연결
				buttons[r][c].addActionListener(e -> handleMouseClick(row, col));

				boardPanel.add(buttons[r][c]);
			}
		}
		add(boardPanel, BorderLayout.CENTER);

		updateBoardView(); // 초기 화면 그리기
		pack();
		setLocationRelativeTo(null); // 화면 중앙 배치
		setVisible(true);
	}

	// 클릭 시 발생하는 로직
	private void handleMouseClick(int r, int c) {
		if (currentTurn != humanPiece)
			return; // 내 차례가 아니면 무시

		Position pos = new Position(r, c);
		if (engine.canPlace(board, pos, humanPiece)) {
			// 1. 사람의 수 놓기
			engine.placePiece(board, pos, humanPiece);
			updateBoardView();

			// 2. 차례 넘기기 및 AI 실행
			currentTurn = aiPiece;
			statusLabel.setText("AI가 생각 중입니다...");

			// AI 실행 (화면이 멈추지 않게 별도 스레드에서 실행)
			Timer aiTimer = new Timer(1000, e -> processAITurn());
			aiTimer.setRepeats(false);
			aiTimer.start();
		}
	}

	private void processAITurn() {
		if (!engine.hasAnyValidMove(board, aiPiece)) {
			if (!engine.hasAnyValidMove(board, humanPiece)) {
				endGame();
				return;
			}
			statusLabel.setText("AI가 둘 곳이 없어 패스합니다.");
			currentTurn = humanPiece;
			return;
		}

		// 간단한 AI 로직: 가능한 수 중 랜덤 선택
		List<Position> validMoves = engine.getValidMoves(board, aiPiece);
		if (!validMoves.isEmpty()) {
			Position aiMove = validMoves.get((int) (Math.random() * validMoves.size()));
			engine.placePiece(board, aiMove, aiPiece);
		}

		currentTurn = humanPiece;
		updateBoardView();

		// 사람도 둘 곳이 없다면 다시 AI에게 기회를 주거나 종료
		if (!engine.hasAnyValidMove(board, humanPiece)) {
			if (!engine.hasAnyValidMove(board, aiPiece)) {
				endGame();
			} else {
				statusLabel.setText("당신이 둘 곳이 없어 패스합니다.");
				Timer aiTimer = new Timer(1000, e -> processAITurn());
				aiTimer.setRepeats(false);
				aiTimer.start();
			}
		} else {
			statusLabel.setText("당신의 차례 (BLACK)");
		}
	}

	// 보드 상태를 UI에 반영
	private void updateBoardView() {
		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				Piece p = board.getCell(new Position(r, c));
				buttons[r][c].setBackground(new Color(34, 139, 34)); // 기본 배경

				if (p == Piece.BLACK) {
					buttons[r][c].setText("●");
					buttons[r][c].setForeground(Color.BLACK);
					buttons[r][c].setFont(new Font("Arial", Font.BOLD, 30));
				} else if (p == Piece.WHITE) {
					buttons[r][c].setText("○");
					buttons[r][c].setForeground(Color.WHITE);
					buttons[r][c].setFont(new Font("Arial", Font.BOLD, 30));
				} else {
					buttons[r][c].setText("");
					// 놓을 수 있는 곳 힌트 표시
					if (currentTurn == humanPiece && engine.canPlace(board, new Position(r, c), humanPiece)) {
						buttons[r][c].setText("·");
						buttons[r][c].setForeground(new Color(255, 255, 255, 100));
					}
				}
			}
		}
	}

	private void endGame() {
		int black = board.countPiece(Piece.BLACK);
		int white = board.countPiece(Piece.WHITE);
		String winner = (black > white) ? "BLACK 승리!" : (white > black) ? "WHITE 승리!" : "무승부!";

		JOptionPane.showMessageDialog(this, "게임 종료!\nBLACK: " + black + "\nWHITE: " + white + "\n\n" + winner);
		statusLabel.setText("게임 종료 - " + winner);
	}

	public static void main(String[] args) {
		new OthelloGUI();
	}
}