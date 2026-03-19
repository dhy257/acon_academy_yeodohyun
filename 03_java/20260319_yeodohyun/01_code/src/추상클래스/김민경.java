package 추상클래스;

public class 김민경 extends AcornStudent{

	public 김민경() {
		super("김민경");  //자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
						//무조건 부모의 기본 생성자를 호출한다. super()
	}
	
	/*
	public 김민경(String name) {
		super("김민경"); 
	}
	*/
	
	@Override
	public void 공부한다() {
		System.out.println("공부하자..");
		
	}

	@Override
	public void 춤추기() {
		System.out.println("춤추자..");
		
	}

	
	
}
