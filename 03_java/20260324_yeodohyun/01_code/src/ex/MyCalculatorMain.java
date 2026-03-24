package ex;

public class MyCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator cal = new MyCalculator();
		int total = 0;
		try {

			total = cal.add(3, -3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("음수면 다른 처리를 하겠다");
		}

		System.out.println(total);

//		int result = cal.add2(3, -5);
//		System.out.println(result);

	}

}
