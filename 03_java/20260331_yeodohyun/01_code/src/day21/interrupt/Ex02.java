package day21.interrupt;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Counter2  c= new Counter2();
		c.start();
		
		System.out.println( c.isInterrupted());   //false 
		
		
		//		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		//신호주기 C쓰레드에게 
		c.interrupt();
		System.out.println( c.isInterrupted());   // true
		
		
		
		
		
		System.out.println("프로그램 종료 !!!");
		
		
	}

}
