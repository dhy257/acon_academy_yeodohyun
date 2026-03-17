package 스태틱객체매서드;

import java.util.Random;

public class BMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.매서드1();

		Random r = new Random();
		int result = r.nextInt(100);
		System.out.println(result);
	}

}
