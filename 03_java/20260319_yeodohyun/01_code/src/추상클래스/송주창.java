package 추상클래스;

public class 송주창 extends AcornStudent{
	
	public 송주창() {
		super("송주창");	//자식의 생성자에서는 명시적으로 부모의 생성자츨 호출하는 코드가 없으면
						//무조건 부모의 기본생성자를 호출한다.
	}
	
	@Override
	public void 공부한다() {
		System.out.println("송주창은 정보처리기사 실기 공부를 한다.");
	}

	@Override
	public void 춤추기() {
		System.out.println("송주창은 막춤을 춘다.");
	}
	
	
}
