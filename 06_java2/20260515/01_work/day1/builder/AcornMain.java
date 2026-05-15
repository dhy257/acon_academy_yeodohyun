package day1.builder;

public class AcornMain {

	public static void main(String[] args) {
		 
		
		Acorn acorn = Acorn.build()
				.id("acorn")
				.pw("1234")
				.build();
		 
		
		System.out.println( acorn);
		
		
		
	 
		}

}
