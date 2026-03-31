package day21.interrupt;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter3 c = new Counter3();
		c.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		c.interrupt();// c쓰레드에 신호보내기 
		System.out.println( "프로그램 종료");

	}

}
