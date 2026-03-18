package 다형성;

public class 매개변수다형성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Dog dog = new Dog();

//		cat.짖는다();
//		dog.짖는다();

//		매서드1(cat);
//		매서드2(dog);

		매서드3(cat);
//		매서드3(dog);
	}

	// 매개변수로 Cat type 받음
	public static void 매서드1(Cat cat) {
		cat.짖는다();
		cat.쥐를잡는다();
	}

	// 매개변수로 Dog type 받음
	public static void 매서드2(Dog dog) {
		dog.짖는다();
		dog.집을지킨다();
	}

	// 업캐스팅
	public static void 매서드3(Animal animal) {
		animal.짖는다();
		// instance of 롤 객체 구분
		if (animal instanceof Cat) {
			((Cat) animal).쥐를잡는다();
		} else if (animal instanceof Dog) {
			((Dog) animal).집을지킨다();
		}
	}
}
