package arraylist;

// ArrayList 의 raw 버전(no generic) 흉내냄
public class OList {

	// 어떤거든 담아내게 Object배열 준비
	private Object[] nums;
	private int current;

	public OList() {
		nums = new Object[3];
		current = 0;
	}

	public int size() {
		return current;
	}

	public void add(Object obj) {

		//
		nums[current] = obj;
		current++;

	}

	public void clear() {
		// current 초기화
		current = 0;
		// nums= new int[3];
	}

	public Object get(int index) {

		return nums[index];

	}

}
