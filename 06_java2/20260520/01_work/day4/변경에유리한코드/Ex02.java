package day4.변경에유리한코드;

public class Ex02 {

	public static void main(String[] args) {
		 
		/* 다형성을 이용하여 부모형으로 다룬다. 변경의 포인트를 확인하자
		 * Dog, Cat을 부모형으로 다룰 수 있도록 한다 */
		
		
		// Dog  -> Cat변경 하기
		
	//	Animal animal = new Dog();
	 	Animal animal = new Cat();
		animal.bark();
				
	//	Animal animal2 = new Dog();
		Animal animal2 = new Cat();	
		animal2.bark();
		 
	 		

	}

}
