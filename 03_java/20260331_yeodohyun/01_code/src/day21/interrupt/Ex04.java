package day21.interrupt;

public class Ex04 {

	public static void main(String[] args) {
		
		
		
		Counter4  c  = new Counter4();
		c.start();
		
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		c.interrupt();
		System.out.println("프로그램 종료");

	}

}
