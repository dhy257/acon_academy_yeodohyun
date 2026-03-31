package day21.공유자원문제.교재;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}	
			System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
		}
	}	
	
	public void setMemory3(int memory) {		 
		//동기화가 되어 있지않으면  2초가 기다리는동안   머니의 값이 변경되어버려   머니의 내용이 제대로 출력되지않는다
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}	
			System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
		 
	}	
}


