package 업다운캐스팅예제;

public class 김건희 extends AcornStudent {
	String name;
	public 김건희(String name) {
		this.name = name;
	}
	@Override
	public void 공부한다() {
		System.out.println(name + "프론트공부를 한다");
	}
	@Override
	public void 춤추기() {
		System.out.println(name + "그냥 춤추기");
	}
}
