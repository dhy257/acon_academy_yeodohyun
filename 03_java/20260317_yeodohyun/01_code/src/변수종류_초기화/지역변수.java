package 변수종류_초기화;

public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; // 지역변수 - 매서드 안에서 만들어지는 변
		System.out.println(add(5, 3));
	}

	/*
	 * add에서 만든 지역변수는 add호출될 떄 만들어졌다가 리턴될 때 모두 정리됨
	 * 
	 * 
	 * */
	public static int add(int su1, int su2) {
		int total;
		total = su1 + su2;
		return total;
	}
}
