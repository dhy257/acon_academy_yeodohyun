package javaprj.day12.다형성;

public class 매개변수다형성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();		
		//cat.짖는다();
		매서드1( cat);
		
		Dog dog = new Dog();		
		//dog.짖는다();
		매서드2( dog); 
		
		//매서드1(dog);  불가

	} 
	
	
	public static void  매서드1( Cat  cat) {  //매개변수로 Cat type을 받는다		
		cat.짖는다();
		cat.쥐를잡는다();
	}	 
	
	public static void  매서드2( Dog dog) { //매개변수로 Dog type을 받는다		
		dog.짖는다();
		dog.집을지킨다();
	}
	
	
	public static void 매서드3( Animal  animal) {
		animal.짖는다();
		
	}
	
	
}
