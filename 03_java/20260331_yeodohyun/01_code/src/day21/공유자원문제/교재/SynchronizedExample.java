package day21.공유자원문제.교재;

public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		
		//user1  스레드가  계산기 객체를 사용할 동안 lock을 걸고 사용하기 
		user1Thread.setCalculator(calculator);  //100    100
		user1Thread.start();

		//user2 스레드가 계산기 객체를 사용할 동안   lock을 걸고 사용하기
		User2Thread user2Thread = new User2Thread();  //50  50
		user2Thread.setCalculator(calculator);
		user2Thread.start(); 
		
	}
}

