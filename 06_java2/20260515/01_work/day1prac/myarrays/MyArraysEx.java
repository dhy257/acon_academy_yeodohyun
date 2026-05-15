package day1prac.myarrays;

import java.util.Arrays;

public class MyArraysEx {
	public static void main(String[] args) {
		Acorn a = new Acorn("T1", "장해든", 20);
		Acorn b = new Acorn("T2", "박세인", 18);
		Acorn c = new Acorn("T3", "김건희", 22);

		Acorn[] list = { a, b, c };

		MyArrays.sort(list); // Acorn이 MyComparable 인터페이스를 구현하여 정렬의 기준을 책임지게 함
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * day1prac.myarrays.Acorn cannot be cast to class
		 * day1.sort.myarrays.MyComparable (day1prac.myarrays.Acorn and
		 * day1.sort.myarrays.MyComparable are in unnamed module of loader 'app') at
		 * day1.sort.myarrays.MyArrays.sort(MyArrays.java:22) at
		 * day1prac.myarrays.MyArraysEx.main(MyArraysEx.java:13)
		 */
		
		System.out.println(Arrays.toString(list));
	}
}
