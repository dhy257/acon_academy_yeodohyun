package 추상클래스;

public class 조아진 extends AcornStudent{
	
	public 조아진() {
		super("조아진");  // 🌸 자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면
		                    //부모의 기본 생성자를 호출한다. => super()
	}
	
	/*
	public 조아진(String name) {
		super(name);
	}
	*/
	
	@Override
	public void 공부한다() {
		System.out.println("아주 열심히 공부한다");
		
	}
	
	@Override
	public void 춤추기() {
		System.out.println("유행하는 춤을 춘다");
		
	}
	
	public void 펫파크가기() {
		System.out.println("펫파크에서 세린이 친구들을 만나게 해준다");
	}
}
