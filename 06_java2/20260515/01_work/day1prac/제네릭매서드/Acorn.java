package day1prac.제네릭매서드;

public class Acorn {
	String id;
	String name;

	public Acorn(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + "]";
	}

}
