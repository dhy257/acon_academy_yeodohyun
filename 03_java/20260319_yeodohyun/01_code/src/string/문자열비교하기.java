package string;

import java.util.Arrays;

public class 문자열비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "apple";
		String str2 = "banana";

		// 문자열의 비교 compare(비교대상 문자여ㅏㄹ)
		// 반환: 0
		// 양수 => 기존문자열의 사전상 뒤에 위
		// 음수 => 기준문자열이 사정상 앞에 우치침하
		int result = str1.compareTo(str2); // 기준이 앞에있니? 뒤에 있니?
		System.out.println(result);

		// 문자열 정렬
		// 선택정렬
		String[] arr = { "banana", "apple", "tomato" };
		for (int i = 0; i < arr.length; i++) {
			// 양수인가? => 기준이 크구나
			// 뒤의 요소가 작으면 자리바꿔(오름차순 - 작은게 앞에 오게)
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
