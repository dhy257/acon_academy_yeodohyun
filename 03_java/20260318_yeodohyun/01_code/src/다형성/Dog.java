package 다형성;

public class Dog extends Animal {
	public void 집을지킨다() {
		System.out.println("집을 지킴");
	}

	@Override
	public void 짖는다() {
		// TODO Auto-generated method stub
//		super.짖는다();
		System.out.println("멍멍");
	}
}
