package day2.lambda.runnable;

public class MyRunnableImpl_Sample extends Thread implements MyRunnable{

	@Override
	public void run() {
		try {

			System.out.println("로딩중..");
			Thread.sleep(2000);
			System.out.println("hi!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
