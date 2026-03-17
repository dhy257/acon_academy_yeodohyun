package 상속맛보기_상속;


// 상속받은 부모의 매서드 재정의하기
// 부모로 다뤄도 자식의 오버라이드한 매서드가 우선권을 가짐
public class YDH extends Acorn {
	@Override
	public void dance() {
		System.out.println("하회탈춤을 춘다");
	}
}
