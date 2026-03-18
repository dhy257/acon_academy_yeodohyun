package 생성자호출;

public class YDH extends AcornStudent {

	public YDH(String name, int age) {
		super(name, age);

	}

	@Override
	public void 음료마시기() {

		System.out.println("여도현 아샷추 마시고 싶어요");

	}

	public String toString() {
		String result = super.toString();
		return result;
	}

}
