package 추상클래스;

public class 고지연 extends AcornStudent{
	

	
	//생성자
	public 고지연() {
		super("고지연"); 
	}
	
	/*public 고지연2(String name){
	  super name;
	 */
	
	public void 주말() {
		
		System.out.println("주말에는 쉬고싶다");
	}

	@Override
	public void 공부한다() {
		
		System.out.println("자바에서 상속부분을 배우고 있다");
		
	}

	@Override
	public void 춤추기() {
		
		System.out.println("박수치며 춤을춘다");
		
	}

}
