package myarrays;

public class MyComparatorImp implements MyComparator {

	@Override
	public int compare(Object o1, Object o2) { // o1 => 기준 , o2-> 비교대상
		// 다운캐스팅
		Score s1 = (Score) o1;
		Score s2 = (Score) o2;

		return s1.eng - s2.eng; // 기준점수의 영어가 크면 자리를 교환하겠다 => 영어점수 낮은 순 오름차순이 된다
	}

}
