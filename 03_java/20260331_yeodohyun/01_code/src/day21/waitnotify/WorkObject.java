package day21.waitnotify;

public class WorkObject {

	public synchronized void methodA() {
		
		 Thread th  = Thread.currentThread();
		 System.out.println( th.getName() +"methodA    실행" );
		 notify();
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		
		 Thread th  = Thread.currentThread();
		 System.out.println( th.getName() +"methodB    실행" );
		 notify();
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
