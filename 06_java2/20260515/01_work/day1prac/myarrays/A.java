package day1prac.myarrays;

import java.util.Comparator;

public class A   implements Comparator<Acorn2>{

	@Override
	public int compare(Acorn2 o1, Acorn2 o2) {
		// TODO Auto-generated method stub
		return  o1.id.compareTo( o2.id);
	}

}
