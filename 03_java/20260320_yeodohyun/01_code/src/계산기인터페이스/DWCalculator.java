package 계산기인터페이스;

public class DWCalculator implements Calculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두 수의 제곱근 더하기");
		int result = (su1*su1) + (su2*su2);
		return result;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두 수의 제곱근 빼기");
		int result = (su1*su1) - (su2*su2);
		return result;
	}

}
