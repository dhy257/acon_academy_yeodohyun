package 접근제한자;

public class A {

	private int a; // 내 클래스에서 내 멤버들만 사용가능
	public int b; // 어디서든지 접근 가능
	int c; // default (같은 패키지에서 접근 가능, 보인다)
}
