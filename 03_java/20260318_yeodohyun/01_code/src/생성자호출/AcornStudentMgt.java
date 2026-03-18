package 생성자호출;

public class AcornStudentMgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AcornStudent[] list = new AcornStudent[18];

		list[0] = new YDH("여도현", 26);

		list[0].음료마시기();
	}

}
