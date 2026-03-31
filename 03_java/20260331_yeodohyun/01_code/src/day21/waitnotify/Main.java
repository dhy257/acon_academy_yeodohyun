package day21.waitnotify;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject obj =  new WorkObject();
		
		ThreadA  a = new  ThreadA( obj);
		ThreadB  b = new  ThreadB( obj);
		
		
		a.start();
		b.start();
		

	}

}
