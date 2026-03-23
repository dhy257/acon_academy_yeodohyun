package 선택정렬;

public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 95, 75, 85, 100, 50 };

		//
		// arr[0] = arr[1]; 이렇게 하면 arr[0]이 소실되기 때문에 안됨
//		int tmp;
//		tmp = arr[0];
//		arr[0]=arr[1];
//		arr[1]=tmp;

		for (int su : arr) {
			System.out.print(su + " ");
		}
		System.out.println();

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) { // 기준
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 기준이 크면
					int tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int su : arr) {
			System.out.print(su + " ");
		}

	}

}
