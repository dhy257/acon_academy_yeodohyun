package day3.collection.hashset;
import java.util.*;

class HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("길동",10));
		set.add(new Person("길동",10));

		System.out.println(set);
	}
}


// SET에서 같은 객체로 인식되려면
// equals와 hash코드가 같아야 함 

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name +":"+ age;
	}
}
