package 다형성;

public class Cat extends Animal {
	public void 쥐를잡는다() {
		System.out.println("쥐잡기");
	}

	// 부모의 매서드 재정의
	@Override
	public void 짖는다() {
		// TODO Auto-generated method stub
//		super.짖는다(); // 부모랑 같은 이름이니까 부모껀 super, 내껀 this
		System.out.println("야옹");

	}
}
