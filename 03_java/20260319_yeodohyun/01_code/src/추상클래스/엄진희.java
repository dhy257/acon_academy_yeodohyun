package 추상클래스;

public class 엄진희 extends AcornStudent {

	//
	public 엄진희() {
		super("엄진희");   // 자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
		                 // 무조건 부모의 기본생성자를 호추한다. super
	}
	
	/*
	public 엄진희(String name) {
		super(name);
	}
	*/
	
	@Override
	public void 공부한다() {
		// TODO Auto-generated method stub
		System.out.println("엄진희는 자바 공부한다");
	}

	@Override
	public void 춤추기() {
		// TODO Auto-generated method stub
		System.out.println("엄진희는 춤을 춘다");
	}
	

}
