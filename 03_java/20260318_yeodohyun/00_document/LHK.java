package javaprj.day12.맛있는다형성;

public class LHK extends AcornStudent {

	public LHK(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	public void 음료마시기() {
		
		System.out.println("현겸이는... 아샷추가 먹고싶읍니다");
		
	}
	
	public String toString() {
		String result = super.toString();
		return result;
	}
	
}
