package day4.변경에유리한코드실습;

public class Ex3 {

	public static void main(String[] args) {
		 

		
		 //Animal animal  = new Cat();
		 //Animal animal  = new Dog();   //Dog객체로 변경 
		
		
		
		Animal animal   = getAnimal();		
		animal.bark();
		
		
		Animal animal2   =  getAnimal();		
		animal.bark();
		
		Animal animal3   =  getAnimal();	 
		animal.bark();
		
		
		Animal anima4   =   getAnimal();	
		animal.bark();
		
	}
	
	
	

	private static Animal getAnimal() {		 
		Animal animal = new Cat();
		return animal;
	}
	
	

}
