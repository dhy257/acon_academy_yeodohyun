package 추상클래스;

public class 김건희 extends AcornStudent {
	public 김건희() {
		super("김건희");
	}
//	public 김건희(String name) {
//		this.name = name;
//	}
	@Override
	public void 공부한다() {
		System.out.println("프론트공부를 한다");
	}
	@Override
	public void 춤추기() {
		System.out.println("그냥 춤추기");
	}
	
	public void 운동() {
		System.out.println("러닝");
	}
}
