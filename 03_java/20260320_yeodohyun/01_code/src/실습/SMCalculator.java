package 실습;

public class SMCalculator  implements Calculator {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("sm add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("sm sub");
		return su1-su2;
	}

}
