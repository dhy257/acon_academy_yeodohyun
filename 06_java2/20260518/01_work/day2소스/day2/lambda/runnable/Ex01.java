package day2.lambda.runnable;



public class Ex01 {

	public static void main(String[] args) {
		 
		//1.이름있는 클래스로 구현하기 
		class A  implements MyRunnable{

			@Override
			public void run() {
				System.out.println("실행됨^^  1");				
			}			
		}

		
		A a= new A();
		a.run();
		
		
		//2. 익명으로 구현하기
		MyRunnable r  =  new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행됨  2 ");				
			}};
			
	
			
		r.run();		
		
		
		
		MyRunnable r2 =()-> System.out.println("실행됨 3");
		
		r2.run();
		
		
		
		
	}

}
