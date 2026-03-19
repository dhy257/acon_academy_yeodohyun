package 추상클래스;

public class 박세인 extends AcornStudent {

	
	public 박세인() {
		super("박세인");   // 자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
						 // 무조건 부모의 기본생성자를 호출한다. super()
	}
	/*
	public 박세인(String name) {
		super(name);
	}
	*/
	
	@Override
	public void 공부한다() {
		System.out.println("자바 공부한다");
	}

	@Override
	public void 춤추기() {
		System.out.println("춤을 춘다");
		
	}

}
