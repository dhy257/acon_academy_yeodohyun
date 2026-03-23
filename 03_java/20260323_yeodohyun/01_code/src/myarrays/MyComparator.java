package myarrays;

public interface Mycomparator {
	// 두 객체를 비교한 후 int값 반환
	// => 양수면 두 객체 교환
	// => 음수면 그대로
	public int compare(Object o1, Object o2);
}
