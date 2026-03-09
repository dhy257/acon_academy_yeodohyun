
public class 배열1차원_실수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] arr = new double[5];
		arr[0] = 1.5;
		arr[1] = 2.5;
		arr[2] = 3.5;
		arr[3] = 4.5;
		arr[4] = 5.5;

		// 1.출력
//		System.err.println(arr[0]);
//		System.err.println(arr[1]);
//		System.err.println(arr[2]);
//		System.err.println(arr[3]);
//		System.err.println(arr[4]);

		// 2.반복 출력
		for (int i = 0; i < arr.length; i++)
			System.err.println(arr[i]);
		System.out.println("\n");

//		배열 선언 및 초기화
//		출력
		double[] arr2 = new double[] { 1.5, 2.5, 3.5, 4.5, 5.5 };
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i]);
		System.out.println("\n");

//		배열 선언 및 초기화
//		출력		
		double[] arr3 = { 1.5, 2.5, 3.5, 4.5, 5.5 };
		for (int i = 0; i < arr3.length; i++)
			System.out.print(arr3[i]);
		System.out.println("\n");
	}

}
