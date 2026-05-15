package day1prac.myarrays;

// 클래스정의하기 ( 사용자 정의 자료형처럼 인식 => 객체를 만들기 위한 틀 )
public class Acorn implements MyComparable {
	String id;
	String name;
	int age;

	public Acorn() {
		// TODO Auto-generated constructor stub
	}

	public Acorn(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub

		Acorn o = (Acorn) other;

		return this.age - o.age; // 현재객체 => 기준, other => 비교
	}

}
