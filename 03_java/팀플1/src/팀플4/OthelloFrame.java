package 팀플4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class OthelloFrame extends JFrame {
	private final Board board = new Board();
	private final OthelloRuleEngine engine = new OthelloRuleEngine();
	private final JButton[][] cells = new JButton[Board.SIZE][Board.SIZE];

	private final JLabel infoLabel = new JLabel("", JLabel.CENTER);
	private final JLabel statusLabel = new JLabel("", JLabel.CENTER);
	private final JLabel scoreLabel = new JLabel("", JLabel.CENTER);

	private Piece currentTurn;
	private Piece humanPiece;
	private Piece computerPiece;

	public OthelloFrame() {
		selectPlayerColor();

		setTitle("오셀로");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		infoLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		statusLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		scoreLabel.setFont(new Font("Dialog", Font.PLAIN, 16));

		JPanel topPanel = new JPanel(new GridLayout(3, 1));
		topPanel.add(infoLabel);
		topPanel.add(statusLabel);
		topPanel.add(scoreLabel);
		add(topPanel, BorderLayout.NORTH);

		JPanel boardPanel = new JPanel(new GridLayout(Board.SIZE, Board.SIZE));

		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				JButton button = new JButton();
				button.setFont(new Font("Dialog", Font.BOLD, 24));
				button.setFocusPainted(false);

				final int row = r;
				final int col = c;

				button.addActionListener(e -> handleHumanMove(row, col));

				cells[r][c] = button;
				boardPanel.add(button);
			}
		}

		add(boardPanel, BorderLayout.CENTER);

		JButton resetButton = new JButton("새 게임");
		resetButton.addActionListener(e -> {
			dispose();
			new OthelloFrame();
		});
		add(resetButton, BorderLayout.SOUTH);

		refreshBoard();

		// 사람이 백을 선택했다면 컴퓨터(흑)가 먼저 둠
		if (currentTurn == computerPiece) {
			handleComputerTurn();
		}

		setSize(700, 780);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// 시작 시 사람의 돌 색 선택
	private void selectPlayerColor() {
		String[] options = { "BLACK(흑)", "WHITE(백)" };

		int choice = JOptionPane.showOptionDialog(null, "플레이어 색을 선택하세요.", "색 선택", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		// 닫기 눌렀을 때도 기본은 BLACK
		if (choice == 1) {
			humanPiece = Piece.WHITE;
			computerPiece = Piece.BLACK;
		} else {
			humanPiece = Piece.BLACK;
			computerPiece = Piece.WHITE;
		}

		// 흑이 선공
		currentTurn = Piece.BLACK;
	}

	// 사람 클릭 처리
	private void handleHumanMove(int row, int col) {
		// 사람 차례가 아니면 클릭 무시
		if (currentTurn != humanPiece) {
			return;
		}

		Position pos = new Position(row, col);

		// 둘 수 없는 곳이면 안내
		if (!engine.canPlace(board, pos, humanPiece)) {
			statusLabel.setText("둘 수 없는 위치입니다.");
			return;
		}

		// 사람 돌 놓기
		engine.placePiece(board, pos, humanPiece);
		currentTurn = computerPiece;
		refreshBoard();

		// 사람 수를 둔 뒤 게임 종료 체크
		if (checkGameOver()) {
			return;
		}

		// 컴퓨터 차례 진행
		handleComputerTurn();
	}

	// 컴퓨터 턴 처리
	private void handleComputerTurn() {
		// 컴퓨터가 둘 수 없으면 패스
		if (!engine.hasAnyValidMove(board, computerPiece)) {
			statusLabel.setText("컴퓨터는 둘 곳이 없어 패스합니다.");

			if (checkGameOver()) {
				return;
			}

			currentTurn = humanPiece;
			refreshBoard();
			return;
		}

		List<Position> validMoves = getValidMoves(computerPiece);
		Position move = validMoves.get(new Random().nextInt(validMoves.size()));

		engine.placePiece(board, move, computerPiece);
		statusLabel.setText("컴퓨터가 (" + move.getRow() + ", " + move.getCol() + ")에 두었습니다.");

		currentTurn = humanPiece;
		refreshBoard();

		if (checkGameOver()) {
			return;
		}

		// 사람이 둘 곳이 없으면 자동 패스
		if (!engine.hasAnyValidMove(board, humanPiece)) {
			statusLabel.setText("사람은 둘 곳이 없어 패스합니다.");
			currentTurn = computerPiece;
			refreshBoard();
			handleComputerTurn();
		}
	}

	// 현재 색 기준으로 가능한 위치 목록 구하기
	private List<Position> getValidMoves(Piece piece) {
		List<Position> moves = new ArrayList<>();

		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);
				if (engine.canPlace(board, pos, piece)) {
					moves.add(pos);
				}
			}
		}

		return moves;
	}

	// 보드 화면 갱신
	private void refreshBoard() {
		for (int r = 0; r < Board.SIZE; r++) {
			for (int c = 0; c < Board.SIZE; c++) {
				Position pos = new Position(r, c);
				Piece piece = board.getCell(pos);

				cells[r][c].setText(piece.getSymbol());

				// 현재 차례의 가능한 위치는 * 표시
				if (piece == Piece.EMPTY && engine.canPlace(board, pos, currentTurn)) {
					cells[r][c].setText("*");
				}

				// 사람 차례일 때만 클릭 가능
				boolean enable = currentTurn == humanPiece && piece == Piece.EMPTY
						&& engine.canPlace(board, pos, humanPiece);

				cells[r][c].setEnabled(enable);
			}
		}

		int black = board.countPiece(Piece.BLACK);
		int white = board.countPiece(Piece.WHITE);

		infoLabel.setText("내 돌: " + pieceName(humanPiece) + "    컴퓨터: " + pieceName(computerPiece));
		statusLabel.setText("현재 턴: " + pieceName(currentTurn));
		scoreLabel.setText("BLACK(●): " + black + "   WHITE(○): " + white);
	}

	// 게임 종료 확인
	private boolean checkGameOver() {
		boolean blackCanMove = engine.hasAnyValidMove(board, Piece.BLACK);
		boolean whiteCanMove = engine.hasAnyValidMove(board, Piece.WHITE);

		if (blackCanMove || whiteCanMove) {
			return false;
		}

		int black = board.countPiece(Piece.BLACK);
		int white = board.countPiece(Piece.WHITE);

		String result;
		if (black > white) {
			result = "BLACK 승리";
		} else if (white > black) {
			result = "WHITE 승리";
		} else {
			result = "무승부";
		}

		refreshBoard();

		String myResult;
		if ((humanPiece == Piece.BLACK && black > white) || (humanPiece == Piece.WHITE && white > black)) {
			myResult = "당신의 승리입니다.";
		} else if (black == white) {
			myResult = "비겼습니다.";
		} else {
			myResult = "컴퓨터의 승리입니다.";
		}

		JOptionPane.showMessageDialog(this, "게임 종료\n" + "내 돌: " + pieceName(humanPiece) + "\n" + "BLACK(●): " + black
				+ "\n" + "WHITE(○): " + white + "\n" + result + "\n" + myResult);

		return true;
	}

	// 출력용 이름
	private String pieceName(Piece piece) {
		if (piece == Piece.BLACK) {
			return "BLACK(●)";
		}
		if (piece == Piece.WHITE) {
			return "WHITE(○)";
		}
		return "EMPTY";
	}
}