package 상속맛보기_상속;

public class AcornDance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acorn[] list = new Acorn[18];
		list[0] = new YDH();

		for (int i = 0; i < list.length; i++) {
			list[i].dance();
		}
	}

}
