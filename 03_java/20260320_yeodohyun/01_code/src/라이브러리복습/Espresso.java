package 라이브러리복습;

public class Espresso implements Coffee{

	@Override
	public void extraction(String bean, String temp) {
		// TODO Auto-generated method stub
		System.err.printf("%s %s 에스프레소입니다.\n", bean, temp);
	}
}
