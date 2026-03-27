package 팀플3;

import javax.swing.SwingUtilities;

public class SwingMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new OthelloFrame();
		});
	}
}