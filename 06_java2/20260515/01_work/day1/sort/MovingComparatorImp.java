package day1.sort;

import java.util.Comparator;

public class MovingComparatorImp  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		
		Moving m1 = (Moving) o1;
		Moving m2  = (Moving) o2;
		return m1.code.compareTo( m2.code);
	}

}
