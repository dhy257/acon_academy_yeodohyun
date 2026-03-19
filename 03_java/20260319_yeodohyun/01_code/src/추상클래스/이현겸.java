package 추상클래스;

public class 이현겸 extends AcornStudent {
	
	public 이현겸() {
		super("이현겸");
	}
	
	// 자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
	// 무조건 부모의 기본 생성자를 호출한다. super()
	
//	public 이현겸(String name) {
//		super(name);
//	}

	@Override
	public void 공부한다() {
		
		System.out.println("이현겸은 공부를 시작했다");
		
	}
	
	@Override
	public void 춤추기() {
		
		System.out.println("이현겸은 춤을 추기 시작했다");
		
	}
	
}
