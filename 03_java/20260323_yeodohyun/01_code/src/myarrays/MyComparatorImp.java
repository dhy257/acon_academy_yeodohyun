package myarrays;

public class MyComparatorImp implements Mycomparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// o1 기준

		// Object로 업캐스팅 >> 다운캐스팅 필요
		Score s1 = (Score) o1;
		Score s2 = (Score) o2;
		return s1.eng - s2.eng;
	}

}
