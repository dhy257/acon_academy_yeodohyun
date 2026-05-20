package day4prac.builder;

public class Acorn {

	String id;
	String name;
	String address;
	int age;

	// 생성자를 외부에서 사용할 수 없도록 private로 변경
	private Acorn(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.age = builder.age;
	}

	public static Builder build() {
		return new Builder();
	}

	// Builder 클래스 생성 inner 생성
	static class Builder {

		String id;
		String name;
		String address;
		int age;

		Builder id(String id) {
			this.id = id;
			return this;
		}

		Builder name(String name) {
			this.name = name;
			return this;
		}

		Builder address(String address) {
			this.address = address;
			return this;
		}

		Builder age(int age) {
			this.age = age;
			return this;
		}

		Acorn build() {
			return new Acorn(this);
		}
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}