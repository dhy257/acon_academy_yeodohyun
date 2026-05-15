package day1prac.myarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Acorn2정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Acorn2 a = new Acorn2("T1", "장해든", 20);
		Acorn2 b = new Acorn2("T2", "박세인", 18);
		Acorn2 c = new Acorn2("T3", "김건희", 22);

		Acorn2[] list = { a, b, c };

		Arrays.sort(list);
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * day1prac.myarrays.Acorn2 cannot be cast to class java.lang.Comparable
		 * (day1prac.myarrays.Acorn2 is in unnamed module of loader 'app';
		 * java.lang.Comparable is in module java.base of loader 'bootstrap') at
		 * java.base/java.util.ComparableTimSort.countRunAndMakeAscending(
		 * ComparableTimSort.java:320) at
		 * java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188) at
		 * java.base/java.util.Arrays.sort(Arrays.java:1041) at
		 * day1prac.myarrays.Acorn2정렬하기.main(Acorn2정렬하기.java:17)
		 */

		// Acorn2 => Comparable 구현
		System.out.println(Arrays.toString(list));

		Arrays.sort(list, new Comparator<Acorn2>() {

			public int compare(Acorn2 o1, Acorn2 o2) {
				return o1.name.compareTo(o2.name);

			}
		});

		System.out.println(Arrays.toString(list));

		Arrays.sort(list, new A());
		System.out.println(Arrays.toString(list));
		
		
	}

}
