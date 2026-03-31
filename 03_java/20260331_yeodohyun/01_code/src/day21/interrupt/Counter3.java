package day21.interrupt;

public class Counter3  extends Thread{
	
	
	@Override
	public void run() {		 
		
		for( int i=10; i>0; i--) {
			System.out.println( "인터럽트 상태="+ isInterrupted());
			
			if( isInterrupted()) {  //isInterrupted()  => ture or false 
				                    //true => 외부에서 신호가 옴 
				                    //false => 외부에서 신호가 없음				
				System.out.println("인터럽트 발생하여 종료하겠음");
				System.out.println("작업을 수행한다");
				return;
				
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//interrupt();
				
				System.out.println("작업을 수행한다");
				return;
				
				
			}
			System.out.println( i);
		}
	}

}
