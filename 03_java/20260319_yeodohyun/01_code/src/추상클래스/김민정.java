package 추상클래스;

public class 김민정 extends AcornStudent{
	
	//
	public 김민정() {
		super("김민정"); //자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
					   //무조건 부모의 기본생성자 호출한다. : super()
	}
	
	/*
	public 김민정(String name){
		super(name);
	}
	*/

	@Override
	public void 공부한다() {
		System.out.println("자바를 공부해요");
		
	}

	@Override
	public void 춤추기() {
		System.out.println("춤을 춰요");
	}
	
}
