package day1prac.myarrays;

// Arrays.sort(배열정보); -- Comparable
// Arrays.sort(배열정보, Comperator c);

public class Acorn2 implements Comparable<Acorn2> {
	String id;
	String name;
	int age;

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
	public String toString() {
		return "Acorn2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Acorn2(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//
//		Acorn2 a = (Acorn2) o;
//		return this.age - a.age;
//
//	}

	@Override
	public int compareTo(Acorn2 o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}
