package day5prac.재귀호출;

public class 최대값구하기재귀 {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 6, 2, 10, 5 };
		int max = findMax(arr, 0, arr.length - 1);
		System.out.println("배열의최대값: " + max);

		int max2 = findMax2(arr);
		System.out.println("배열의최대값: " + max2);
	}

	private static int findMax(int[] arr, int start, int end) {
		if (start == end) {
			// 배열의크기가1인경우
			return arr[start];
		} else {
			// 배열을두부분으로나누어각부분에서최대값을찾음
			int mid = (start + end) / 2;
			int max1 = findMax(arr, start, mid);
			int max2 = findMax(arr, mid + 1, end);
			// 두부분에서찾은최대값중큰값을반환
			return max1 > max2 ? max1 : max2;
		}

	}

	private static int findMax2(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

}