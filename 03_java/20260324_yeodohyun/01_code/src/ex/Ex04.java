package ex;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// unChecked exception 예외처리 방법: try~catch ~ finally

		try {
			int[] arr = new int[3];

			arr[0] = 10;
			arr[1] = 10;
			arr[2] = 10;
			arr[3] = 10; // java.lang.ArrayIndexOutOfBoundsException 발생 >> 정상종료 안됨
			// Unchecked exception

		} catch (Exception e) {
			// System.out.println(e.getMessage());
			System.out.println("배열의 길이를 넘어감");
		}
		System.out.println("종료");
	}

}
