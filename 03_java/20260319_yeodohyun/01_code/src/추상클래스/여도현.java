package 추상클래스;

public abstract class 여도현 extends AcornStudent {

	public 여도현() {
		super("여도현");
		// 자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
		// 무조건 부모의 기본생성자를 호출한다
	}

//	public 여도현(String name) {
//		super(name);
//	}

	@Override
	public void 공부한다() {
		// TODO Auto-generated method stub
//		super.study();
		System.out.println("여도현 공부");
	}

	@Override
	public void 춤추기() {
		// TODO Auto-generated method stub
//		super.dance();
		System.out.println("여도현 춤춤");
	}
}
