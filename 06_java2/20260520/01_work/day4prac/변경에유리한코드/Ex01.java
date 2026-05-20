package day4prac.변경에유리한코드;

public class Ex01 {
	public static void main(String[] args) {
		// Dog객체 생성하기
		Animal dog = new Dog();
		// Dog dog = new Dog();
		Animal dog2 = new Dog();
		// Dog dog2 = new Dog();
		
		dog.bark();
		dog2.bark();
		
		// Cat객체 생성하기
		Animal cat = new Cat();
		Animal cat2 = new Cat();
		
		cat.bark();
		cat2.bark();
		
		

	}
}
