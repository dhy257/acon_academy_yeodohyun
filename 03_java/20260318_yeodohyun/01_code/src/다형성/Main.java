package 다형성;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Cat();
		Animal a2 = new Dog();

		Animal[] arr = new Animal[2];
		arr[0] = new Cat();
		arr[1] = new Dog();

		// animal 짖어라 (오버라이드 안햇을때)
		for (int i = 0; i < arr.length; i++) {
			arr[i].짖는다(); // 동물은 짖는다
		}

		// 동물마다 따로 짖게 하고 싶음
		// Animal 타입(동일타입) => 짖어 라는 매서드 호출 시 다르게 동작하게 하기
		for (int i = 0; i < arr.length; i++) {
			arr[i].짖는다(); // 동물은 짖는다
		}
		// 1. 상속 ok
		// 2. 부모의 매서드를 재정의하기 (재정의한다고 사라지는게 아님)
		// 부모의 짖는다 도 있고 자식의 재정의한 짖는다 도 존재함
		// 오버라이드한 매서드에 한에서 부모로 다뤄도, 자식의 오버라이드한 매서드가 우선권 가짐
		// 재정의가 더 순위가 높음

	}

}
