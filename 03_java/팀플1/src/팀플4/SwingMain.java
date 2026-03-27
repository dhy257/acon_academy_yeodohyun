package 팀플4;

import javax.swing.SwingUtilities;

public class SwingMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new OthelloFrame();
		});
	}
}