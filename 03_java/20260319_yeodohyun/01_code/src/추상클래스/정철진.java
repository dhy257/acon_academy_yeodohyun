package 추상클래스;

class 정철진 extends AcornStudent{
	/*1. 상속받아서 클래스 만드세요
	  2. 자신의 이름으로 클래스 만들기
	  3. 자신의 고유매서드 추가하기*/
	
	public 정철진() {
		super("정철진");
	}
	
	@Override
	public void 공부한다() {
		System.out.println("추상클래스 공부중");	
	}
	
	@Override
	public void 춤추기() {
		System.out.println("그냥 누워서 쉰다");
	}
	
	public void 밥먹기() {
		System.out.println("점심을 먹는다");
	}
}
