package 다형성;

public class 매개변수다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Dog dog = new Dog();

		Animal[] arr = new Animal[] { cat, dog };

//		Animal[] arr = new Animal[2];
//		arr[0] = new Cat();
//		arr[1] = new Dog();
		for (int i = 0; i < arr.length; i++) {
			arr[i].짖는다();
		}
		모두짖다(arr);
	}

	public static void 모두짖다(Animal[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].짖는다();
		}
	}
}
