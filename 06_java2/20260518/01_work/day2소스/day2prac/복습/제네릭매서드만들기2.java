package day2prac.복습;

public class 제네릭매서드만들기2 {

	// static 제네릭 매서드 만들기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 1) 지네릭매서드 만들기 문제 - String[] strings = {"apple", "banana", "orange", "grape",
		 * "kiwi"}; 에서 "orange"의 위치 반환하는 매서드 만들기 - int[] numbers = {10, 20, 30, 40,
		 * 50}에서 30의 위치를 반환하는 매서드 만들기 - double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5} 에서
		 * 2.2의 위치를 반환하는 매서드 만들기 - 문제1) 위의 매서드를 각 각 만들기 - 문제2) 위의 매서드를 지네릭매서드로 만들기
		 * 
		 * 
		 */

		String[] strings = { "apple", "banana", "orange", "grape", "kiwi" };
		int index = 제네릭매서드만들기2.<String>findIndex(strings, "banana");

		System.out.println(index);

		// int[] numbers = {10, 20, 30, 40, 50};
		// 제네릭매서드만들기2.findIndex(numbers, 20);
		// int -> Integer
		Integer[] numbers = { 10, 20, 30, 40, 50 };
		int index2 = 제네릭매서드만들기2.findIndex(numbers, 20);

		// double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5}
		Double[] numbers2 = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		int index3 = 제네릭매서드만들기2.findIndex(numbers2, 3.3);

		System.out.println(index3);

	}

	// 기능
	// 입력: 배열 , 찾고자 하는 내용
	// 반환 :배열내에서 찾고자 하는 내용의 index반환, 없으면 -1 반환

	// 타입변수에 들어올 수 있는것은 객체 type이어야 한다
	public static <T> int findIndex(T[] arr, T search) {
		int resultIndex = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(search)) {
				resultIndex = i;
				break;
			}
		}

		return resultIndex;

	}

}
