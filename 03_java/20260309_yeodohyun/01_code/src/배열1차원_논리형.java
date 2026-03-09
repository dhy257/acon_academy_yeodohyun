
public class 배열1차원_논리형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리형 변수 5개 만들고 출력
		boolean a = true;
		boolean b = true;
		boolean c = true;
		boolean d = false;
		boolean e = true;

		// 배열로 만들고 출력

		boolean[] arr = new boolean[5]; // boolean의 기본값은 false
		for (int i = 0; i < arr.length; i++)
			System.err.println(arr[i]);
		System.out.println("\n");

//		boolean f; // 변수는 초기화를 개발자가 직접해야함
//		System.err.println(f); // 따라서 에러남

		boolean[] arr2 = new boolean[] { true, true, true, false, false };
		boolean[] arr3 = { true, true, true, false, false };
		for (int i = 0; i < arr3.length; i++)
			System.err.println(arr3[i]);

	}

}
