package 추상클래스;
// 추상클래스

// 추상매서드를 하나라도 가지면 추상클래스가 된다
// 객체를 생성할 수 없다.
// 추상클래스는 구현부가 있는 매서드를 포함한다

// 추상매서드 만드는 법: 선언부만 가진다
public abstract class AcornStudent {
	String name;

	public AcornStudent() {

	}

	public AcornStudent(String name) {
		this.name = name;
	}

	public abstract void 공부한다(); // 자식에게 오버라이드 강제

	public abstract void 춤추기(); // 자식에게 오버라이드 강제

	public void 휴식하기() {
		System.out.println("10분씩 휴식하기");
	}

}