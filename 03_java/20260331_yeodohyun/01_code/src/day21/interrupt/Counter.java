package day21.interrupt;

public class Counter  extends Thread{
	@Override
	public void run() {
		
		for( int i=10; i>0; i--) { 
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				
				System.out.println("인터럽트가 들어와서 종료하고 감 ");
				return;
			}
			
			System.out.println( i );
		}
	 
	}

}
