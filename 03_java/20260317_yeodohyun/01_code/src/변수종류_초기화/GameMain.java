package 변수종류_초기화;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = new Game("Tetris",5000);
		Game game2 = new Game("Puyo Puyo",10000);
		Game game3 = new Game();
		
		System.out.println(game1.toString());
		System.out.println(game2.toString());

		System.out.println(Game.cnt);
		Game.printCount();
	}

}
