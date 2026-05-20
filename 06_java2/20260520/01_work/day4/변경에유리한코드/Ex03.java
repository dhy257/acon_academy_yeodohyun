package day4.변경에유리한코드;

public class Ex03 {

	public static void main(String[] args) {
		 
		
		//객체를 직접생성하지 말고 매서드를 통해서 객체를 얻어온다
		//변경의 포인트를 확인하자 
		
		// Dog  -> Cat 으로 변경해야 한다
		
		Animal animal   =  getAnimal();
		animal.bark();
		
		Animal animal2 =  getAnimal();
		animal2.bark();
		
		 

	}

	
	//매서드 한 곳에서만  객체 생성코드가 바뀌면 된다
	private static Animal getAnimal() {		 
		 return new Cat(); 
		// return new Dog();
	}

}
