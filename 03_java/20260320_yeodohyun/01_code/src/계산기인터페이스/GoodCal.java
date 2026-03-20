package 계산기인터페이스;

public class GoodCal implements Calculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println("계산기 덧셈");
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("계산기 뺄셈");
		return su1 - su2;
	}

}
