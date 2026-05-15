package day1prac.오늘의요리사;

//에러나는 이유

// 상속관계에서 자식의 생성자에서는 부모의 생성자(기본생성자 호출)
// 하는 코드가 자동으로 들어감
// >> 부모의 기본생성자가 없어서 그럼
public class DHYCook extends Cook implements 일식가능한{

	public DHYCook(String name) {
		// TODO Auto-generated constructor stub
		// 부모의 기본생성자를 호출하는 코드가 자동으로 들어감
		// super(name);
		// 필요하면 명시적으로 부모의 기본생성자를 호출할 수 있다

		super(name);
		System.out.println("자식 매개변수가 있는 생성자");
		// this.name = name; => 부모값은 부모의 생성자에게 할 수 있도록 함

	}

	@Override
	public String toString() {
		return "DHYCook [name=" + name + "]";
	}

	public static void main(String[] args) {
		DHYCook d = new DHYCook("여도현");
		System.out.println(d);
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "연어초밥";
	}
}
