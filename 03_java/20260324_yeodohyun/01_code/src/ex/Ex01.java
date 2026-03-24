package ex;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[3];

		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10; // java.lang.ArrayIndexOutOfBoundsException 발생 >> 정상종료 안됨

		System.out.println("종료");
	}

}
