package 추상클래스;

public class 나해수 extends AcornStudent{

	public 나해수() {
		super("나해수"); //자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면 무조건 부모의 기본생성자를 호출한다     super()
	}
	/*
	public 나해수(String name) {
		super(name);
	}*/
	
	@Override
	public void 공부한다() {
		System.out.println("상속을 공부한다");
		
	}

	@Override
	public void 춤추기() {
		System.out.println("kpop 춤춘다");
		
	}

	
	
	
}
