package 실습;

public class YDHCalculator implements Calculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("여도현 더하기");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("여도현 빼기");
		return su1-su2;
	}
	
}
