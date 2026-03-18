package 업캐스팅다운캐스팅;

public class 잘못된다운캐스팅 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		Cat cat = new Cat();

		// 부모: Animal
		// 자식: Dog

		// 업캐스팅
		// 다운캐스팅

		// 다운캐스팅 시도
		// 올바른 다운캐스팅인가?
		Cat aa = (Cat) animal;

		aa.쥐를잡는다(); // java.lang.ClassCastException
		// Animal은 태어나길 쥐잡는게 없는데 억지로 다운캐스팅 해서 그럼
		aa.짖다();
	}
}
