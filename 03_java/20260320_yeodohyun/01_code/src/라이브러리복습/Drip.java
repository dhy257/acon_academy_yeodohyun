package 라이브러리복습;

public class Drip implements Coffee {

	@Override
	public void extraction(String bean, String temp) {
		// TODO Auto-generated method stub
		System.err.printf("%s %s 드립커피입니다.\n", bean, temp);

	}

//	@Override
//	public void extraction() {
//		// TODO Auto-generated method stub
//		System.out.println("드립커피입니다");
//	}

}
