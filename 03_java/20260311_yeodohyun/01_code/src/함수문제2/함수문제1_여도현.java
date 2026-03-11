package 함수문제2;

public class 함수문제1_여도현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기

		// 수배열
		int nums[] = new int[] { 1, 2, 3, 4, 5, 6 };

		// 함수 호출
		int result = countEven(nums);

		System.out.println("짝수 개수: " + result);
	}

	// 짝수 개수 반환 함수
	public static int countEven(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) { // 짝수 확인
				count++;
			}
		}

		return count;
	}
}