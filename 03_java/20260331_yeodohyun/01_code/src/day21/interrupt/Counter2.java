package day21.interrupt;

public class Counter2  extends Thread{
	
	
	@Override
	public void run() {
		 
		int i=10;
		
		// isInterrupted();  // 인터럽트가 된 상태를 반환함 
		//false  => 인터럽트 안 걸림 
		//true   => 인터럽트 걸림 
		
		while( i!=0 &&  !isInterrupted()) {  // 조건이 만족할 동안 반복하겠다 
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//sleep 때문에 상태가 false가 되어버림
				//자다가 깨면 (자는데 인터럽트가 들어와서 깨어남)
				//인터럽트를 초기화 ( false)로 설정함 	
				
				//종료(return )
				//다시 인터럽트 걸기 
				//interrupt();
				interrupt();
				
			}			
			
			System.out.println( i);
			i--;
			 
			//System.out.println( i--); 
			
		}
		
	}

}
