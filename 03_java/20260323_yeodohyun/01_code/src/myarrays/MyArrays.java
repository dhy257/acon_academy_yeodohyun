package myarrays;

public class MyArrays {

	// 객체가 정렬의 기준을 구현할 수 있도록 하기
	// MyComparable

	public static void sort(Object[] list) {

		for (int i = 0; i < list.length - 1; i++) {

			//
			for (int j = i + 1; j < list.length; j++) {

				if (((MyComparable) list[i]).compareTo(list[j]) > 0) { // 기준이 크면, 양수가 전달 되었음

					//
					Object tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;

				}
			}
		}

	}

	// 정렬의 기준을 MyComparator 라는 객체가 제공할 수 있도록 하기
	public static void sort(Object[] list, MyComparator c) {

		for (int i = 0; i < list.length - 1; i++) {

			//

			for (int j = i + 1; j < list.length; j++) {

				if (c.compare(list[i], list[j]) > 0) { // 두 객체를 교환하시오
					Object tmp;
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;

				}
			}
		}

	}

}
