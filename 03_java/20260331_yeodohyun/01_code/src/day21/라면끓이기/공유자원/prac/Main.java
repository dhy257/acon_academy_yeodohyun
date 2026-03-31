package day21.라면끓이기.공유자원.prac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		라면 ramen = new 라면();

		Thread t1 = new Thread(new 라면끓이기(ramen), "김재민");
		Thread t2 = new Thread(new 라면끓이기(ramen), "엄진희");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
