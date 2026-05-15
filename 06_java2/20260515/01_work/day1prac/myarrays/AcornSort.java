package day1prac.myarrays;

import java.util.Arrays;

public class AcornSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acorn a = new Acorn("T1", "장해든", 20);
		Acorn b = new Acorn("T2", "박세인", 18);
		Acorn c = new Acorn("T3", "김건희", 22);

		Acorn[] list = { a, b, c };

		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * day1prac.myarrays.Acorn cannot be cast to class java.lang.Comparable
		 * (day1prac.myarrays.Acorn is in unnamed module of loader 'app';
		 * java.lang.Comparable is in module java.base of loader 'bootstrap') at
		 * java.base/java.util.ComparableTimSort.countRunAndMakeAscending(
		 * ComparableTimSort.java:320) at
		 * java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188) at
		 * java.base/java.util.Arrays.sort(Arrays.java:1041) at
		 * day1prac.myarrays.AcornSort.main(AcornSort.java:23)
		 */
		// 위의 에러 남
		Arrays.sort(list);

	}

}
