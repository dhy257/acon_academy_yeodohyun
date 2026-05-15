package day1prac.myarrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		int[] kors = {90,80,55,78};
		String[] names = {"장해든","박세인","김건희"};
		
		Arrays.sort(kors);
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(kors));
		System.out.println(Arrays.toString(names));
	}
}
