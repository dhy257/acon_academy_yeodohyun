package 업캐스팅다운캐스팅;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 상속관계에서 업캐스팅(upcasting), 다운캐스팅(downcasting) 연습하기

		Cat cat = null; // Cat cat => 변수(참조형변수) Cat: 자료형 type
		// Cat: 자료형 type, 참조형 변수가 가르키는 대상을 해석하는 해석의 도구
		cat = new Cat();

		Dog dog = null;
		dog = new Dog();

//		Cat cat = new Cat();
//		Dog dog = new Dog();

		cat.짖다();
		cat.쥐를잡는다();

		dog.짖다();
		dog.집지키기();
		
		// Animal 상속관계를 가지고 있다면
		// cat, dog 객체로 부모 type 변수에 저장하고 사용할 수 있다.
		Animal a1 = cat; // 업캐스팅, 자동형변환(고양이를 동물이라고 해석하기)
		// a1로 사용하면 cat의 고유기능 사용가능한가??
		a1.짖다(); // cat의 고유기능을 사용할 수 없다(실체가 바뀌지는 않는다, new된 실체인 인스턴스는 안변함)
		
		// 고양이의 고유기능을 사용하고 싶다면
		// Animal로 해석한 것을 다시 자식타입으로 바꿔야함(다운캐스팅)
		
		// 다운캐스팅
		((Cat)a1).쥐를잡는다();
		
//		Cat cat2 = a1; // 오른쪽은 애니멀인데 캣으로 바뀌면 안되잖아
		Cat cat2 = (Cat) a1; // 아니야 그거 캣이야
		cat2.쥐를잡는다();
		cat2.짖다();
	}

}
