package myarrays;

public class MyArrays {

	// 객체가 정렬의 기준을 구현할 수 있도록 하기
	// MyComparable

	public static void sort(Object[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (((Mycomparable) list[i]).compareTo(list[j]) > 0) {
					
					//
					Object tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
	}

	// 정렬의 기준을 MyComparable 라는 객체가 제공할 수 있도록 하기
	public static void sort(Object[] list, Mycomparator c) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (c.compare(list[i], list[j]) > 0) { // 양수면 교체
					Object tmp;
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
	}
	//

}
